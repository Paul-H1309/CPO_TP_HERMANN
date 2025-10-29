/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_hermann;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author paulh
 */
public class TP1_stats_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] faces = new int[6];
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Entrer une valeur entière :");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);
            faces[n]+=1;
        }
        System.out.println("La face 1 est a un taux d'apparition de "+(faces[0]*100)/m+"%");
        System.out.println("La face 2 est a un taux d'apparition de "+(faces[1]*100)/m+"%");
        System.out.println("La face 3 est a un taux d'apparition de "+(faces[2]*100)/m+"%");
        System.out.println("La face 4 est a un taux d'apparition de "+(faces[3]*100)/m+"%");
        System.out.println("La face 5 est a un taux d'apparition de "+(faces[4]*100)/m+"%");
        System.out.println("La face 6 est a un taux d'apparition de "+(faces[5]*100)/m+"%");
    }
    
}
