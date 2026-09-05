package com.cs425.FinalExam.Dto;

import jakarta.persistence.PrePersist;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterDto {
    private String studentId;
    private String studentName;
    private String studentEmail;
    //private LocalDate registerDate;
}
