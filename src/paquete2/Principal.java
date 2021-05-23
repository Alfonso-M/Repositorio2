/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.ArrayList;
import java.util.List;
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
        agua.setNombre("fuego");
    
        List<Tipo> debilidadesFuego = new ArrayList<>();
        debilidadesFuego.add(agua);
        
        fuego.setDebilidades(debilidadesFuego);
    }
}
