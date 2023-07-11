
package co.com.demo.proyectoAtenea.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="dating")

public class Dating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "specialityid")
    @JsonIgnoreProperties("dating")
    private Speciality speciality;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "dating")
    @JsonIgnoreProperties({"dating", "pacient"})
    private List<Pacient> pacient;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "dating")
    @JsonIgnoreProperties({"dating", "doctor"})
    private List<Doctor> doctor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public List<Pacient> getPacient() {
        return pacient;
    }

    public void setPacient(List<Pacient> pacient) {
        this.pacient = pacient;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }
}
