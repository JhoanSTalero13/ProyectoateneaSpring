package co.com.demo.proyectoAtenea.Repositorio;

import co.com.demo.proyectoAtenea.Modelo.Speciality;
import co.com.demo.proyectoAtenea.Repositorio.Interface.SpecialityInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class SpecialityRepository {

    @Autowired
    private SpecialityInterface extensionesCrud;

    public List<Speciality> getAll (){
        return(List<Speciality>) extensionesCrud.findAll();
    }

    public Optional<Speciality> getSpeciality(int id) {
        return extensionesCrud. findById(id);

    }
}
