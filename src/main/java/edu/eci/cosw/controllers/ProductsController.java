/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.controllers;

import edu.eci.cosw.samples.model.informcion.*;
import edu.eci.cosw.services.ServicesFacade;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author hcadavid
 */
@RestController
@RequestMapping("/gipn")
public class ProductsController {
    
    @Autowired
    ServicesFacade services;
    
    
    @RequestMapping(value="/regifamilia",method = RequestMethod.POST)        
    public ResponseEntity<?> adicionarFamilia(@RequestBody Familia familia) {
            services.addFamilia(familia);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
        @RequestMapping(value="/jefe",method = RequestMethod.POST)        
    public ResponseEntity<?> adicionarFamilia(@RequestBody InscripcionJefes jefe) {
            services.addJefe(jefe);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
//    
//    @RequestMapping(method = RequestMethod.POST)        
//    public ResponseEntity<?> addProduct(@RequestBody Producto p) {       
//        services.addNewProduct(p);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
//
//    
    @RequestMapping(value = "/familia", method = RequestMethod.GET)        
    public List<Familia> allProducts() { 
        return services.getFamilias();
    }
    
    
    

        @RequestMapping(value="familia/{id}/terreno",method = RequestMethod.POST)        
    public ResponseEntity<?> adicionarTerreno(@RequestBody Terreno terreno, @PathVariable("id") int id) {
            services.addTerreno(id,terreno);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    
}

