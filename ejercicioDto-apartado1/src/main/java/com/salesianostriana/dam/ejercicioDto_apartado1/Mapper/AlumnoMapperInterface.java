package com.salesianostriana.dam.ejercicioDto_apartado1.Mapper;

import com.salesianostriana.dam.ejercicioDto_apartado1.Dto.AlumnoDto;
import com.salesianostriana.dam.ejercicioDto_apartado1.Model.Alumno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper (componentModel = "spring")
public interface AlumnoMapperInterface {

    @Mapping(source = "numero", target = "telefono")
    AlumnoDto toDto (Alumno A);

    @InheritInverseConfiguration
    Alumno toEntity (AlumnoDto aDto);
}
