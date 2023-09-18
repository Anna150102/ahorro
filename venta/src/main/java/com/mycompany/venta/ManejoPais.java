/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.venta;

import domain.Pais;

/**
 *
 * @author david
 */
public class ManejoPais {
    
    Pais pais = new Pais();
    
    public String[] Listar(){
        return (pais.getPais());
    }
    
}
