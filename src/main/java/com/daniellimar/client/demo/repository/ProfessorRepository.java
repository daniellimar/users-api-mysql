package com.daniellimar.client.demo.repository;

import com.daniellimar.client.demo.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
