/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.demo.proyectoAtenea.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

/**
 *
 * @author MG1323
 */
@Entity
@Table(name = "pacient")

public class Pacient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private Integer DNI;

    private String lastname;

    private String Age;
    private String phonenumber;

    
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }



    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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

