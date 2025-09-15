package com.IMS.IMS.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IMS.IMS.Models.Trainer;
import com.IMS.IMS.Services.TrainerServices;

@RestController
public class TrainerController {
	
	@Autowired
	private TrainerServices traierServices;
	
	@PostMapping("/trainer")
	public Trainer addtrainer(@RequestBody Trainer trainer) {
		return traierServices.addtrainer(trainer);
	}
	
	@GetMapping("/trainers")
	public List<Trainer> getAlltrainers(){
		return traierServices.getAlltrainers();
	}
	
	@GetMapping("/trainer/{id}")
	public Optional<Trainer> gettrainer(@PathVariable("id") int id) {
		return traierServices.gettrainer(id);
	}
	
	@DeleteMapping("/delete/{id}")//
	public String deleteTrainer(@PathVariable("id") int id) {
		traierServices.deleteTrainer(id);
		return "Trainer with id " + id + " deleted successfully";
	}
	
}
