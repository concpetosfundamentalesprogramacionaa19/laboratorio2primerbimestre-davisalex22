package laboratorio_2;
import java.util.Scanner;
public class Laboratorio_2 {
    public static void main(String[] args) {
// INICIO DEL PROGRAMA
    Scanner entrada = new Scanner(System.in);
// Declaracion de variables
    String mensajeFinal = "";
    String nombre = "";
    String apellido = "";
    double sueldo = 0;
    double pasaje = 0;
    double bar = 0;
    double salidas = 0;
    String opcion = "";
    int hijos = 0;
    int contador = 1;
    int contador2 = 1;
    boolean bandera = true;
    double tot_pasajes =0;
    double tot_bar =0;
    double tot_salidas =0;
    double totales =0;
// Inicio de uso de estructuras condicionales                                                       
mensajeFinal = String.format("\n\n%s%s\n\n",mensajeFinal,
                "Reporte Gastos de Padres de Familia");
while(bandera == true ){
    // Ingreso de datos por teclado parte 1
    System.out.println("Ingrese sus nombre:\n");
        nombre = entrada.nextLine();
    System.out.println("Ingrese sus apellidos:\n");
        apellido = entrada.nextLine();
    System.out.println("Ingrese su sueldo semanal:\n");
        sueldo = entrada.nextDouble();
    System.out.println("Ingrese la cantidad de hijos que tiene:\n");
        hijos = entrada.nextInt();
    // Uso de String.format       
    mensajeFinal = String.format("%sReporte  %d:\n\n",mensajeFinal,contador);
    contador = contador + 1; //que el contador se incremente
    mensajeFinal = String.format("%sNombre del padre de familia :  "
                + "%s\nSueldo semanal : %.2f\nNúmero de Hijos: %d\n\nReporte de"
                 + " Gastos\nPersona      Pasaje      Bar      Salidas\n"
                  ,mensajeFinal,nombre+" "+apellido,sueldo,hijos); 
  // Uso de estructura condicional para segunda parte  (Reporte de Gastos)  
  while (contador2 <= hijos) {
    // Ingreso de datos por teclado  
    System.out.println("Ingrese el gasto de pasaje de hijo "+contador2+ ":\n");
       pasaje = entrada.nextDouble();  
    System.out.println("Ingrese el gasto de bar de hijo "+contador2+ ":\n");
       bar = entrada.nextDouble();
    System.out.println("Ingrese el gasto de salidas de hijo "+contador2+ ":\n");
       salidas = entrada.nextDouble();
    // Uso de String.format     
    mensajeFinal = String.format("%sHijo  %d      %.2f       %.2f       %.2f "
                                   + "   \n\n",mensajeFinal,contador2,
                                    pasaje,bar,salidas);        
    contador2 = contador2 + 1;//que el contador2 se increm
 // Calculo de los totales
    tot_pasajes = tot_pasajes+pasaje;
    tot_bar = tot_bar+bar;
    tot_salidas = tot_salidas+salidas;
    totales = tot_pasajes + tot_bar + tot_salidas;
  }   
  // Uso de String.format    
  mensajeFinal = String.format("%sTotales      %.2f       %.2f       %.2f\n"
          + "* Total de gastos:  %.2f    \n\n",mensajeFinal,tot_pasajes,
                                   tot_bar,tot_salidas,totales); 
  // Estructura condicional que evalua el resultado final
    if (totales < sueldo) {
        mensajeFinal = String.format("%sEl padre de familia %s le alcanza el"
                + " dinero semanal para sus gastos\n",mensajeFinal,nombre+" "+
                        apellido);
    } else {
        mensajeFinal = String.format("%sEl padre de familia %s le falta el "
                + "dinero semanal para sus gastos\n",mensajeFinal,nombre+" "+
                        apellido);}
entrada.nextLine();// Limpieza del buffer    
    //Evaluacion si desea continuar o no ingresando información 
        System.out.println("Digite 's' para seguir o 'n' para salir");
            opcion = entrada.nextLine();
        if (opcion.equals("s")) {
            bandera = true;
            contador2 = 1;
        }else{
            bandera = false;
            }
    mensajeFinal = String.format("%s -----  Fin de Reporte  %d -----\n\n",
                                 mensajeFinal,contador-1);    
}
// Muestra de resultado por pantalla        
    System.out.printf("%s",mensajeFinal);   
// FIN DE PROGRAMA        
    }
    
}
