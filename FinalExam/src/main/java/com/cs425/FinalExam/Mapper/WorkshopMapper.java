package com.cs425.FinalExam.Mapper;

import com.cs425.FinalExam.Dto.WorkshopDto;
import com.cs425.FinalExam.Entity.Workshop;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkshopMapper {
    WorkshopDto toDto(Workshop workshop);
    List<WorkshopDto> toDto(List<Workshop> workshops);
    Workshop toEntity(WorkshopDto workshopDto);
}
