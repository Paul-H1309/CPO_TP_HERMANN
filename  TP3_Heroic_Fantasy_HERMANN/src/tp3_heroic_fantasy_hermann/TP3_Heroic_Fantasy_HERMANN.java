/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_hermann;

/**
 *
 * @author paulh
 */

import Personnage.Magicien;
import Personnage.Personnage;
import Personnage.Guerrier;
import java.util.ArrayList;
import Armes.*;

import Personnage.*;

public class TP3_Heroic_Fantasy_HERMANN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Epee x = new Epee (5,"Excalibur", 7);
    
    Epee r = new Epee (7,"Durandal", 4);
    
    Baton z = new Baton (5,"Chêne", 4);
    
    Baton v = new Baton (6,"Charme", 5);
    
    ArrayList<Arme> Tab = new ArrayList<Arme>();
    Tab.add(x);
    Tab.add(r);
    Tab.add(z);
    Tab.add(v);
    int tailleDeTab = Tab.size();
    System.out.println(tailleDeTab);
    System.out.println(Tab);
    
    Magicien a = new Magicien ("Gandalf",65, true);
    
    Magicien b = new Magicien ("Garcimore",44, false);
    
    Guerrier c = new Guerrier ("Conan",78, false);
    
    Guerrier d = new Guerrier ("Lannister",45, true);
    
    ArrayList<Personnage> Tab0 = new ArrayList<Personnage>();
    Tab0.add(a);
    Tab0.add(b);
    Tab0.add(c);
    Tab0.add(d);
    int tailleDeTab0 = Tab0.size();
    System.out.println(tailleDeTab0);
    System.out.println(Tab0);
       
    Magicien A = new Magicien ("Radagast",55, false);
    
    Guerrier B = new Guerrier ("Aragorn",90, true);
    
    Epee C = new Epee (90,"Narsil", 40);
    
    Epee D = new Epee (5,"Epee en diamant", 30);
    
    Epee E = new Epee (3,"Epee en or", 35);
    
    Baton F = new Baton (8,"argent", 40);
    
    Baton G = new Baton (4,"Cuivre", 25);
    
    Baton H = new Baton (50,"Emraude", 80);
    
    B.ajouteArme(C);
    B.ajouteArme(D);
    B.ajouteArme(G);
    B.equiperArme(C);
    A.ajouteArme(F);
    A.ajouteArme(H);
    A.ajouteArme(E);
    A.equiperArme(F);
    System.out.println(A);
    System.out.println(B);
    }

}
