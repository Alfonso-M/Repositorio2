/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Objects;

/**
 *
 * @author almip
 */
public class Pokemon {
    private String nombre;
    private String mote;
    private int nivel;
    private Tipo tipo;
    private int ataque;
    private int hp;
    private int exp;

    public void atacar(Pokemon enemigo){
        int vida=enemigo.getHp();
        vida=vida-this.getAtaque();
        enemigo.setHp(vida);
    }
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Pokemon: " + nombre + " de tipo: " +tipo +" con nivel: "+ nivel+ " HP= "+hp;
    }
}
