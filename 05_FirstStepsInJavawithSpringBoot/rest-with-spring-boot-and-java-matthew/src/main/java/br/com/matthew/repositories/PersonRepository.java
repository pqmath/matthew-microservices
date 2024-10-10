package br.com.matthew.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matthew.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
