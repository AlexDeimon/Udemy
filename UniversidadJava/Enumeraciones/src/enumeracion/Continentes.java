/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author DIEGO
 */
public enum Continentes {
    AFRICA(53, "cinco millones"),
    EUROPA(46, "cinco millones"),
    ASIA(44, "cinco millones"),
    AMERICA(34, "cinco millones"),
    OCEANIA(14, "cinco millones");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
    
}
