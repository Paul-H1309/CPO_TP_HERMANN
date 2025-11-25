package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Magicien extends Personnage{
    
    public void attaquer(Personnage ciblé) {
        System.out.println("Le magicien fait une attaque ");
        ciblé.estAttaque(20);
    }
    
    private boolean confirmé;
    static int nbMagicien = 0;

    public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
        nbMagicien++;
    }

    public void destroy() {
        nbMagicien--;
        super.destroy();
    }
    
    public static int getNbMagicien() {
        return nbMagicien;
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    
}
