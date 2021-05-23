/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.ArrayList;
import java.util.List;
import paquete1.Pokemon;
import paquete1.Tipo;

/**
 *
 * @author almip
 */
public class Principal {
    public static void main(String[] args) {
        Tipo agua =  new Tipo();
        agua.setNombre("agua");
        
        Tipo fuego =  new Tipo();
        fuego.setNombre("fuego");
        
         Tipo planta =  new Tipo();
        planta.setNombre("planta");
    
        List<Tipo> debilidadesFuego = new ArrayList<>();
        debilidadesFuego.add(agua);
        
        fuego.setDebilidades(debilidadesFuego);
        
        //////////////////////////////////////////////
        Pokemon bulbasaur = new Pokemon();
        bulbasaur.setAtaque(25);
        bulbasaur.setHp(100);
        bulbasaur.setTipo(planta);
        bulbasaur.setNombre("Bulbasaur");
        
        Pokemon charmander = new Pokemon();
        charmander.setAtaque(30);
        charmander.setHp(75);
        charmander.setTipo(fuego);
        charmander.setNombre("Charmander");
        
        int turno=0;
        while(charmander.getHp()>0 && bulbasaur.getHp()>0){
            if(turno%2==0)
                bulbasaur.atacar(charmander);
            else
                charmander.atacar(bulbasaur);
            turno++;
        }
        System.out.println(bulbasaur);
        System.out.println(charmander);
    }
}
