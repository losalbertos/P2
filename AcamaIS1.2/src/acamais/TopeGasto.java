/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acamais;

/**
 *
 * @author Zapata
 */
public class TopeGasto {
       
    private int tope;
    
    public TopeGasto( int tope){
        
        this.tope=tope;
        
    }

    TopeGasto() {
        tope=0;
    }
    
    public int getTope() { return tope; }
    public void setTope(int tope){ this.tope=tope;}
  
}
