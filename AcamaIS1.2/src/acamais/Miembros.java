
package acamais;

public class Miembros {
      
    private int socio;
    private String nombre;
    private int nMotos;
    private int pMotos;
    
    public Miembros(int socio, String nombre, int nMotos, int pMotos){
        this.socio = socio;
        this.nombre = nombre;
        this.nMotos = nMotos;
        this.pMotos = pMotos;
    }
    
    public int getSocio() { return socio; }
    public String getNombre(){ return nombre; }
    public int getNumeroMotos() {return nMotos; }
    public int getPrecioMotos(){ return pMotos; }
    
    public void setSocio(int socio) { this.socio = socio; }
    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setNumeroMotos (int nMotos){ this.nMotos = nMotos; }
    public void setPrecioMotos(int pMotos){ this.pMotos = pMotos; }
    
    @Override
    public String toString(){
        String rm = String.format("NÚMERO_SOCIO: %1$d NOMBRE: %2$s NÚMERO_MOTOS: %3$d PRECIO_TOTAL_MOTOS: %4$d" 
                ,socio, nombre, nMotos, pMotos);
        
        return rm;
    }
}