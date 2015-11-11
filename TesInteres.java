//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado
import java.util.Scanner;
public class TesInteres{
   public static void main(String[] arg){
        //preparamos el scanner
        //lectura de lo datos
        //llamada al método calcularInteres
        //mostramos por pantalla el valor del interés
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un Capital, un tiempo y tasa de interes");
		double capital = sc.nextDouble();
		double tiempo = sc.nextDouble();
		double tasaInteres = sc.nextDouble();
		double calculo=Interes.calcularInteres(capital, tiempo, tasaInteres);
		System.out.printf("el interes es : "+calculo);
		//System.out.printf("calculo resultante %.2f/n," calculo);
   }
}
