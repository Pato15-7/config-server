package com.todocodeacademy.cities_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
        private Long id;
        private String nombre;
        private int cantEstrellas;
        private Long idCiudad;
}
