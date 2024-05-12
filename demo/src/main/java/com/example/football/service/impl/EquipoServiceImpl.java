package com.example.football.service.impl;

import com.example.football.model.Equipo;
import com.example.football.repository.EquipoRepository;
import com.example.football.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServiceImpl implements EquipoService {

    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoServiceImpl(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    @Override
    public Equipo saveEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public Optional<Equipo> findById(Long id) {
        return equipoRepository.findById(id);
    }

    @Override
    public List<Equipo> findAll() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo updateEquipo(Equipo equipo) {
        return equipoRepository.save(equipo); // JPA save method works for both save and update
    }

    @Override
    public void deleteById(Long id) {
        equipoRepository.deleteById(id);
    }

    @Override
    public List<Equipo> findByNombreContainingIgnoreCase(String nombre) {
        return equipoRepository.findByNombreContainingIgnoreCase(nombre);
    }
}