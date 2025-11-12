package tp3_heroic_fantasy_hermann;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Baton extends Arme {

int age;
    public Baton(int age, String nom, int niveauDAttaque) {
        super(nom, niveauDAttaque);
        this.age = Math.min (age,99);
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }
    
}
