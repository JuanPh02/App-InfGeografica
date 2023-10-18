/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpah.infgeografica.Clases;

/**
 *
 * @author Juan Pablo
 */
public class LugarTurismo extends Nodo {
    public LugarTurismo(String nombre) {
        super(nombre);
    }

    @Override
    public String exportarXML(int indentLevel) {
        StringBuilder xml = new StringBuilder();
        String indent = " ".repeat(indentLevel);

        xml.append(indent).append("<lugarTurismo>\n");
        xml.append(indent).append("  <nombre>").append(nombre).append("</nombre>\n");
        xml.append(indent).append("</lugarTurismo>");

        return xml.toString();
    }
    
    @Override
    public void funcInfoGeo() {
        System.out.println("Información geográfica de Lugar Turismo " + nombre);
    }
}
