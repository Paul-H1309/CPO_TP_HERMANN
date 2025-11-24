package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Guerrier extends Personnage{
    private boolean aCheval;
    static int nbGuerrier = 0;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        nbGuerrier++;
    }
    
    public void destroy() {
        nbGuerrier--;
        super.destroy();
    }

    public static int getNbGuerrier() {
        return nbGuerrier;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
    
    
}
