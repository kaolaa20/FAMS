package com.example.fams.repositories;

import com.example.fams.models.ClassUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassUserRepository  extends JpaRepository<ClassUser,Long> {
}
