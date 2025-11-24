package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author paulh
 */
public interface etreVivant {
    
    public void seFatiguer(){
        int apresFat;
        Personnage.niveauDeVie=Personnage.niveauDeVie-10;
        return apresFat;
    }
    
    public boolean estVivant(){
        boolean vie;
        if(Personnage.niveauDeVie<=0){
            vie=false;
        }else{
            vie=true;
        }
        return vie;
    }
    
    void estAttaqué(int points){
         int nouveauPV;
         Personnage.niveauDeVie=Personnage.niveauDeVie-points;
         return nouveauPV;
    }
    
}
    

