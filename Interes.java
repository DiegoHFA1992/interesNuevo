//fichero Interes.java
/**Clase el interés (I) que produce un capital
*el cúal  es directamente proporcional al capital inicial (C),
* al tiempo (t), y a la tasa de interés (i) :
*I = C · i · t
*@autor Manuel
* @version 1.0
*/

public class Interes{
	/**metodo calcularInteres que nos sirve para aplicar 
	 * la formula I=C*i*t
	 * @param capital, capital inicial
	 * @param tiempo, tiempo de amortizacion
	 * @param tasaInteres, tasa interes anual
	 * @return interes, calculo de la formula
	 */
public static double calcularInteres(double capital, double tiempo, double tasaInteres){
   //código para calcular el interes
   //return interes
   double interes = capital*tiempo*tasaInteres;
   return interes;
   
}
}
