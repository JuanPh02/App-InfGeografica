/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpah.infgeografica.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Pablo
 */
public class Grafo {
    private List<Nodo> nodos = new ArrayList<>();
    private List<Enlace> enlaces = new ArrayList<>();

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void agregarEnlace(Enlace enlace) {
        enlaces.add(enlace);
    }

    public String exportarXML() {
        StringBuilder xml = new StringBuilder("<grafo>\n");

        xml.append("  <nodos>\n");
        for (Nodo nodo : nodos) {
            xml.append(nodo.exportarXML(2)).append("\n");
        }
        xml.append("  </nodos>\n");

        xml.append("  <enlaces>\n");
        for (Enlace enlace : enlaces) {
            xml.append(enlace.exportarXML(2)).append("\n");
        }
        xml.append("  </enlaces>\n");

        xml.append("</grafo>");

        return xml.toString();
    }
}
