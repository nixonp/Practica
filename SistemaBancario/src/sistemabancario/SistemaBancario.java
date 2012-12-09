/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SistemaBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
      InputStreamReader  lector   = new InputStreamReader(System.in);
      BufferedReader     leer     = new BufferedReader(lector);
      int opcion=-1;
      String Respuesta = "S";       
        while(opcion < 6 && (Respuesta.equals("S")||Respuesta.equals("s"))){
            try {
                opcion = MenuPrincipal();
            } catch (IOException ex) {
                Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (opcion)
            {
                      case 1: 
                          Cuentas();
                        break;                    
                      case 2:
                        break;
                      case 3: 
                        break;
                      case 4: 
                          break;
                      case 5: 
                          Parametros();
                      default: System.exit(0);
            }
            
            if(opcion<6)
            {
                System.out.println("\nDesea Volver al Menú Principal (S/N): ");
                try {
                    Respuesta = leer.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
      }
    }
     public static int MenuPrincipal() throws IOException 
     {
     InputStreamReader lector = new InputStreamReader(System.in);
     BufferedReader      leer = new BufferedReader(lector);
     System.out.println("--------Sistema Bancario-------");
     System.out.println("1.- Cuentas Bancarias");
     System.out.println("2.- Operaciones Bancarias");
     System.out.println("3.- Reportes del Sistema");
     System.out.println("4.- Parámetros Bancarios");
     System.out.println("5.- Salir");
     System.out.println("Seleccione una Opcion:  ");
     return  ( Integer.parseInt(leer.readLine()) );
     }

   

    private static void Cuentas() {
         {
      InputStreamReader  lector   = new InputStreamReader(System.in);
      BufferedReader     leer     = new BufferedReader(lector);
      int opcion=-1;
      String Respuesta = "S";       
        while(opcion < 5 && (Respuesta.equals("S")||Respuesta.equals("s"))){
            try {
                opcion = MenuCuentas();
            } catch (IOException ex) {
                Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (opcion)
            {
                      case 1: 
                          break;                    
                      case 2:
                        break;
                      case 4: System.exit(0);
                          break;
                      default: System.exit(0);
            }
            
            if(opcion<5)
            {
                System.out.println("\nDesea Volver al Menú Principal (S/N): ");
                try {
                    Respuesta = leer.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
      }
    }
    }
    
     private static int MenuCuentas() throws IOException {
     InputStreamReader lector = new InputStreamReader(System.in);
     BufferedReader      leer = new BufferedReader(lector);
        System.out.println("-------Cuentas-------------");
        System.out.println("1.- Nuevo Cliente");
        System.out.println("2.- Nueva Cuenta");
        System.out.println("7.- Salir.");
        System.out.println("Seleccione su opcion: ");
        return  ( Integer.parseInt(leer.readLine()) );
    }

     private static void Parametros() {
         {
      InputStreamReader  lector   = new InputStreamReader(System.in);
      BufferedReader     leer     = new BufferedReader(lector);
      int opcion=-1;
      String Respuesta = "S";       
        while(opcion < 4 && (Respuesta.equals("S")||Respuesta.equals("s"))){
            try {
                opcion = MenuParametros();
            } catch (IOException ex) {
                Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
            }
            switch (opcion)
            {
                      case 1: 
                          break;                    
                      case 2:
                        break;
                      case 3: 
                          break;
                      default: System.exit(0);
            }
            
            if(opcion<4)
            {
                System.out.println("\nDesea Volver al Menú Principal (S/N): ");
                try {
                    Respuesta = leer.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(SistemaBancario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
      }
    }
    }
    
     private static int MenuParametros() throws IOException {
     InputStreamReader lector = new InputStreamReader(System.in);
     BufferedReader      leer = new BufferedReader(lector);
        System.out.println("-------Cuentas-------------");
        System.out.println("1.- Tipo de Cuentas");
        System.out.println("2.- Tipo de Operaciones");
        System.out.println("3.- Salir.");
        System.out.println("Seleccione su opcion: ");
        return  ( Integer.parseInt(leer.readLine()) );
    }

 }