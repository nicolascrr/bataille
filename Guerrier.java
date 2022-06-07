package bataille;
import java.util.Scanner;


public class Guerrier extends Personnage{
    
    private String nom;
    private int pointsdevie;
    private int forcedefrappe;
    
public Guerrier() {
    this.nom="Guerrier";
    this.pointsdevie=300;
    this.forcedefrappe=30;
}

public Guerrier(String s, int pv, int fdf){
    this.nom=s;
    this.pointsdevie=pv;
    this.forcedefrappe=fdf;
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
public void setpv(int nb){
    this.pointsdevie=nb;
}
public void setfdf(int nb){
    this.forcedefrappe=nb;
}
public void setnom(String s){
    this.nom=s;
}
public String Crier(String s) {
    return (this.nom+" crie "+ s + " et terrifie l'ennemi !"); 
}

public String guerrierUtilisateur(){
    Scanner sc = new Scanner( System.in );
    System.out.println("Saisir le nom du guerrier");
    String nom=sc.nextLine();
    this.nom=nom;
    System.out.println("Saisir les points de vie du guerrier");
    int pv=sc.nextInt();
    this.pointsdevie=pv;
    System.out.println("Saisir la force de frappe du guerrier");
    int fdf=sc.nextInt();
    this.forcedefrappe=fdf;
    return "Votre guerrier se nomme "+nom+ " avec "+pv+" points de vie et "+fdf+" de force de frappe";
        
}
public void Attaquer(Personnage g){
         int a=g.getpv();
      switch(aleatoire(1,3)){
        case 1: 
        System.out.println(this.nom+" frappe "+ g.getnom()+" violemment avec son épée");
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
        System.out.println(this.nom+" projette sa lance sur "+ g.getnom()+" pour le blesser");
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
        System.out.println(this.nom+" poignarde "+ g.getnom()+" pour lui infliger des dégâts");
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
