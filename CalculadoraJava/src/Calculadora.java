import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Primero un pequeño saludo
        System.out.println("Hola ✌️✌️✌️ bienvenido a mi calculadora 👌");

        //Importamos el Scanner
        Scanner teclado = new Scanner(System.in);

        // solicitamos el primer número
        System.out.println("Ingresa tu primer número 👇");
        int numeroUno = teclado.nextInt();

        // solicitamos el segundo número
        System.out.println("Ingresa tu segundo número 👇");
        int numeroDos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("El resultado de la suma (➕) es: " + (numeroUno + numeroDos));
        System.out.println("El resultado de la resta (➖) es: " + (numeroUno - numeroDos));
        System.out.println("El resultado de la Multiplicación (✖️) es: " + (numeroUno * numeroDos));
        System.out.println("El resultado de la División (➗) es: " + (numeroUno / numeroDos));
        System.out.println("El resultado o resto de la División (%) es: " + (numeroUno % numeroDos));



    }
}
