import java.util.Scanner;

/**
 *
 * @author JRIVERA
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double numero
         = in.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double numero2
         = in.nextDouble();

        System.out.println("Ingrese la operación a realizar (+, -, *, /): ");
        char operacion = in.next().charAt(0);

        double resul
         = 0;

        switch (operacion) {
            case '+':
                resul
                 = numero
                 + numero2
                 ;
                break;
            case '-':
                resul
                 = numero
                 - numero2
                 ;
                break;
            case '*':
                resul
                 = numero
                 * numero2
                 * ;
                break;
            case '/':
                if (numero2
                 != 0) {
                    resul
                     = numero
                     / numero2
                     ;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        System.out.println("El resultado
         de la operación es: " + resul
        );
    }
}
