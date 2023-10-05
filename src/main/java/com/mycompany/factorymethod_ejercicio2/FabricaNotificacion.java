/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod_ejercicio2;

/**
 *
 * @author Arzate
 */
public abstract class FabricaNotificacion {

    public abstract INotificacion crearNotificacion();
    
    public INotificacion notificar(){
        INotificacion notificacion= crearNotificacion();
        notificacion.enviar();
        return notificacion;
    }
    
    
}
