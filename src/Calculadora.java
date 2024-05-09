import java.util.Scanner;

public class Calculadora {
    Scanner leitura = new  Scanner(System.in);


    public int somar(){
        System.out.println("*** Soma ***");
        System.out.println("Digite o primeiro número: ");
        int n1 = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o segundo número: ");
        int n2 = leitura.nextInt();
        leitura.nextLine();
        int resultado = n1 +n2;
        System.out.println("Resultado: " + resultado);
        return resultado;

    }

    public int subtrair() {
        System.out.println("*** Subtrair ***");
        System.out.println("Digite o primeiro número: ");
        int n1 = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o segundo número: ");
        int n2 = leitura.nextInt();
        leitura.nextLine();
        int resultado = n1 - n2;
        System.out.println("Resultado: " + resultado);        return  resultado;
    }

    public  int multiplicar() {
        System.out.println("*** Multiplicar ***");
        System.out.println("Digite o primeiro número: ");
        int n1 = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o segundo número: ");
        int n2 = leitura.nextInt();
        leitura.nextLine();
        int resultado = n1 * n2;
        System.out.println("Resultado: " + resultado);        return resultado;
    }

    public int dividir() {
        System.out.println("*** Dividir ***");
        System.out.println("Digite o primeiro número: ");
        int n1 = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Digite o segundo número: ");
        int n2 = leitura.nextInt();
        leitura.nextLine();
        int resultado = n1/ n2;
        System.out.println("Resultado: " + resultado);
        return  resultado;
    }

}
