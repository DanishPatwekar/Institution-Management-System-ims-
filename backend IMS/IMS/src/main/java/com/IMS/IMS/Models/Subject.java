package com.IMS.IMS.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Subject {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subject_id;
	private String subject;
	
	@ManyToMany(mappedBy = "subject")
	@JsonIgnoreProperties("subject")
	private List<Trainer> trainer;
	
	
	

}