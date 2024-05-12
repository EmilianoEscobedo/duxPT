package com.example.football.service;

import com.example.football.model.Equipo;

import java.util.List;
import java.util.Optional;

public interface EquipoService {
    Equipo saveEquipo(Equipo equipo);
    Optional<Equipo> findById(Long id);
    List<Equipo> findAll();
    Equipo updateEquipo(Equipo equipo);
    void deleteById(Long id);
    List<Equipo> findByNombreContainingIgnoreCase(String nombre);
}