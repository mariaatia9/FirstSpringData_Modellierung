/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.repository;

import com.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author trainer
 */
public interface PersonRepository extends JpaRepository<Person, String> {
    
}
