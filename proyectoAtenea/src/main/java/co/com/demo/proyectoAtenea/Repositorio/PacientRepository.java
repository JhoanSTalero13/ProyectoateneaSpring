/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.demo.proyectoAtenea.Repositorio;

import co.com.demo.proyectoAtenea.Repositorio.Interface.PacientInterface;
import co.com.demo.proyectoAtenea.Modelo.Pacient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author MG1323
 */

@Repository

public class PacientRepository {
    @Autowired
    private PacientInterface extensionesCrud;
    
    public List<Pacient> getAll (){
        return(List<Pacient>) extensionesCrud.findAll();
    }
    
    public Optional<Pacient> getPacient (int id) {
        return extensionesCrud. findById(id);
    
    }
    
    public Pacient save (Pacient pacient){
        return extensionesCrud.save(pacient);
        
    
    }
    public void delete (Pacient pacient){
        extensionesCrud.delete(pacient);
    }

 
    }
    
    
    
    

