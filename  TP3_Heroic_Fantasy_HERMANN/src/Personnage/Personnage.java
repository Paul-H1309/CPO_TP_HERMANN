package Personnage;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Armes.*;
/**
 *
 * @author paulh
 */
public abstract class Personnage {
    
    private String nom;
    private int niveauDeVie;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", niveauDeVie=" + niveauDeVie +"L'arme en main ="+armeEnMain+ '}';
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }
    
    Arme armeEnMain=null;
    
    public void equiperArme(Arme arme0){
        for (Arme a:TabP){
            if(a==arme0){
                armeEnMain=arme0;
            }
        }
    }
    
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    ArrayList<Arme> TabP = new ArrayList<Arme>();
    int Nb = TabP.size();
    
    public void ajouteArme(Arme Arme0){
    if (Nb<=5){
        TabP.add(Arme0);
    }else{
        System.out.println("Trop d'armes");
    }
}
}
