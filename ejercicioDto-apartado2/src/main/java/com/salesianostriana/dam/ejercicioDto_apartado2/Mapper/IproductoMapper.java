package com.salesianostriana.dam.ejercicioDto_apartado2.Mapper;

import com.salesianostriana.dam.ejercicioDto_apartado2.Dto.ProductoDto;
import com.salesianostriana.dam.ejercicioDto_apartado2.Models.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IproductoMapper {
    ProductoDto todto (Producto producto);
    Producto toEntity (ProductoDto productoDto);
}
