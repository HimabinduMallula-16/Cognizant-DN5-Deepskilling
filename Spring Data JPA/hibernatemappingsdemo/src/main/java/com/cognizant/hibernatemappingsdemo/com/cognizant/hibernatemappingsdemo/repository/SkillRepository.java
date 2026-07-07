package com.cognizant.hibernatemappingsdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.hibernatemappingsdemo.model.Skill;

@Repository
public interface SkillRepository
        extends JpaRepository<Skill,Integer>{

}