import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numero1;
    int numero2;
    int resultado;
    System.out.print("Ingrese el primer numero: ");
    numero1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    numero2 = teclado.nextInt();
    resultado = numero1 + numero2;
    System.out.print("El resultado de la suma es: " + resultado);
    teclado.close();
  }
}