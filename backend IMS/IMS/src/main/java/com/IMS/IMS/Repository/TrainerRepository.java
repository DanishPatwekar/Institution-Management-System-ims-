package com.IMS.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IMS.IMS.Models.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}
