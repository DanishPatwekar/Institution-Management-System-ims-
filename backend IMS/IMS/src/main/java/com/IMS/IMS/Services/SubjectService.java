package com.IMS.IMS.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IMS.IMS.Models.Subject;
import com.IMS.IMS.Repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;

	public Subject addsubject(Subject sub) {
		return subjectRepository.save(sub);
	}

	public List<Subject> getallsubject() {
		
		return subjectRepository.findAll();
	}

	public Optional<Subject> getsubject(int id) {
		
		return subjectRepository.findById(id);
	}

}
