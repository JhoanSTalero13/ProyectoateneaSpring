package co.com.demo.proyectoAtenea.Servicio;

import co.com.demo.proyectoAtenea.Modelo.Doctor;
import co.com.demo.proyectoAtenea.Repositorio.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAll(){
        return doctorRepository.getAll();
    }
    public Optional<Doctor> getDoctor (int id){
        return doctorRepository.getDoctor(id);
    }

    public Doctor save (Doctor doctor) {
        if (doctor.getId() == null){
            return doctorRepository.save (doctor);
        }else{
            Optional<Doctor> doctor1 = doctorRepository.getDoctor(doctor.getId());
            if(doctor1.isEmpty()){
                return doctorRepository.save(doctor);
            }else{
                return doctor;

            }
        }
    }

    public Doctor update(Doctor doctor) {
        if (doctor.getId() != null) {
            Optional<Doctor> g = doctorRepository.getDoctor(doctor.getId());
            if (!g.isEmpty()) {
                if (doctor.getName() != null) {
                    g.get().setName(doctor.getName());
                }
                if (doctor.getLastName() != null) {
                    g.get().setLastName(doctor.getLastName());
                }
                if (doctor.getSpeciality() != null) {
                    g.get().setSpeciality(doctor.getSpeciality());
                }
                if (doctor.getDating() != null) {
                    g.get().setDating(doctor.getDating());
                }
                if (doctor.getConsultory() != null) {
                    g.get().setConsultory(doctor.getConsultory());
                }
                if (doctor.getEmail() != null) {
                    g.get().setEmail(doctor.getEmail());
                }

                return doctorRepository.save(g.get());
            }
        }
        return doctor;
    }

    public boolean deleteDoctor(int id){
        Boolean d = getDoctor(id).map(doctor -> {
            doctorRepository.delete(doctor);
            return true;
        }).orElse(false);
        return d;
    }

}
