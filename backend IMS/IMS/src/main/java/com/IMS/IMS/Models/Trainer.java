package com.IMS.IMS.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Trainer {
		
	          @Id
	          @GeneratedValue(strategy = GenerationType.IDENTITY)
	          private int trainer_id;
	          
	          private String trainer_name;
	          
	          @ManyToMany
	          @JoinTable(
	        		  name="trainers_with_subject",
	        		  joinColumns=@JoinColumn(name="trainer_id"),
	        		  inverseJoinColumns = @JoinColumn(name="subject_id")
	        		  )
	          @JsonIgnoreProperties("trainer")
	          private List<Subject> subject;
	          
	         
}
