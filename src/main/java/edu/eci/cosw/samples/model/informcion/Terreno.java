/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.samples.model.informcion;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author andres
 */
public class Terreno implements java.io.Serializable {
    
    private String nombre;
    private int extencion;
    private String tipoSuelo;
    private String ph;
    private String ASNM;
    private String Ubicacion;
    private List<Rubro> rubros = new LinkedList<>();

    public Terreno() {
    }

    public Terreno(String nombre, int extencion, String tipoSuelo, String ph, String ASNM, String Ubicacion) {
        this.nombre = nombre;
        this.extencion = extencion;
        this.tipoSuelo = tipoSuelo;
        this.ph = ph;
        this.ASNM = ASNM;
        this.Ubicacion = Ubicacion;
    }
    
        public Terreno(String nombre, int extencion, String tipoSuelo, String ph, String ASNM, String Ubicacion, List<Rubro> rubros) {
        this.nombre = nombre;
        this.extencion = extencion;
        this.tipoSuelo = tipoSuelo;
        this.ph = ph;
        this.ASNM = ASNM;
        this.Ubicacion = Ubicacion;
        this.rubros = rubros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExtencion() {
        return extencion;
    }

    public void setExtencion(int extencion) {
        this.extencion = extencion;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getASNM() {
        return ASNM;
    }

    public void setASNM(String ASNM) {
        this.ASNM = ASNM;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    } 
    
    public List<Rubro> getRubros() {
        return rubros;
    }

    public void setRubros(List<Rubro> rubros) {
        this.rubros = rubros;
    }
}
