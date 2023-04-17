/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.upc.etsetb.poo.test;

import edu.upc.etsetb.poo.laboratorio.sesion5.main.Impresora;
import edu.upc.etsetb.poo.laboratorio.sesion5.main.Trabajo;

/**
 *
 * @author pllei
 */
public class Tests {

    public static void main(String[] args) {
        juegoPruebasTrabajoImpresora2();
    }

    public static void juegoPruebasTrabajoImpresora1() {
        Impresora impresora = new Impresora("AS102 Printer");
        
        Trabajo t1 = new Trabajo(1, "Pol", "OrdenaInsercion.java");
        Trabajo t2 = new Trabajo(2, "Fernando", "Wordle.c");
        Trabajo t3 = new Trabajo(3, "Jovani Vazquez", "toma-mango.wav");
        Trabajo t4 = new Trabajo(4, "Samuel De Luque", "wigetta.pdf");
        Trabajo t5 = new Trabajo(5, "Paulo Cohelo", "El-Alquimista.pdf");
        Trabajo t6 = new Trabajo(6, "Victor", "Victor-le-dice-a-Joel.js");
        
        impresora.addTrabajoEnCola(t1);
        impresora.addTrabajoEnCola(t2);
        impresora.addTrabajoEnCola(t3);
        impresora.addTrabajoEnCola(t4);
        impresora.addTrabajoEnCola(t5);
        impresora.addTrabajoEnCola(t6);

        System.out.println(impresora.toString());

        impresora.procesaSiguienteTrabajo();
        impresora.procesaSiguienteTrabajo();

        System.out.println(impresora.toString());
    }

    public static void juegoPruebasTrabajoImpresora2() {
        Impresora impresora = new Impresora("Terreneitor");

        Trabajo t1 = new Trabajo(1, "Pol", "OrdenaInsercion.java");
        Trabajo t2 = new Trabajo(2, "Fernando", "Wordle.c");
        Trabajo t3 = new Trabajo(3, "Jovani Vazquez", "toma-mango.wav");
        Trabajo t4 = new Trabajo(4, "Samuel De Luque", "wigetta.pdf");
        Trabajo t5 = new Trabajo(5, "Paulo Cohelo", "El-Alquimista.pdf");
        Trabajo t6 = new Trabajo(6, "Victor", "Victor-le-dice-a-Joel.js");

        impresora.addTrabajoEnCola(t1);
        impresora.addTrabajoEnCola(t2);
        impresora.addTrabajoEnCola(t3);
        impresora.addTrabajoEnCola(t4);
        impresora.addTrabajoEnCola(t5);
        impresora.addTrabajoEnCola(t6);

        System.out.println(impresora);

        //impresora.priorizaTrabajoEnCola(6);

        impresora.limitaLongitudCola(3);

        System.out.println(impresora);
    }
}
