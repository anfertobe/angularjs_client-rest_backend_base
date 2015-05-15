/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.services;

import edu.eci.cosw.samples.model.informcion.InscripcionJefes;
import edu.eci.cosw.samples.model.informcion.*;
import java.util.*;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServicesFacade {
   
    private static final HashMap<Integer,Familia> familias= new HashMap<>();
    private static final HashMap<String,InscripcionJefes> jefes= new HashMap<>();
    private static final List<Terreno> terrenos = new LinkedList<>();
    
    static{
        Familia fami = new Familia("prueba1", 123, "21", 12, 21, "nada");
        familias.put(fami.getId(), fami);
    }
    
    public void addFamilia(Familia familia){
        
       familias.put(familia.getId(), familia);
        
    }
    
    public void addJefe(InscripcionJefes jefe){
        
       jefes.put(jefe.getIdentificacion(), jefe);
        
    }
    
    public List<Familia> getFamilias(){
        List<Familia> famil = new LinkedList<>();
        for (Map.Entry<Integer, Familia> entrySet : familias.entrySet()) {
            famil.add(entrySet.getValue());
        }
        return famil;
    }
    
    public void addTerreno(int id, Terreno terreno){
        familias.get(id).getTerrenos().add(terreno);
    }
    
}
