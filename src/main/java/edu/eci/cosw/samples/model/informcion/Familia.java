/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.samples.model.informcion;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author andres
 */
public class Familia implements java.io.Serializable {
    
    private String nombreCabeza;
    private int id;
    private String edad;
    private int integrantes;
    private int ingresos;
    private String nivelAcademico;
    private List<Terreno> terrenos = new LinkedList<>();

    public Familia() {
    }

    public Familia(String nombreCabeza, int id, String edad, int integrantes, int ingresos, String nivelAcademico) {
        this.nombreCabeza = nombreCabeza;
        this.id = id;
        this.edad = edad;
        this.integrantes = integrantes;
        this.ingresos = ingresos;
        this.nivelAcademico = nivelAcademico;
    }
    
        public Familia(String nombreCabeza, int id, String edad, int integrantes, int ingresos, String nivelAcademico, List<Terreno> terrenos) {
        this.nombreCabeza = nombreCabeza;
        this.id = id;
        this.edad = edad;
        this.integrantes = integrantes;
        this.ingresos = ingresos;
        this.nivelAcademico = nivelAcademico;
        this.terrenos = terrenos;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getNombreCabeza() {
        return nombreCabeza;
    }

    public void setNombreCabeza(String nombreCabeza) {
        this.nombreCabeza = nombreCabeza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public List<Terreno> getTerrenos() {
        return terrenos;
    }

    public void setTerrenos(List<Terreno> terrenos) {
        this.terrenos = terrenos;
    }
    
    
}
