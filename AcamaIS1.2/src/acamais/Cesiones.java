
package acamais;

import java.util.Date;

public class Cesiones {
    
  
    private String motoImplicada;
    private int socioImplicado1,socioImplicado2;
    private Date fecha;
    
    public Cesiones( String motoImplicada, int socioImplicado1,int socioImplicado2, Date fecha){
        
        this.motoImplicada = motoImplicada;
        this.socioImplicado1 = socioImplicado1;
        this.socioImplicado2 = socioImplicado2;
        this.fecha = fecha;
    }
    
    public String getMotoImplicada() { return motoImplicada; }
    public int getSocioImplicado1(){ return socioImplicado1; }
    public int getSocioImplicado2(){ return socioImplicado2; }
    public Date getFecha(){ return fecha; }
    
    public void setMotoImplicada(String motoImplicada) { this.motoImplicada = motoImplicada; }
    public void setSocioImplicado1(int socioImplicado1){ this.socioImplicado1 = socioImplicado1; }
    public void setSocioImplicado2(int socioImplicado2){ this.socioImplicado2 = socioImplicado2; }
    public void setFecha(Date fecha){ this.fecha = fecha; }
    
    @Override
    public String toString(){
        
        String rm = String.format("MOTO_CEDIDA: %1$s ANTERIOR_PROPIETARIO: %2$d ACTUAL_PROPIETARIO: %3$d FECHA: %4$s", 
                motoImplicada, socioImplicado1, socioImplicado2, fecha);
        
        return rm;
    }
}
