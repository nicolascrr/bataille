
package bataille;


public class Personnage {

    private String nom;
    private int pointsdevie;
    private int forcedefrappe;
    private int pointsdemana;
    
    public Personnage(){
        this.nom="Nicolas";
        this.pointsdevie=200;
        this.forcedefrappe=50;
        this.pointsdemana=0;
    }
    public Personnage(String s,int pv, int fdf){
        this.nom=s;
        this.pointsdevie=pv;
        this.forcedefrappe=fdf;
       
    }
    public String Crier(String s) {
    return (this.nom+" crie "+ s + " et terrifie l'ennemi !"); 
}
    
public int aleatoire(int borneinf, int bornesup) {
    return borneinf + (int)(Math.random() * ((bornesup - borneinf) + 1));
}   
public int getpv(){
    return this.pointsdevie;
}
public int getfdf(){
    return this.forcedefrappe;
}
public int getpdm(){
    return this.pointsdemana;
}
public String getnom(){
    return this.nom;
}
public void setpv(int nb){
    this.pointsdevie=nb;
}
public void setfdp(int nb){
    this.forcedefrappe=nb;
}
public void setnom(String s){
    this.nom=s;
}
public void CastSpell(Personnage m){

}
public boolean coupcritique(int a){
    int b=aleatoire(1,10);
    if (b==a) {
        return true;        
    }
    else {
        return false;
    }   
}
public void Attaquer(Personnage g){
    
    switch(aleatoire(1,3)){
        case 1: 
        System.out.println(this.nom+" frappe violemment "+ g.getnom());
        g.setpv(g.getpv()-this.forcedefrappe);
        if(g.getpv()<0){
            g.setpv(0);
        }
         break;
        case 2: 
        System.out.println(this.nom+" blesse grièvement "+ g.getnom());
        g.setpv(g.getpv()-this.forcedefrappe);
        if(g.getpv()<0){
            g.setpv(0);
        }
        break;
        case 3: 
        System.out.println(this.nom+" cogne dangereusement "+ g.getnom());
        g.setpv(g.getpv()-this.forcedefrappe);
        if(g.getpv()<0){
            g.setpv(0);
        }
        break;  
        default: System.out.println(this.nom+" attaque "+ g.getnom());
        g.setpv(g.getpv()-this.forcedefrappe);
        if(g.getpv()<0){
            g.setpv(0);
        }
    

  }
 }
}
