/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paulh
 */
public class Jeu_Cadenas {
    
    public int[] combinaisonSecrete;

    public void genererCombinaison() {
        combinaisonSecrete = new int[4];
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = (int) (Math.random() * 10); 
        }
    }
    
    public void afficherSecret() {
        System.out.println(combinaisonSecrete);
    }
    
    public Resultat analyser(int[] secret, int[] essai) {
        Resultat r = new Resultat();
        
        r.justes=0;
        r.tropBas=0;
        r.tropHauts=0;

        for (int i = 0; i < secret.length; i++) {
            if (essai[i] == secret[i]) {
                r.justes++;
            } else if (essai[i] > secret[i]) {
                r.tropHauts++;
            } else {
                r.tropBas++;
            }
        }
        return r;
    }
    
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
