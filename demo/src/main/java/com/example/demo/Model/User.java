package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="covid_entry")
public class User {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String Name;
    private String Contact;
    private String Govt_id_Type;
    private int Govt_id_Number;
    private String Vaccine;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getContact() {
        return Contact;
    }
    public void setContact(String contact) {
        Contact = contact;
    }
    public String getGovt_id_Type() {
        return Govt_id_Type;
    }
    public void setGovt_id_Type(String govt_id_Type) {
        Govt_id_Type = govt_id_Type;
    }
    public int getGovt_id_Number() {
        return Govt_id_Number;
    }
    public void setGovt_id_Number(int govt_id_Number) {
        Govt_id_Number = govt_id_Number;
    }
    public String getVaccine() {
        return Vaccine;
    }
    public void setVaccine(String vaccine) {
        Vaccine = vaccine;
    }
 @Override
    public String toString() {
        return "User [id=" + id + ", Name=" + Name + ", Contact=" + Contact + ", Govt_id_Type=" + Govt_id_Type
                + ", Govt_id_Number=" + Govt_id_Number + ", Vaccine=" + Vaccine + "]";
    }

    
}
