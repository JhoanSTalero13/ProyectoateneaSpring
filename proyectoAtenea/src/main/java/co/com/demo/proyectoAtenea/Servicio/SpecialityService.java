package co.com.demo.proyectoAtenea.Servicio;

import co.com.demo.proyectoAtenea.Modelo.Speciality;
import co.com.demo.proyectoAtenea.Repositorio.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;
    public List<Speciality> getAll(){
        return specialityRepository.getAll();
    }
    public Optional<Speciality> getSpeciality (int id){
        return specialityRepository.getSpeciality (id);
    }

}
