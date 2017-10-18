
/*  Alberto Candel Busquets
    Alberto Zapata de Miguel   */
//hola
//hola
package acamais;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AcamaIS {

    private ArrayList<Motos> motos = new ArrayList<Motos>();
    private ArrayList<Miembros> miembros = new ArrayList<Miembros>();
    private ArrayList<Cesiones> cesiones = new ArrayList<Cesiones>();


    public static void main(String[] args) {
        boolean x = false;
        AcamaIS a = new AcamaIS();

        int opcion;

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("ELIGE UNA OPCIÓN" + "\n\n"
                    + "1. Registrar un nuevo miembro: " + "\n"
                    + "2. Registrar una nueva motocicleta: " + "\n"
                    + "3. Registrar una cesión: " + "\n"
                    + "4. Listar en pantalla los miembros con motos en posesión: " + "\n"
                    + "5. Listar todas las motos: " + "\n"
                    + "6. Mostrar las cesiones realizadas: " + "\n"
                    + "7. Incrementar costos añadidos a las motos: " + "\n"
                    + "8. Salir del programa: " + "\n");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    a.creaMiembros();
                    x = true;
                    break;
                case 2: 
                    a.creaMotos(); 
                    x = true; 
                    break;
                case 3:
                    a.registrarCesion();
                    x = true;
                    break;
                case 4:
                    a.listarMiembros();
                    x = true;
                    break;
                case 5:
                    a.listarMotos();
                    x = true;
                    break;
                case 6:
                    a.listarCesiones();
                    x = true;
                    break;
                case 7:
                    a.incrementarGastos();
                    x=true;
                    break;
                case 8:
                    a.guardarYsalir();
                    x=false;
                    break;
            }
        } while (x == true);
    }

    //OPCION 1
    public void creaMiembros() {
        String n; 
        int s;
        boolean b = true;
        boolean exi = false;
        Scanner nm = new Scanner(System.in);
        do{
            try{
                
                System.out.println("Introduzca número de socio: " ); s = nm.nextInt();
                
                    for (int i=0; i<miembros.size(); i++) {
                        if(s == miembros.get(i).getSocio()) 
                        exi = true;
                    }
                
                    System.out.println("Introduzca nombre de socio: "); n = nm.next();
                    
                    if (exi == false){
                        miembros.add(new Miembros(s, n, 0, 0));
                    }
                    b = false;
                
            }catch(InputMismatchException ex) {
                System.out.println("¡ERROR! " + "Valor/es incorrecto\n");
                nm.nextLine();
                }
       }while (b);
       if (exi) System.out.println("SOCIO EXISTE\n");
       else System.out.println("MIEMBRO CREADO CORRECTAMENTE\n");
    }
        
    //OPCION 2
    public void creaMotos() {
        String m, mt; 
        int c, p, soci, cuenta, pr, contadorMotos,cA;
        int contador = 1;
        int contador2 = 0;
        boolean b = true;
        //boolean exi = false;
        Scanner md = new Scanner(System.in);
        do{
            try{
                System.out.println("Introduzca el modelo de la moto: "); m = md.next();
                System.out.println("Introduzca la matrícula de la moto: "); mt = md.next();
               
                System.out.println("Introduzca la cilindrada de la moto: ");c = md.nextInt();
                System.out.println("Introduzca el precio de la moto: "); p = md.nextInt();
                System.out.println("Introduzca el propietario de la moto: "); pr = md.nextInt();
                System.out.println("Introduzca costos añadidos: "); cA = md.nextInt();
        
                for (int i=0; i<miembros.size(); i++){
                    contadorMotos = miembros.get(i).getNumeroMotos();
                    soci = miembros.get(i).getSocio();
                    cuenta = miembros.get(i).getPrecioMotos();
            
                    if((pr == soci) && (cuenta+p <= 6000) ){
                        motos.add(new Motos(m, mt, c, p, pr,cA));
                        contadorMotos++;
                        
                        miembros.get(i).setNumeroMotos(contadorMotos);
                        miembros.get(i).setPrecioMotos(cuenta + p);
                        contador2++;
                    }   
                }
                b = false;
            }catch (InputMismatchException ex) {
                System.out.println("¡ERROR! " + "Valor/es incorrecto\n");
                md.nextLine();
            }
        }while(b);
        //if(exi) System.out.println("ERROR");
        if (contador == contador2) System.out.println("MOTO CREADA CORRECTAMENTE\n");
        else System.out.println("¡ERROR! Revise que el socio exista o que su presupuesto no haya superado los 6000 €\n");
    }
    
    //OPCION 3
    public void registrarCesion(){
        String moto, motoCatalogo; 
        int socio1, socio2, soci;
        int cuentaSocio, precioMoto, contadorMotos;
        int valido1 = 1, valido2 = 0;
        boolean b = true;
        Date fecha = new Date();
        Scanner md = new Scanner(System.in);
        do{
            try{
                System.out.println("Introduzca la moto que vaya a ser cedida: "); moto = md.next();
                System.out.println("Introduzca el actual propietario de la moto: "); socio1 = md.nextInt();
                System.out.println("Introduzca el nuevo propietario de la moto: ");socio2 = md.nextInt();
                System.out.println("Fecha de la cesión: " +fecha);
        
               for (int j=0; j<motos.size();j++){
                motoCatalogo=motos.get(j).getMatricula();
                    if (motoCatalogo.equals(moto)){
                    precioMoto=motos.get(j).getPrecio();
            
                        for (int i=0; i<miembros.size(); i++){
                
                            soci= miembros.get(i).getSocio();
                            cuentaSocio=miembros.get(i).getPrecioMotos();
                            int total=cuentaSocio+precioMoto;
                            int total1=cuentaSocio-precioMoto;
                                if((socio2==soci)&&(total<=6000)){
                                cesiones.add(new Cesiones(moto,socio1,socio2,fecha));
                                contadorMotos=miembros.get(i).getNumeroMotos();
                                contadorMotos++;
                   
                                miembros.get(i).setPrecioMotos(total);
                                miembros.get(i).setNumeroMotos(contadorMotos);
                                motos.get(j).setSocio(socio2);
                                valido2++;
                    
                                }
    
                            else if(socio1==soci){
                                contadorMotos=miembros.get(i).getNumeroMotos();
                                contadorMotos--;
                                miembros.get(i).setNumeroMotos(contadorMotos);
                                miembros.get(i).setPrecioMotos(total1);
                            }
                        
                            
                        }
            
                    } 
                }
            b = false;
            }catch (InputMismatchException ex) {
                System.out.println("¡ERROR! " + "Valor/es incorrecto\n");
                md.nextLine();
            }
        } while(b);
        if(valido1 == valido2){
            System.out.println("CESIÓN REALIZADA CORRECTAMENTE\n");
        }else{
            System.out.println("¡ERROR! La cesión no ha podido ser realizada, por favor, revise los datos\n");
        }
    }
        
    // OPCION 4
    public ArrayList listarMiembros() {
        if(miembros.isEmpty() == false){
            int cuentaMotos;
            for (int i = 0; i < miembros.size(); i++) {
                cuentaMotos = miembros.get(i).getNumeroMotos();
                if(cuentaMotos > 0){
                    System.out.println(miembros.get(i));
                }
            }
        }else System.out.println("No hay ningún socio con motos en posesión\n");
        
        return miembros;
    }

    //OPCION 5
    public ArrayList listarMotos(){
        if(motos.isEmpty() == false){
             for (int i=0; i<motos.size(); i++){
                 System.out.println(motos.get(i));
            }
        } else System.out.println("No hay motos registradas\n");
        
        return motos;
    }
    
    //OPCION 6
    public ArrayList listarCesiones(){
        if(cesiones.isEmpty() == false){
            for (int i=0; i<cesiones.size(); i++){
                System.out.println(cesiones.get(i));
            }
        }else System.out.println("No se ha realizado ninguna cesión\n");
        
        return cesiones;
    }
    //opcion7
    
    public void incrementarGastos(){
        String moto,motoCatalogo;
        int costeAdicional,coste;
        Scanner md = new Scanner(System.in);
        System.out.println("Introduzca la moto que vaya a ser cedida: "); moto = md.next();
        System.out.println("Introduzca el costo añadido: "); costeAdicional = md.nextInt();
        for (int j=0; j<motos.size();j++){
                motoCatalogo=motos.get(j).getMatricula();
                    if (motoCatalogo.equals(moto)){
                        coste=motos.get(j).getCostesAnyadidos();
                        motos.get(j).setCostesAnyadidos(costeAdicional+coste);
                        
                    }
        }
    }
    
    //OPCION 8
    public void guardarYsalir() {
        String fich;
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        Scanner md = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero: "); fich = md.next();
        try{
            fichero = new FileWriter("C:\\Users\\Alberto" +fich);
            pw = new PrintWriter(fichero);
            pw.println(listarMiembros());
            pw.println(listarCesiones()); 
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null != fichero) fichero.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
