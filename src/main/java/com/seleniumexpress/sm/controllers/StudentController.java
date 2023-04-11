package com.seleniumexpress.sm.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.seleniumexpress.sm.api.Student;
import com.seleniumexpress.sm.api.StudentDTO;
import com.seleniumexpress.sm.service.StudentService;

@Controller
public class StudentController implements WebMvcConfigurer
{
 
    @Autowired
    private StudentService studentService;
	
	@GetMapping("/showStudent")
	public String showStudentList(Model model)
	{
	  List<Student> studentList=studentService.loadStudents();
	  
	  model.addAttribute("students", studentList);
	  return "student-list";
	}
	
	
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model)
	{
	    StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("student",studentDTO);	
	    return "add-student";
	}
	
	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentDTO)
	{
		Student student = new Student();
		BeanUtils.copyProperties(studentDTO,student);
		
		if(student.getId()==0)
		{
			studentService.saveStudent(student);
		}
		else
		{
			studentService.update(student);
		}
		
		
	    return "redirect:/showStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId")int id,Model model)
	{
	
		Student oldstudent =studentService.getStudent(id);
		// this oldstudent is the student objet we got from service layer
		StudentDTO student= new StudentDTO();
		BeanUtils.copyProperties(oldstudent,student);
		// the name of the model attribute and the dto which we are transfering should be same
		model.addAttribute("student",student);	
	    return "add-student";	
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId")int id,Model model)
	{
	    studentService.deleteStudent(id);
	    return "redirect:/showStudent";	
	}
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
	   registry.addResourceHandler("/URLToReachResourcesFolder/**").addResourceLocations("/resources/");
	}
	
	
	
}
