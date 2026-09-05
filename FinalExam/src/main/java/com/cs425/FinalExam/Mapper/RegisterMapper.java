package com.cs425.FinalExam.Mapper;

import com.cs425.FinalExam.Dto.RegisterDto;
import com.cs425.FinalExam.Entity.Register;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegisterMapper {
    RegisterDto toDto(Register register);
    Register toEntity(RegisterDto registerDto);
    List<RegisterDto> toDto(List<Register> registers);
}
