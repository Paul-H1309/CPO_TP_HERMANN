/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_hermann;

/**
 *
 * @author paulh
 */
class Convertisseur {
    int nbConversions;
    public Convertisseur () { 
        nbConversions = 0 ; 
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
    @Override 
    public String toString () { 
        return "nb de conversions"+ nbConversions; 
    } 
}
