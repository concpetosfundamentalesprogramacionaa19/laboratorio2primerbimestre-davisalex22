package laboratorio_2;

import java.util.Scanner;

public class pruba {
    public static void main(String[] args) {
// INICIO DEL PROGRAMA
    Scanner entrada = new Scanner(System.in);
// Declaracion de variables
    String mensajeFinal2 = "";

    double sueldo = 0;
    double pasaje = 0;
    double bar = 0;
    double salidas = 0;
int hijos = 0;
    int contador2 = 1;
    
    double tot_pasajes =0;
    double tot_bar =0;
    double tot_salidas =0;
    double totales =0;
    
    System.out.println("Ingrese la cantidad de hijos que tiene:\n");
         hijos = entrada.nextInt();

                  
  while (contador2 <= hijos) {
    System.out.println("Ingrese el gasto de pasaje de hijo "+contador2+ ":\n");
       pasaje = entrada.nextDouble();  
    System.out.println("Ingrese el gasto de bar de hijo "+contador2+ ":\n");
       bar = entrada.nextDouble();
    System.out.println("Ingrese el gasto de salidas de hijo "+contador2+ ":\n");
       salidas = entrada.nextDouble();       
    mensajeFinal2 = String.format("%sHijo  %d      %.2f      %.2f      %.2f "
                                   + "   \n\n",mensajeFinal2,contador2,
                                    pasaje,bar,salidas);        
    contador2 = contador2 + 1;//que el contador2 se increm
 // Calculo de los totales
    tot_pasajes = tot_pasajes+pasaje;
    tot_bar = tot_bar+bar;
    tot_salidas = tot_salidas+salidas;
  }   
    mensajeFinal2 = String.format("%sTotales      %.2f      %.2f      %.2f"
                                   + "    \n\n",mensajeFinal2,tot_pasajes,
                                   tot_bar,tot_salidas); 
     System.out.printf("%s", mensajeFinal2);  
}
}