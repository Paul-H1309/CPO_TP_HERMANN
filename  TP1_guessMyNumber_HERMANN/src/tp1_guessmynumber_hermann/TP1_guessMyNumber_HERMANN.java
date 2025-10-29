/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_hermann;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP1_guessMyNumber_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Entrer une valeur :");
        int valeur = sc.nextInt();
        System.out.println("Choisir une difficulté entre facile 1 ou difficile 2");
        int diff = sc.nextInt();
        int Nbr=0;
        if(diff==1){
            while (n!=valeur){
                Nbr+=1;
                if (valeur<n){
                    System.out.println("Trop petit");
                    System.out.print("Entrer une  nouvelle valeur :");
                    int nvaleur1 = sc.nextInt();
                    valeur=nvaleur1;
                }else{
                    System.out.println("Trop grand");
                    System.out.print("Entrer une  nouvelle valeur :");
                    int nvaleur1 = sc.nextInt();
                    valeur=nvaleur1;
                }
            }
        }else{
            while (n!=valeur){
                while (Nbr<=7){
                    Nbr+=1;
                    if (valeur<n){
                        System.out.println("Trop petit");
                        System.out.print("Entrer une  nouvelle valeur :");
                        int nvaleur1 = sc.nextInt();
                        valeur=nvaleur1;
                    }else{
                        System.out.println("Trop grand");
                        System.out.print("Entrer une  nouvelle valeur :");
                        int nvaleur1 = sc.nextInt();
                        valeur=nvaleur1;
                    }
                }
                System.out.println("Perdu");
            }
        }
        System.out.println("Gagné");
        System.out.println(Nbr);
    } 
}