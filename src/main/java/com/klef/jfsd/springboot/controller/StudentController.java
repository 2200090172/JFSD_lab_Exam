package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class StudentController 
{
	@Autowired
	private StudentService service;
	
	@ResponseBody
	@GetMapping("/")
	public String home()
	{
		return "Rest API with JPA";
	}
	
	
	
	 
	@PostMapping("addstudent")
	public ModelAndView addstudent(HttpServletRequest request) {
	    String name = request.getParameter("sname");
	    String gender = request.getParameter("sgender");
	    String dept = request.getParameter("sdept");
	    String email = request.getParameter("semail");
	    String contact = request.getParameter("scontact"); // Corrected parameter name

	    // Log the values for debugging
	    System.out.println("Name: " + name);
	    System.out.println("Gender: " + gender);
	    System.out.println("Department: " + dept);
	    System.out.println("Email: " + email);
	    System.out.println("Contact: " + contact); // Log the contact value

	    // Ensure contact is not null
	    if (contact == null || contact.isEmpty()) {
	        throw new IllegalArgumentException("Contact cannot be null or empty");
	    }

	    Student st = new Student();
	    st.setName(name);
	    st.setGender(gender);
	    st.setDepartment(dept);
	    st.setEmail(email);
	    st.setContact(contact);

	    String msg = service.addstudent(st);

	    ModelAndView mv = new ModelAndView("regsuccess");
	    mv.addObject("message", msg);
	    
	    return mv;
	}

	
	
	
	
	@GetMapping("viewall")
    public ModelAndView viewallemps()
    {
      ModelAndView mv = new ModelAndView();
      List<Student> studentlist = service.viewallstudents();
      mv.setViewName("viewallstudents");
      mv.addObject("studentlist",studentlist);
//      long count=adminService.empcount();
//      mv.addObject("empcount",count);
      return mv;
    }
	
	
	
	
}
