import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        /**
         * Escribir comentario con "/**"
         */
        //Se detecta el Teclado
        Scanner lectura = new Scanner(System.in);
        //Se Serializan las variables
        double base; double altura;

        System.out.print("Dime la Base");
        base = lectura.nextDouble();

        System.out.print("Dime la Altura");
        altura = lectura.nextDouble();

        double area = base * altura;
        System.out.println("La Area es: " + area);

        lectura.close();
    }
}
