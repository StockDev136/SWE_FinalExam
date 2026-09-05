package com.cs425.FinalExam.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Workshop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long workshopId;

    private String title;
    private String description;
    private LocalDate workshopDate;
    private LocalTime workshopTime;
    private String venue;
    private int capacity;
    private  LocalDate registeredDeadline;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "workshop_id")
    private List<Register> register;


}
