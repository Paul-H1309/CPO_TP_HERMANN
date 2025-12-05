/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Jeu_Cadenas {
    
    public int Verifier(int Nbr, int NbrTrue){
        int h=0;
        if (Nbr<NbrTrue){
            h=2;
        }if (Nbr>NbrTrue){
            h=1;
        }
        return h;
    }
    
    
    
}
