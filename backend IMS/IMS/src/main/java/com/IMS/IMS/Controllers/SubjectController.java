package com.IMS.IMS.Controllers;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IMS.IMS.Models.Subject;
import com.IMS.IMS.Services.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@PostMapping("/subject")
	public Subject addsubject(@RequestBody Subject sub){
		return subjectService.addsubject(sub);
	}
	@GetMapping("/subjects")
	public List<Subject> getallsubject(){
		return subjectService.getallsubject();
	}
	
	@GetMapping("/subject/{id}")
	public Optional<Subject> getsubject(@PathVariable("id") int id){
		return subjectService.getsubject(id);
	}

}
