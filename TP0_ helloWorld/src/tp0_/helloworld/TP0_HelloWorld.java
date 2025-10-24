/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.helloworld;

import java.util.Scanner;

/**HelloWorld
 *20/10/2025
 * @author paul hermann
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Bonjour ");
        System.out.println("Quelle est votre nom");
        String prenom; 
        Scanner sc ; 
        sc = new Scanner (System.in) ; 
        System.out.println("Quel est votre prénom ?"); 
        prenom = sc.nextLine(); 
        System.out.println("Au revoir");
    }
    
}
