/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jpah.infgeografica.Clases;

/**
 *
 * @author Juan Pablo
 */
public abstract class Nodo {
    protected String nombre;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public abstract String exportarXML(int indentLevel);
    
    public abstract void funcInfoGeo();
}
