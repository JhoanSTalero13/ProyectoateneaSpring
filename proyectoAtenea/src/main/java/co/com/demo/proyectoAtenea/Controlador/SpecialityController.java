package co.com.demo.proyectoAtenea.Controlador;

import co.com.demo.proyectoAtenea.Modelo.Speciality;
import co.com.demo.proyectoAtenea.Servicio.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/Speciality")
@CrossOrigin(origins = "*")
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;


    @GetMapping("/all")
    public List<Speciality> getSpecialities() {
        return specialityService.getAll();
    }

    @GetMapping("/dropdown")
    public List<String> getSpecialityDropdown() {
        List<String> specialities = Arrays.asList(
                "Medicina general",
                "Cardiología",
                "Medicina interna",
                "Dermatología",
                "Rehabilitación física",
                "Psicología",
                "Odontología"
        );
        return specialities;
    }
}
