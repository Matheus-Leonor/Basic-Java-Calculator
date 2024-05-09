import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        var opcao = -1;
        while(opcao!= 0) {
            var  menu = """
                ***** Calculdadora Java *****
                1 - Somar
                2 - Subtrair
                3 - Multiplicar
                4 - Dividir
                
                0 -  Sair
                """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    calculadora.somar();
                    break;
                case 2:
                    calculadora.subtrair();
                    break;
                case 3 :
                    calculadora.multiplicar();
                    break;
                case  4:
                    calculadora.dividir();
                    break;
                case 0:
                    System.out.println("Saindo...");
                default: System.out.println("Opção inválida");


            }
        }
    }

}