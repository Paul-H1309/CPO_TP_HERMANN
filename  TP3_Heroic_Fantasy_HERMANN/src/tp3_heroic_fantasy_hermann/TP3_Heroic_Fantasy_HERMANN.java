/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_hermann;

/**
 *
 * @author paulh
 */
public class TP3_Heroic_Fantasy_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Arme y = new Arme ("Gant de l'infini", 100);
    System.out.println(y);

    Epee x = new Epee (50,"Gant de l'infini", 100);
    System.out.println(x);
    
    Baton z = new Baton (80,"Gant de l'infini", 100);
    System.out.println(z);
    }
}
