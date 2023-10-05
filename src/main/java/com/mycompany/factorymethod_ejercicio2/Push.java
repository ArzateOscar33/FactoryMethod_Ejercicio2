/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio2;

/**
 *
 * @author Arzate
 */
public class Push implements INotificacion{

    @Override
    public void enviar() {
        System.out.println("Mensaje enviado desde PUSH");
    }
    
}
