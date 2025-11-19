package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public abstract class Arme {
    String nom;
    int niveauDAttaque;

    public Arme(String nom, int niveauDAttaque) {
        this.nom = nom;
        this.niveauDAttaque = Math.min (niveauDAttaque,100);
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveauDAttaque=" + niveauDAttaque + '}';
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDAttaque() {
        return niveauDAttaque;
    }
    
}
