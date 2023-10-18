/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jpah.infgeografica;

import com.jpah.infgeografica.Clases.Ciudad;
import com.jpah.infgeografica.Clases.Enlace;
import com.jpah.infgeografica.Clases.Grafo;
import com.jpah.infgeografica.Clases.Industria;
import com.jpah.infgeografica.Clases.LugarTurismo;

/**
 *
 * @author Juan Pablo
 */
public class Infgeografica {

    public static void main(String[] args) {
         // Crear un grafo
        Grafo grafo = new Grafo();

        // Crear nodos
        Ciudad ciudadA = new Ciudad("Ciudad A");
        Ciudad ciudadB = new Ciudad("Ciudad B");
        Industria industriaX = new Industria("Industria X");
        LugarTurismo lugarY = new LugarTurismo("Lugar de Turismo Y");

        // Agregar nodos al grafo
        grafo.agregarNodo(ciudadA);
        grafo.agregarNodo(ciudadB);
        grafo.agregarNodo(industriaX);
        grafo.agregarNodo(lugarY);

        // Crear enlaces
        Enlace enlace1 = new Enlace(ciudadA, industriaX);
        Enlace enlace2 = new Enlace(ciudadA, lugarY);

        // Agregar enlaces al grafo
        grafo.agregarEnlace(enlace1);
        grafo.agregarEnlace(enlace2);

        // Exportar el grafo a formato XML
        String xml = grafo.exportarXML();
        System.out.println(xml);
    }
}
