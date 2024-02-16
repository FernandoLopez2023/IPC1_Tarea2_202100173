
package calculadora_tarea;

import java.util.Scanner;


public class Calculadora_tarea {

   
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char op;

        System.out.println("***** MENU *****");
        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese el operador (+, -, *, /):");
        op = scanner.next().charAt(0);

        double resultado = 0;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operador no válido");
                return;
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }
}
