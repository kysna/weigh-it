/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weigh.it;

import java.math.BigDecimal;

/**
 *
 * @author Michal Kysilko
 */

public class TypLahve {
 
    double ean;
    static double vahaPlna;         //vaha plne lahve
    static double vahaPrazdna;      //vaha prazdne lahve           
    static double objemPlna;        //objem lahve
    double celkovyObjem;            //celkovy objem vsech dostupnych lahvi stejneho typu
    BigDecimal pocetLahvi;          //pocet lahvi k dispozici
    int id;
    String kategorie;               //kategorie alkoholu
    String nazev;                   //nazev typu alkoholu
    
    public double getVahaPlna(double ean){
        return this.vahaPlna;
    }
    
    public double getVahaPrazdna(double ean){
        return this.vahaPrazdna;
    }
    
    public double getObjemPlna(double ean){
        return this.objemPlna;
    }
    
    public double getCelkovyObjem(double ean){
        return this.celkovyObjem;
    }
    
    public void setCelkovyObjem(double c){
        this.celkovyObjem = c;
    }
    
    public BigDecimal getPocetLahvi(double ean){
        return this.pocetLahvi;
    }
    
    public void setPocetLahvi(BigDecimal p){
        this.pocetLahvi = p;
    }
    
    public int getId(double ean){
        return this.id;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
    public String getKategorie(double ean){
        return this.kategorie;
    }
    
    public void setKategorie(String s){
        this.kategorie = s;
    }
    
    public String getNazev(double ean){
        return this.nazev;
    }
    
    public void setNazev(String s){
        this.nazev = s;
    }
  
}
