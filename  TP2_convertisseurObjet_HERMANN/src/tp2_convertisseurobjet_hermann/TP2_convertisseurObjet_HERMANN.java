/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_hermann;

import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP2_convertisseurObjet_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur Va = new Convertisseur ();
        Scanner sc = new Scanner(System.in) ;
        System.out.println("saisissez une convertion entre 1:c->k,2:k->c,3:f->c,4:c->f,5:k->f,6:f->k");
        double mod = sc.nextDouble();
        double nvaleur=0;
        if (mod==1){
            System.out.println(Va.CelciusVersKelvin(45));
        }
        if (mod==2){
            System.out.println(Va.KelvinVersCelcuis(45));
        }
        if (mod==3){
            System.out.println(Va.FahrenheitVersCelcuis(45));
        }
        if (mod==4){
            System.out.println(Va.CelciusVersFahrenheit(45));
        }
        if (mod==5){
            System.out.println(Va.KelvinVersFahrenheit(45));
        }
        if (mod==6){
            System.out.println(Va.FahrenheitVersKelvin(45));
        }
        sc.close();       
    }   
}
