//clase que suministra un unico metodo para calcular el capital final aplicando
//la formula del interes compuesto
// CF =CI*(1+r)^t
//CF: capital final
//CF: capital inicial
//r: interes
//t: año o tiempo
public class interesCompuesto{
	public static double calcularInteresCompuesto(double capitalInicial, double tiempo, double interes){
		double calculo =1;
		//codigo
		double parentesis = interes+1;//(1+r)
		for(int i = 0; i<tiempo; i++)
			calculo=calculo*parentesis;
		return calculo*capitalInicial;
	}
	//public static void main(String[] arg){
		//	System.out.println(calcularInteresCompuesto(2000, 4, 0.050));
		//}
}
