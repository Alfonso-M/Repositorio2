/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almip
 */
public class Tipo {
    private String nombre;
    private int id;
    private List<Tipo> fortalezas;
    private List<Tipo> debilidades;

    public Tipo(String nombre, int id, List<Tipo> fortalezas, List<Tipo> debilidades) {
        this.nombre = nombre;
        this.id = id;
        this.fortalezas = fortalezas;
        this.debilidades = debilidades;
    }
    
    public Tipo(){}
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Tipo> getFortalezas() {
        return fortalezas;
    }

    public void setFortalezas(List<Tipo> fortalezas) {
        this.fortalezas = fortalezas;
    }

    public List<Tipo> getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(List<Tipo> debilidades) {
        this.debilidades = debilidades;
    }
}
