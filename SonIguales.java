/**
*Define la clase SonIguales que lea dos valores numéricos, y determine si son iguales y,
*en caso de no serlo, indique cuál de ellos es el mayor.
*@author Andrei Alexandru Budau y José Antonio Aguilar Granados
*@version 1.0
*/
class SonIguales{
	public static void main(String[]args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);//sirve para poder introducir uno o varios datos
		System.out.println("Introduce n\u00FAmero");//muestra el mensaje por pantalla
		int numero1;//declaracion de la variable
		numero1 = scanner.nextInt();
		System.out.println("Introduce otro n\u00FAmero");
		int numero2;//declaracion de la variable
		numero2 = scanner.nextInt();//sirve para que lea el numero que hemos introducido
		if (numero1 == numero2) {
			System.out.println("Son iguales");
		}else if (numero1>numero2) {
			System.out.println("El mayor es " +numero1);
		}else{
			System.out.println("El mayor es: " +numero2);
		}
	}
}