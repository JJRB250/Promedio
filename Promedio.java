public class Promedio{
	public static void main(String[] args){
		//Declaracion de variables
		int numero1;
		char numero2;
		short numero3;
		long numero4;
		float numero5;
		float resultado;

		//Inicializacion
		numero1 = 45;
		numero2 = 4;
		numero3 = 567;
		numero4 = 123;
		numero5 = 4.5F;

		//Operacion
		resultado = (numero1+numero2+numero3+numero4+numero5)/5;

		//Impresion del resultado
		System.out.println("El resultado es "+resultado);
	}
}