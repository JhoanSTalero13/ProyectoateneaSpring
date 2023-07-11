package co.com.demo.proyectoAtenea.Servicio;

import co.com.demo.proyectoAtenea.Modelo.Dating;
import co.com.demo.proyectoAtenea.Repositorio.DatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatingService {

    @Autowired
    private DatingRepository datingRepository;

    public List<Dating> getAll(){
        return datingRepository.getAll();
    }
    public Optional<Dating> getDating (int id){
        return datingRepository.getDating(id);
    }

    public Dating save (Dating dating) {
        if (dating.getId() == null){
            return datingRepository.save(dating);
        }else{
            Optional<Dating> dating1 = datingRepository.getDating(dating.getId());
            if(dating1.isEmpty()){
                return datingRepository.save(dating);
            }else{
                return dating;

            }
        }
    }

    public Dating update(Dating dating) {
        if (dating.getId() != null) {
            Optional<Dating> g = datingRepository.getDating(dating.getId());
            if (!g.isEmpty()) {
                if (dating.getPacient() != null) {
                    g.get().setPacient(dating.getPacient());
                }
                if (dating.getDoctor() != null) {
                    g.get().setDoctor(dating.getDoctor());
                }
                if (dating.getSpeciality() != null) {
                    g.get().setSpeciality(dating.getSpeciality());
                }
                return datingRepository.save(g.get());
            }
        }
        return dating;
    }

    public boolean deleteDating(Integer id) {
        Boolean d = getDating(id).map(dating -> {
            datingRepository.delete(dating);
            return true;
        }).orElse(false);
        return d;
    }

}
