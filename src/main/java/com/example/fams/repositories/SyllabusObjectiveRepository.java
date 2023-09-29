package com.example.fams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyllabusObjectiveRepository extends JpaRepository<SyllabusObjective, long> {
}
