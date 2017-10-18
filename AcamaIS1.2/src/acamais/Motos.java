package acamais;


public class Motos {
    private String modelo;
    private int cilindrada;
    private int precio;
    private int socio;
    private String matricula;
    
    
    
    public Motos(String modelo, String matricula, int cilindrada, int precio, int socio){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.socio = socio;
        
    }
    
    public String getModelo(){ return modelo; }
    public String getMatricula() {return matricula; }
    public int getCilindrada(){ return cilindrada;}
    public int getPrecio(){ return precio; }
    public int getSocio(){ return socio;}
    
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMatricula(String matricula) {this.matricula = matricula; }
    public void setCilindrada(int cilindrada){ this.cilindrada = cilindrada; }
    public void setPrecio(int precio) { this.precio = precio; }
    public void setSocio(int socio) {this.socio = socio; }
    
    @Override
    public String toString(){
        String rm = String.format("MODELO: %1$s MATRICULA: %2$s CILINDRADA: %3$d PRECIO: %4$d PROPIETARIO: %5$d" 
                ,modelo, matricula, cilindrada, precio, socio);
            
        return rm;
    }
}
