
package co.com.demo.proyectoAtenea.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author MG1323
 */
@Entity
@Table(name = "doctor")

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private  String LastName;
    private  String consultory;
    private String email;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="dating")
    @JsonIgnoreProperties("dating")
    private List<Dating> dating;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="speciality")
    @JsonIgnoreProperties("speciality")
    private List<Speciality> speciality;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsultory() {
        return consultory;
    }

    public void setConsultory(String consultory) {
        this.consultory = consultory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<Dating> getDating() {
        return dating;
    }

    public void setDating(List<Dating> dating) {
        this.dating = dating;
    }

    public List<Speciality> getSpeciality() {
        return speciality;
    }

    public void setSpeciality(List<Speciality> speciality) {
        this.speciality = speciality;
    }
}

