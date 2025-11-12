package com.salesianostriana.dam.ejercicioDto_apartado2.Mapper;

import com.salesianostriana.dam.ejercicioDto_apartado2.Dto.ProductoDto;
import com.salesianostriana.dam.ejercicioDto_apartado2.Models.Producto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ProductoMapper {

public ProductoDto toDto(Producto p) {
       return new ProductoDto(
                p.getNombre(),
                p.getPvp(),
                p.getDescuento(),
                p.getImagenes(),
                p.getCategoria()
       );
    }

    public Producto fromDto(ProductoDto dto) {
        return Producto.builder()
                .nombre(dto.nombre())
                .pvp(dto.pvp())
                .descuento(dto.descuento())
                .imagenes(dto.imagenes())
                .categoria(dto.Categoria())
                .build();

    }

}
