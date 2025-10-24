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
        System.out.println("Vous avez saisie :"+valeur);
        double nvaleur = valeur+273.15;
        System.out.println("La nouvelle valeur est :"+nvaleur);
        sc.close();
    }
    public static void CelciusVersKelvin(Double[] args){
        
    }
    
}
