package acamais;


public class Motos {
    private String modelo;
    private int cilindrada;
    private int precio;
    private int socio;
    private String matricula;
    private int costesAnyadidos;
    
    
    
    public Motos(String modelo, String matricula, int cilindrada, int precio, int socio,int costesAnyadidos){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.precio = precio;
        this.socio = socio;
        this.costesAnyadidos=costesAnyadidos;
        
    }
    
    public String getModelo(){ return modelo; }
    public String getMatricula() {return matricula; }
    public int getCilindrada(){ return cilindrada;}
    public int getPrecio(){ return precio; }
    public int getSocio(){ return socio;}
    public int getCostesAnyadidos(){ return costesAnyadidos;}
    
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMatricula(String matricula) {this.matricula = matricula; }
    public void setCilindrada(int cilindrada){ this.cilindrada = cilindrada; }
    public void setPrecio(int precio) { this.precio = precio; }
    public void setSocio(int socio) {this.socio = socio; }
     public void setCostesAnyadidos(int costesAnyadidos) {this.costesAnyadidos = costesAnyadidos; }
    @Override
    public String toString(){
        String rm; 
        rm = String.format("MODELO: %1$s MATRICULA: %2$s CILINDRADA: %3$d PRECIO: %4$d PROPIETARIO: %5$d  Costes añadidos: %6$d" 
                ,modelo, matricula, cilindrada, precio, socio, costesAnyadidos);
            
        return rm;
    }
}
