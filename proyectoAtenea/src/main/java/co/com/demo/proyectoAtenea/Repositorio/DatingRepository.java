package co.com.demo.proyectoAtenea.Repositorio;

import co.com.demo.proyectoAtenea.Modelo.Dating;
import co.com.demo.proyectoAtenea.Repositorio.Interface.DatingInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DatingRepository {
    @Autowired
    private DatingInterface extensionesCrud;

    public List<Dating> getAll (){
        return(List<Dating>) extensionesCrud.findAll();
    }

    public Optional<Dating> getDating (int id) {
        return extensionesCrud. findById(id);

    }

    public Dating save (Dating dating){
        return extensionesCrud.save(dating);


    }

    public void delete (Dating dating){
        extensionesCrud.delete(dating);
    }


}
