/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorymethod_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Arzate
 */
public class FactoryMethod_Ejercicio2 {

    public static void main(String[] args) {
        FabricaNotificacion FV= null;
        while(true){
            System.out.println("Elija una opcion de notificacion de envio de mensaje 1) SMS 2)Email 3)Push 4)Salir");
            Scanner leer= new Scanner(System.in);
            int num=leer.nextInt();
            switch(num){
                case 1:
                    //eligio SMS
                    FV= new FabricaSMS();
                    
                    break;
                case 2:
                    FV= new FabricaEmail();
                    break;
                case 3:
                    FV= new FabricaPush();
                default:
                    break;
            }//case
            INotificacion notificacion=FV.notificar();
            break;
        }//while
    }
}
