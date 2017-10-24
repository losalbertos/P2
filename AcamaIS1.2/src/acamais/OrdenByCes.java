/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acamais;

import java.util.Comparator;

/**
 *
 * @author Zapata
 */
class OrdenByCes implements Comparator<Miembros> {
     
     @Override
     public int compare(Miembros m1, Miembros m2) {
        if (m1.getNumCesiones() == m2.getNumCesiones()) {         
            return 0;
        } else if (m1.getNumCesiones() > m2.getNumCesiones()) {   
            return 1;
        } else {                          
            return -1;
        }
    }
   
      
}
