package com.cognizant.hibernatemappingsdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.hibernatemappingsdemo.model.Skill;
import com.cognizant.hibernatemappingsdemo.repository.SkillRepository;

import jakarta.transaction.Transactional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repository;

    @Transactional
    public List<Skill> getAllSkills(){

        return repository.findAll();

    }

    @Transactional
    public Skill getSkill(int id){

        return repository.findById(id).orElse(null);

    }

}