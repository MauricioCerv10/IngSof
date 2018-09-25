package com.alumnos.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String boleta;
 
	@ManyToMany(mappedBy = "alumnos")
    private Set<Materias> materias = new HashSet<Materias>();
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String boleta) {
		super();
		this.nombre = nombre;
		this.boleta = boleta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getBoleta() {
		return boleta;
	}
	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}
    
    public Set<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(Materias materias) {
        this.materias.add(materias);
    }
    
	
}