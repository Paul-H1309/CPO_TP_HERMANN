/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_hermann;

import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP1_convertisseur_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Entrer une valeur :");
        double valeur = sc.nextDouble();
        System.out.println("saisissez une convertion entre 1:c->k,2:k->c,3:f->c,4:c->f,5:k->f,6:f->k");
        double mod = sc.nextDouble();
        double nvaleur=0;
        if (mod==1){
            nvaleur=CelciusVersKelvin(valeur);
        }
        if (mod==2){
            nvaleur=KelvinVersCelcuis(valeur);
        }
        if (mod==3){
            nvaleur=FahrenheitVersCelcuis(valeur);
        }
        if (mod==4){
            nvaleur=CelciusVersFahrenheit(valeur);
        }
        if (mod==5){
            nvaleur=KelvinVersFahrenheit(valeur);
        }
        if (mod==6){
            nvaleur=FahrenheitVersKelvin(valeur);
        }
        System.out.println("La nouvelle valeur est :"+nvaleur);
        sc.close();
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double tKelvin=0;
        tKelvin=tCelcius+273.15;
        return tKelvin;
    }
    public static double KelvinVersCelcuis (double tKelvin) {
        double tCelcius=0;
        tCelcius=tKelvin-273.15;
        return tCelcius;
    }
    public static double FahrenheitVersCelcuis (double tFahrenheit) {
        double tCelcius=0;
        tCelcius=(tFahrenheit/1.8)-32;
        return tCelcius; 
    }
    public static double CelciusVersFahrenheit (double tCelcuis) {
        double tFahrenheit=0;
        tFahrenheit=(tCelcuis*1.8)+32;
        return tFahrenheit;
    }
    public static double KelvinVersFahrenheit (double tKelvin) {
        double tFahrenheit=0;
        tFahrenheit=((tKelvin-273.15)*1.8)+32;
        return tFahrenheit;
    }
    public static double FahrenheitVersKelvin (double tFahrenheit) {
        double tKelvin=0;
        tKelvin=((tFahrenheit/1.8)-32)+273.15;
        return tKelvin; 
    }
}
