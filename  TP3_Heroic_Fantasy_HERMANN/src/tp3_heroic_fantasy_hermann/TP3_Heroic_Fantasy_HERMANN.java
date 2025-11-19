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
    }
}
