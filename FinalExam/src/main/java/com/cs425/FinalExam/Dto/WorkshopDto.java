package com.cs425.FinalExam.Dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkshopDto {
    private String title;
    private String description;
    private LocalDate workshopDate;
    private LocalTime workshopTime;
    private String venue;
    private int capacity;
    private LocalDate registeredDeadline;

}
