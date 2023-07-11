package co.com.demo.proyectoAtenea.Controlador;
import co.com.demo.proyectoAtenea.Modelo.Pacient;
import co.com.demo.proyectoAtenea.Servicio.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Pacient")
@CrossOrigin(origins = "*")
public class PacientController {
    @Autowired
    private PacientService pacientService;
    @GetMapping("/all")
    public List<Pacient> getAll(){
        return pacientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Pacient> getPacient(@PathVariable("id") int id){
        return pacientService.getPacient(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Pacient save(@RequestBody Pacient pacient){
        return pacientService.save(pacient);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Pacient update(@RequestBody Pacient pacient) {
        return pacientService.update(pacient);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int pacientId){
        return pacientService.deletePacient(pacientId);
    }

}
