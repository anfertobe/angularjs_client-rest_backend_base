/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.samples.model.informcion;

/**
 *
 * @author andres
 */
public class Rubro implements java.io.Serializable {
    
    private String tipo;
    private String claseRubro;
    private String rubroProduccion;
    private String rendimiento;
    private String tecnologias;

    public Rubro() {
    }

    public Rubro(String tipo, String claseRubro, String rubroProduccion, String rendimiento, String tecnologias) {
        this.tipo = tipo;
        this.claseRubro = claseRubro;
        this.rubroProduccion = rubroProduccion;
        this.rendimiento = rendimiento;
        this.tecnologias = tecnologias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClaseRubro() {
        return claseRubro;
    }

    public void setClaseRubro(String claseRubro) {
        this.claseRubro = claseRubro;
    }

    public String getRubroProduccion() {
        return rubroProduccion;
    }

    public void setRubroProduccion(String rubroProduccion) {
        this.rubroProduccion = rubroProduccion;
    }

    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }
    
}
