package bataille;

import java.util.Scanner;

public class Mage extends Personnage {
    private String nom;
    private int pointsdevie;
    private int forcedefrappe;
    private int pointsdemana;
    private int spell;
    
public Mage() {
    this.nom="Mage";
    this.pointsdevie=100;
    this.forcedefrappe=20;
    this.pointsdemana=300;
    this.spell=0;
}

public Mage(String s, int pv, int fdf,int pdm){
    this.nom=s;
    this.pointsdevie=pv;
    this.forcedefrappe=fdf;
    this.pointsdemana=pdm;
    this.spell=0;
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
    return (this.nom+" crie "+ s + " et intimide l'ennemi !"); 
}
public void CastSpell(Personnage m){
    int a=m.getpv();
    int b=this.pointsdevie;
    System.out.println("Choisissez le sort 1,2 ou 3");
    Scanner sc = new Scanner( System.in );
    int choice=sc.nextInt();
    switch(choice){
        case 1: 
        System.out.println("Vous avez choisi de lancer une boule de feu !");
        this.spell=200;
        this.pointsdemana=this.pointsdemana-100;
        m.setpv(a-this.spell);
        System.out.println(m.getnom()+" perd "+(a-m.getpv())+" points de vie");
        System.out.println("Le sort a coûté 100 points de mana");
        System.out.println("Il vous reste "+this.pointsdemana+" points de mana");
        if(m.getpv()<0){
            m.setpv(0);
        }
        System.out.println("Points de vie restants : "+m.getpv()+"\n");
        break;
    
        case 2: 
        System.out.println("Vous avez choisi illumination !");
        this.spell=100;
        m.setpv(a-this.spell);
        this.pointsdemana=this.pointsdemana-200;
        System.out.println(m.getnom()+" perd "+(a-m.getpv())+" points de vie");
        this.pointsdevie=this.pointsdevie + 200;
        System.out.println("Vous vous soignez de "+(b-this.pointsdevie)+" points de vie !");
        if(m.getpv()<0){
            m.setpv(0);
        }
        System.out.println("Points de vie restants : "+m.getpv()+"\n");
        break;
        
        case 3: 
        System.out.println("Vous avez choisi oblitération !");
        this.spell=250;
        this.pointsdemana=this.pointsdemana-400;
        m.setpv(a-this.spell);
        System.out.println(m.getnom()+" perd "+(a-m.getpv())+" points de vie");
        break;  
        default: System.out.println("Le mage loupe son sort !");
    }
    m.setpv(m.getpv()-this.spell);
}

     public String mageUtilisateur(){
    Scanner sc = new Scanner( System.in );
    System.out.println("Saisir le nom du mage");
    String nom=sc.nextLine();
    this.nom=nom;
    System.out.println("Saisir les points de vie du mage");
    int pv=sc.nextInt();
    this.pointsdevie=pv;
    System.out.println("Saisir la force de frappe du mage");
    int fdf=sc.nextInt();
    this.forcedefrappe=fdf;
    System.out.println("Saisir les points de mana du mage");
    int pdm=sc.nextInt();
    this.pointsdemana=pdm;
    return ("Votre mage se nomme "+nom+ " avec "+pv+" points de vie "+pdm+" points de mana et "+fdf+" de force de frappe");

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
        System.out.println(this.nom+" utilise sa magie sur "+ g.getnom()+" pour le blesser");
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
        System.out.println(this.nom+" altere l'esprit de "+ g.getnom()+" pour lui infliger des dégâts");
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
