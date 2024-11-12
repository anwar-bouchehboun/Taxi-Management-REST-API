package com.YC.RidePilot.entity.mapper;

import com.YC.RidePilot.entity.Chauffeur;
import com.YC.RidePilot.entity.dto.ChauffeurDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChauffeurMapper {
    
    ChauffeurMapper INSTANCE = Mappers.getMapper(ChauffeurMapper.class);

    @Mapping(target = "vehicule", ignore = true)
    Chauffeur toEntity(ChauffeurDto chauffeurDto);

    ChauffeurDto toDto(Chauffeur chauffeur);
}
