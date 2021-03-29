package com.calculadorametroscuadrados.calculadorametroscuadrados.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Casa
{
    private String nombre;
    private String direccion;
    private ArrayList<Habitacion> habitaciones;
}
