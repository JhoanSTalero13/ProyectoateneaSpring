package co.com.demo.proyectoAtenea.Servicio;
import co.com.demo.proyectoAtenea.Modelo.Pacient;
import co.com.demo.proyectoAtenea.Repositorio.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientService {
    @Autowired
    private PacientRepository pacientRepository;
    public List<Pacient> getAll(){
        return pacientRepository.getAll();
    }
    public Optional<Pacient> getPacient (int id){
        return pacientRepository.getPacient (id);
    }

    public Pacient save (Pacient pacient) {
        if ( pacient.getId() == null){
            return pacientRepository.save (pacient);
        }else{
            Optional<Pacient> pacient1 = pacientRepository.getPacient(pacient.getId());
            if(pacient1.isEmpty()){
                return pacientRepository.save(pacient);
            }else{
                return pacient;

            }
        }
    }


    public Pacient update(Pacient pacient){
        if(pacient.getId()!=null){
            Optional<Pacient>g= pacientRepository.getPacient(pacient.getId());
            if(!g.isEmpty()){
                if (pacient.getName() != null) {
                    g.get().setName(pacient.getName());
                }
                if (pacient.getDating() != null) {
                    g.get().setDating(pacient.getDating());
                }
                if (pacient.getLastname() != null) {
                    g.get().setLastname(pacient.getLastname());
                }
                if (pacient.getAge() != null) {
                    g.get().setAge(pacient.getAge());
                }
                if (pacient.getDNI() != null){
                    g.get().setDNI(pacient.getDNI());
                }
                if (pacient.getPhonenumber() != null) {
                    g.get().setPhonenumber(pacient.getPhonenumber());
                }

                return pacientRepository.save(g.get());
            }
        }
        return pacient;
    }
    public boolean deletePacient(int id){
        Boolean d = getPacient(id).map(pacient -> {
            pacientRepository.delete(pacient);
            return true;
        }).orElse(false);
        return d;
    }
}
