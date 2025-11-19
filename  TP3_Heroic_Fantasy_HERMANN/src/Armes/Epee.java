package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Epee extends Arme {

private int finesse;
    public Epee(int finesse, String nom, int niveauDAttaque) {
        super(nom, niveauDAttaque);
        this.finesse = Math.min(finesse,99);
    }

    @Override
    public String toString() {
        return "Epee{" + "finesse=" + finesse + "nom=" + nom +", niveau d'attaque= " + niveauDAttaque + '}';
    }

    public int getFinesse() {
        return finesse;
    }
    
}
