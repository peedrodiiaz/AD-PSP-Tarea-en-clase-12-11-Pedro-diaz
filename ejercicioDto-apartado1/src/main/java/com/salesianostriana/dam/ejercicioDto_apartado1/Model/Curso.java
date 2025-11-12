package com.salesianostriana.dam.ejercicioDto_apartado1.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Curso {
    private Long id;
    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;

}
