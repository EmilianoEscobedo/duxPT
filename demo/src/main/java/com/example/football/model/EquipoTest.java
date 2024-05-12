package com.example.football.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquipoTest {

    private Equipo equipo;

    @BeforeEach
    void iniciar() {
        equipo = new Equipo();
    }

    @Test
    void probarSetYGetId_CuandoSeInvoca_EntoncesElIdSeEstableceYSeRetornaCorrectamente() {
        // Preparación
        Long idEsperado = 42L;

        // Acción
        equipo.setId(idEsperado);
        Long idActual = equipo.getId();

        // Verificación
        assertEquals(idEsperado, idActual, "El ID debería establecerse y retornarse correctamente.");
    }

    @Test
    void probarSetYGetNombre_CuandoSeInvoca_EntoncesElNombreSeEstableceYSeRetornaCorrectamente() {
        // Preparación
        String nombreEsperado = "Real Madrid";

        // Acción
        equipo.setNombre(nombreEsperado);
        String nombreActual = equipo.getNombre();

        // Verificación
        assertEquals(nombreEsperado, nombreActual, "El nombre debería establecerse y retornarse correctamente.");
    }

    @Test
    void probarSetYGetLiga_CuandoSeInvoca_EntoncesLaLigaSeEstableceYSeRetornaCorrectamente() {
        // Preparación
        String ligaEsperada = "La Liga";

        // Acción
        equipo.setLiga(ligaEsperada);
        String ligaActual = equipo.getLiga();

        // Verificación
        assertEquals(ligaEsperada, ligaActual, "La liga debería establecerse y retornarse correctamente.");
    }

    @Test
    void probarSetYGetPais_CuandoSeInvoca_EntoncesElPaisSeEstableceYSeRetornaCorrectamente() {
        // Preparación
        String paisEsperado = "España";

        // Acción
        equipo.setPais(paisEsperado);
        String paisActual = equipo.getPais();

        // Verificación
        assertEquals(paisEsperado, paisActual, "El país debería establecerse y retornarse correctamente.");
    }
}