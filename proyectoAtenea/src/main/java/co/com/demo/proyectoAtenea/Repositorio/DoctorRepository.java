/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.demo.proyectoAtenea.Repositorio;

import co.com.demo.proyectoAtenea.Repositorio.Interface.DoctorInterface;
import co.com.demo.proyectoAtenea.Modelo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author MG1323
 */
@Repository
public class DoctorRepository {

    @Autowired
    private DoctorInterface extensionesCrud;

    public List<Doctor> getAll(){
        return (List<Doctor>) extensionesCrud.findAll();
    }

    public Optional<Doctor> getDoctor(int id){

        return extensionesCrud.findById(id);
    }

    public Doctor save (Doctor doctor){
        return extensionesCrud.save(doctor);
    }

    public void delete(Doctor doctor){
        extensionesCrud.delete(doctor);
    }
    
}
    


