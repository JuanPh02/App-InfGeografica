/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpah.infgeografica.Clases;

/**
 *
 * @author Juan Pablo
 */
public class Enlace {
    private Nodo origen;
    private Nodo destino;

    public Enlace(Nodo origen, Nodo destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public String exportarXML(int indentLevel) {
        StringBuilder xml = new StringBuilder();
        String indent = " ".repeat(indentLevel);

        xml.append(indent).append("<enlace>\n");
        xml.append(indent).append("  <origen>").append(origen.nombre).append("</origen>\n");
        xml.append(indent).append("  <destino>").append(destino.nombre).append("</destino>\n");
        xml.append(indent).append("</enlace>");

        return xml.toString();
    }
}
