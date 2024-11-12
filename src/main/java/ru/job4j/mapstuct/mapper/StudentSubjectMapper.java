package ru.job4j.mapstuct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.job4j.mapstuct.dto.StudentSubjectDto;
import ru.job4j.mapstuct.model.StudentEntity;

@Mapper
public interface StudentSubjectMapper {
    @Mapping(target = "className", source = "classVal")
    @Mapping(target = "subject", source = "name")
    StudentSubjectDto getModelFromEntity(StudentEntity studentEntity);
}
