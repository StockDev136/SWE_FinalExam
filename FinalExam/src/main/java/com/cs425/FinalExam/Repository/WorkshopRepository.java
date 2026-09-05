package com.cs425.FinalExam.Repository;

import com.cs425.FinalExam.Entity.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop,Long> {}

