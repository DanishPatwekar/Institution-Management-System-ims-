package com.IMS.IMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.IMS.IMS.Models.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
