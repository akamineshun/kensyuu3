package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.model.Person;

public interface  PersonRepository extends JpaRepository<Person,Long>{

}