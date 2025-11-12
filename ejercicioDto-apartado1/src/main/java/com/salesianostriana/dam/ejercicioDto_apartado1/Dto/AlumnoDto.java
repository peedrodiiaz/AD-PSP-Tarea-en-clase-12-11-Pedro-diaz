package com.salesianostriana.dam.ejercicioDto_apartado1.Dto;

import com.salesianostriana.dam.ejercicioDto_apartado1.Model.Curso;
import com.salesianostriana.dam.ejercicioDto_apartado1.Model.Direccion;

public record AlumnoDto( String nombre, String apellido1, String apellido2,
                        int telefono, String email, Direccion direccion, Curso curso
                         ) {}