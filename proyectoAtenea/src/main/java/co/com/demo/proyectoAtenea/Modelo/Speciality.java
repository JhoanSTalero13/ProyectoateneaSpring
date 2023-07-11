package co.com.demo.proyectoAtenea.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "speciality")

public class Speciality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="dating")
    @JsonIgnoreProperties("dating")
    private List<Dating> dating;
    public Speciality(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Dating> getDating() {
        return dating;
    }

    public void setDating(List<Dating> dating) {
        this.dating = dating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

