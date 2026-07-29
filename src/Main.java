import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numero1;
    int numero2;
    int resultado;
    int opcion;

    System.out.println("=== CALCULADORA ===");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("Elegí una opción: ");

    opcion = teclado.nextInt();

    if (opcion < 1 || opcion > 4){
      System.out.println("La opción ingresada no es válida.");
      teclado.close();
      return;
    }

    System.out.print("Ingrese el primer numero: ");
    numero1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    numero2 = teclado.nextInt();
    switch (opcion){
      case 1 -> {
        resultado = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + resultado);
      }
      case 2 -> {
        resultado = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + resultado);
      }
      case 3 -> {
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
      }
      case 4 -> {
        if (numero2 == 0){
          System.out.println("No se puede dividir por cero.");
        } else {
          double resultadoDivision = (double) numero1/numero2;
          System.out.println("El resultado de la división es: " + resultadoDivision);
        }

      }
      default -> {
        System.out.println("La opción ingresada no es válida");;
      }
    }
    teclado.close();
  }
}