package bataille;
import java.util.Scanner;


public class Prêtre extends Personnage{

    private String nom;
    private int pointsdevie;
    private int forcedefrappe;
    private int pointsdemana;
    
public Prêtre() {
    this.nom="Prêtre";
    this.pointsdevie=200;
    this.forcedefrappe=10;
    this.pointsdemana=200;
}

public Prêtre(String s, int pv, int fdf,int pdm){
    this.nom=s;
    this.pointsdevie=pv;
    this.forcedefrappe=fdf;
    this.pointsdemana=pdm;
}
public int getpv(){
    return this.pointsdevie;
}
public int getfdf(){
    return this.forcedefrappe;
}
public String getnom(){
    return this.nom;
}
public int getpdm(){
    return this.pointsdemana;
}
public void setpv(int nb){
    this.pointsdevie=nb;
}
public void setfdf(int nb){
    this.forcedefrappe=nb;
}
public void setnom(String s){
    this.nom=s;
}
public void setpdm(int nb){
    this.pointsdemana=nb;
}
public String Crier(String s) {
    return (this.nom+" crie "+ s + " et attendrie l'ennemi !"); 
}

public void Soigner(Personnage m){
    System.out.println(this.nom+" s'apprête à soigner "+m.getnom());
     this.pointsdemana=this.pointsdemana-50;
     if(pointsdemana<50){
            System.out.println("Vous n'avez plus assez de mana ! Le soin a echoué "+"("+this.pointsdemana+")");
        m.setpv(m.getpv()+0);
        }
     
     else {
         m.setpv(m.getpv()+75);
         System.out.println("Le soin a réussi ! (+75 pv)"+ "("+m.getpv()+")");      
     }
}
   public String pretreUtilisateur(){
    Scanner sc = new Scanner( System.in );
    System.out.println("Saisir le nom du prêtre");
    String nom=sc.nextLine();
    this.nom=nom;
    System.out.println("Saisir les points de vie du prêtre");
    int pv=sc.nextInt();
    this.pointsdevie=pv;
    System.out.println("Saisir la force de frappe du prêtre");
    int fdf=sc.nextInt();
    this.forcedefrappe=fdf;
    System.out.println("Saisir les points de mana du prêtre");
    int pdm=sc.nextInt();
    this.pointsdemana=pdm;
    return "Votre prêtre se nomme "+nom+ " avec "+pv+" points de vie,"+pdm+" points de mana et "+fdf+" de force de frappe";
}
   public void Attaquer(Personnage g){
         int a=g.getpv();
      switch(aleatoire(1,3)){
        case 1: 
        System.out.println(this.nom+" frappe "+ g.getnom()+" violemment avec son sceptre");
        if (coupcritique(aleatoire(1,10))==true){
        g.setpv(g.getpv()-(this.forcedefrappe*2));
        System.out.println("Coup critique ! (dégâts x2)");
        }
        else {
          g.setpv(g.getpv()-this.forcedefrappe);
        }
        System.out.println(g.getnom()+" perd "+(a-g.getpv())+" points de vie");
        if(g.getpv()<0){
            g.setpv(0);
        }
        System.out.println("Points de vie restants : "+g.getpv()+"\n");
        break;
        case 2: 
        System.out.println(this.nom+" utilise ses incantations sur "+ g.getnom()+" pour le blesser");
        if (coupcritique(aleatoire(1,10))==true){
        g.setpv(g.getpv()-(this.forcedefrappe*2));
        
        System.out.println("Coup critique ! (dégâts x2)");
        }
        else {
          g.setpv(g.getpv()-this.forcedefrappe);
        }
        System.out.println(g.getnom()+" perd "+(a-g.getpv())+" points de vie");
        if(g.getpv()<0){
            g.setpv(0);
        }
        System.out.println("Points de vie restants : "+g.getpv()+"\n");
        break;
        case 3: 
        System.out.println(this.nom+" maudit "+ g.getnom()+" pour lui infliger des dégâts");
        if (coupcritique(aleatoire(1,10))==true){
        g.setpv(g.getpv()-(this.forcedefrappe*2));
        System.out.println("Coup critique ! (dégâts x2)");
        }
        else {
          g.setpv(g.getpv()-this.forcedefrappe);
        }
        System.out.println(g.getnom()+" perd "+(a-g.getpv())+" points de vie");
        if(g.getpv()<0){
            g.setpv(0);
        }
        System.out.println("Points de vie restants : "+g.getpv()+"\n");
        break;  
        default: System.out.println(this.nom+" attaque "+ g.getnom());
        if (coupcritique(aleatoire(1,10))==true){
        g.setpv(g.getpv()-(this.forcedefrappe*2));
        System.out.println("Coup critique ! (dégâts x2)");
        }
        else {
          g.setpv(g.getpv()-this.forcedefrappe);
        }
        System.out.println(g.getnom()+" perd "+(a-g.getpv())+" points de vie");
        if(g.getpv()<0){
            g.setpv(0);
        }
        System.out.println("Points de vie restants : "+g.getpv()+"\n");
    

  }
}
}

    

