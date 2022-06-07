package bataille;
import java.util.Scanner;
import java.lang.*;

public class main {
    
public static void main(String[] args) {
        Mage m1 = new Mage("Gandalf",1500,200,600);
        Guerrier g1 = new Guerrier("Achille",2000,250);
        Prêtre p1 = new Prêtre("François",1200,50,800);
        
        
       //System.out.println(m1.mageUtilisateur());
       //System.out.println(g1.guerrierUtilisateur());
       //System.out.println(p1.pretreUtilisateur());
      // System.out.println(m1.getpv());
      // System.out.println(g1.getfdf());
      // g1.Attaquer(m1);
      // System.out.println(m1.getpv());
      Combat(p1,m1);
      
               
}
public static void Combat(Personnage g, Personnage a){
    int count=0;
   System.out.println("Le combat entre "+g.getnom()+" et "+a.getnom()+" peut commencer !\n");
   System.out.println("Joueur 1, choisissez le cri de guerre de "+g.getnom());
   Scanner sc1 = new Scanner( System.in );
   String cri1 = sc1.next();
   System.out.println("Joueur 2, choisissez le cri de guerre de "+a.getnom());
   Scanner sc2 = new Scanner( System.in );
   String cri2 = sc2.next();
   System.out.println("\n");
   System.out.println(g.Crier(cri1));
   System.out.println(a.Crier(cri2));
   System.out.println("\n");
    while(a.getpv()>0 && g.getpv()>0){
        count++;
        System.out.println("Tour "+count+"\n");
        if ((count%3==0) && (g instanceof Mage)){
            System.out.println("Vous avez "+g.getpdm()+" points de mana."+" Voulez-vous lancer un sort ? o/n\n");
            Scanner sc = new Scanner( System.in );
            String rep = sc.next();
             while (!"o".equals(rep) && !"n".equals(rep)) {
                System.out.println("Entrez 'o' pour 'oui' ou 'n' pour non !");
                System.out.println("Vous avez "+g.getpdm()+" points de mana."+" Voulez-vous lancer un sort ? o/n\n");
                rep = sc.next();
            }
            if ("o".equals(rep) || "o".equals(rep)) {
                g.CastSpell(a);
                if(a.getpv()<=0){
                System.out.println(g.getnom()+" est le vainqueur !");
                System.exit(0);
            }
            }
        }
        else {
        g.Attaquer(a);
        if(a.getpv()<=0){
        System.out.println(g.getnom()+" est le vainqueur !");
        System.exit(0);
        } 
            }
        
    
       if ((count%3==0) && (a instanceof Mage)){
            System.out.println("Vous avez "+a.getpdm()+" points de mana."+" Voulez-vous lancer un sort ? o/n\n");
            Scanner sc = new Scanner( System.in );
            String rep = sc.next();
             while (!"o".equals(rep) && !"n".equals(rep)) {
                System.out.println("Entrez 'o' pour 'oui' ou 'n' pour non !");
                System.out.println("Vous avez "+a.getpdm()+" points de mana."+" Voulez-vous lancer un sort ? o/n\n");
                rep = sc.next();
            }
            if ("o".equals(rep) || "O".equals(rep)) {
                a.CastSpell(g);
                if(g.getpv()<=0){
                System.out.println(a.getnom()+" est le vainqueur !");
                System.exit(0);
            }
            }
       }
        else {
        a.Attaquer(g);
        if(g.getpv()<=0){
        System.out.println(a.getnom()+" est le vainqueur !");
        System.exit(0);
        } 
            }
        
    }
}
}
            
        
    
    


    

