package com.IMS.IMS.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IMS.IMS.Models.Subject;
import com.IMS.IMS.Models.Trainer;
import com.IMS.IMS.Repository.SubjectRepository;
import com.IMS.IMS.Repository.TrainerRepository;

@Service
public class TrainerServices {

	@Autowired
	private TrainerRepository trainerRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;

	
	                                                       //add trainer code
	public  Trainer addtrainer(Trainer trainer) {
		List<Subject> subjects = trainer.getSubject().stream()
                .map(s -> subjectRepository.findById(s.getSubject_id())
                        .orElseThrow(() -> new RuntimeException("Subject not found with id " + s.getSubject_id())))
                .toList();
		trainer.setSubject(subjects);
		return trainerRepository.save(trainer);
	}


	public List<Trainer> getAlltrainers() {
		
		return trainerRepository.findAll();
	}


	public void deleteTrainer(int id) {
		trainerRepository.deleteById(id);
		return;
		
	}


	public Optional<Trainer> gettrainer(int id) {
		
		return trainerRepository.findById(id);
	}
}
