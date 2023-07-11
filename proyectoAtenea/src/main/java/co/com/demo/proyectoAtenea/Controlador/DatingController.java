package co.com.demo.proyectoAtenea.Controlador;


import co.com.demo.proyectoAtenea.Modelo.Dating;
import co.com.demo.proyectoAtenea.Servicio.DatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/Dating")
@CrossOrigin(origins = "*")
public class DatingController {

    @Autowired
    private DatingService datingService;

    @GetMapping("/all")
    public List<Dating> getAll() {
        return datingService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Dating> getDating(@PathVariable("id") int id){
        return datingService.getDating(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Dating save(@RequestBody Dating dating){
        return datingService.save(dating);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Dating update(@RequestBody Dating dating) {
        return datingService.update(dating);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int datingId){
        return datingService.deleteDating(datingId);
    }



}