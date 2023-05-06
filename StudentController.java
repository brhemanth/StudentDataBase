package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/addStudent")
public String addStudent() {
	return "details.jsp";
}
	@RequestMapping("saveStudent")
	public String saveStudent(Student s) {
		repo.save(s);
		return "details.jsp";
	}
	@RequestMapping("showStudent")
	public String showStudent(HttpSession h,Integer sid)
	{
		Student s=repo.findById(sid).orElse(null);
		h.setAttribute("details", s);
		return "view.jsp";
	}
	@RequestMapping("deleteStudent12")
	public String deleteStudent(HttpSession h,Integer sid) {
		Student student=repo.findById(sid).orElse(null);
		if(student!=null) {
			h.setAttribute("message", "Student ID with "+sid+" Deleted succesfully");
		repo.deleteById(sid);
	
		}
		else {
			h.setAttribute("message", "Student ID with "+sid+" invalid");	
					
		}
		return "conform.jsp";
	}
	
	
	
	@RequestMapping("showByEmail")
	public String show(HttpSession h,String email) {
		
		List<Student> l=repo.findByEmail(email);
		System.out.println(l);
		return "repo.findByEmail()";
	}
	
	
	
	
	
	@RequestMapping("showByPhNo")
	@ResponseBody
	public String show() {
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
