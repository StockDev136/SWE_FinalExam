package com.cs425.FinalExam.Repository;

import com.cs425.FinalExam.Entity.Register;
import com.cs425.FinalExam.Entity.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long>{
    int getCountByWorkshopId(Long workshopId);
}