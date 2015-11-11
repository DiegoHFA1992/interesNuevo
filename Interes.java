//fichero Interes.java
//Clase el interés (I) que produce un capital
//el cúal  es directamente proporcional al capital inicial (C),
// al tiempo (t), y a la tasa de interés (i) :
//I = C · i · t

public class Interes{
public static double calcularInteres(double capital, double tiempo, double tasaInteres){
   //código para calcular el interes
   //return interes
   double interes = capital*tiempo*tasaInteres;
   return interes;
   
}
}
