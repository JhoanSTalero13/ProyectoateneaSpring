/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.demo.proyectoAtenea.Repositorio.Interface;

import co.com.demo.proyectoAtenea.Modelo.Doctor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MG1323
 */
public interface DoctorInterface extends CrudRepository <Doctor,Integer >{
    
    
}
