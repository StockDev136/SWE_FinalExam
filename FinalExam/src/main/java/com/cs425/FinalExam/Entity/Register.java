package com.cs425.FinalExam.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long registerId;
    private String studentId;
    private String studentName;
    private String studentEmail;
    private LocalDate registerDate = LocalDate.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workshop_id")
    private Workshop workshop;
}