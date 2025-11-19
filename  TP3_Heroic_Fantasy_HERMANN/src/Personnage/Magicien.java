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
    private boolean confirmé;

    public Magicien(String nom, int niveauDeVie, boolean confirmé) {
        super(nom, niveauDeVie);
    }

    public void setConfirmé(boolean confirmé) {
        this.confirmé = confirmé;
    }
    
    
}
