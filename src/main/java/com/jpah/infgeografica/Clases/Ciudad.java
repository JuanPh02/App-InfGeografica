/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpah.infgeografica.Clases;

/**
 *
 * @author Juan Pablo
 */
public class Ciudad extends Nodo {
    public Ciudad(String nombre) {
        super(nombre);
    }

    @Override
    public String exportarXML(int indentLevel) {
        StringBuilder xml = new StringBuilder();
        String indent = " ".repeat(indentLevel);

        xml.append(indent).append("<ciudad>\n");
        xml.append(indent).append("  <nombre>").append(nombre).append("</nombre>\n");
        xml.append(indent).append("</ciudad>");

        return xml.toString();
    }
    
    @Override
    public void funcInfoGeo() {
        // Implementa la lógica relacionada con información geográfica específica para Ciudad
        System.out.println("Información geográfica de la ciudad " + nombre);
        // Puedes personalizar esta lógica según tus necesidades.
    }
}