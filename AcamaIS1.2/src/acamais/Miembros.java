
package acamais;

import java.util.Comparator;

public class Miembros implements Comparable{
      
    private int socio;
    private String nombre;
    private int nMotos;
    private int pMotos;
    private int cesionesM;
    
    public Miembros(int socio, String nombre, int nMotos, int pMotos, int cesionesM){
        this.socio = socio;
        this.nombre = nombre;
        this.nMotos = nMotos;
        this.pMotos = pMotos;
        this.cesionesM=cesionesM;
    }
    
    public int getSocio() { return socio; }
    public String getNombre(){ return nombre; }
    public int getNumeroMotos() {return nMotos; }
    public int getPrecioMotos(){ return pMotos; }
    public int getNumCesiones(){ return cesionesM; }
    
    public void setSocio(int socio) { this.socio = socio; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setNumeroMotos (int nMotos){ this.nMotos = nMotos; }
    public void setPrecioMotos(int pMotos){ this.pMotos = pMotos; }
    public void setNumCesiones(int cesionesM){ this.cesionesM = cesionesM; }
    
    @Override
    public String toString(){
        String rm = String.format("NÚMERO_SOCIO: %1$d NOMBRE: %2$s NÚMERO_MOTOS: %3$d PRECIO_TOTAL_MOTOS: %4$d CESIONES_RECIBIDAS: %5$d" 
                ,socio, nombre, nMotos, pMotos, cesionesM);
        
        return rm;
    }

    //@Override
   /* public int compareTo(Miembros o) {
        if (cesionesM < o.cesionesM) {
                return -1;
            }
            if (cesionesM > o.cesionesM) {
                return 1;
            }
            return 0;
        
    }*/
    
   

    @Override
    public int compareTo(Object o) {
         Miembros m = (Miembros) o;
 
        //comparamos el nombre de este objeto con el nombre del otro objeto
        return this.nombre.compareTo(m.getNombre());
    }
     class OrderByCes implements Comparator<Miembros> {
     
     @Override
     public int compare(Miembros m1, Miembros m2) {
        if (m1.cesionesM == m2.cesionesM) {          //si la edad de la primer persona es igual a la edad de la segunda retornamos 0
            return 0;
        } else if (m1.cesionesM > m2.cesionesM) {    //si la edad de la primer persona es mayor la edad de la segunda retornamos 1
            return 1;
        } else {                           //si la edad de la primer persona es menor la edad de la segunda retornamos -1
            return -1;
        }
    }
   
        
    }   
}