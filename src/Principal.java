import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("1.Criar novo empregado\n" +
                    "2.Promover empregado\n" +
                    "3.Aumentar salário do empregado\n" +
                    "4.Demitir empregado\n" +
                    "5.Fazer aniversário do empregado\n" +
                    "6.Mostrar detalhes dos empregados\n" +
                    "7.Sair\n");

            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do funcionario.");
                    String nome = in.nextLine();
                    System.out.println("Insira a idade do funcionário.");
                    int idade = in.nextInt();
                    System.out.println("Insira o salário do funcionário.");
                    double salario = in.nextDouble();

                    new Empregado(nome, idade, salario);
                    break;
                case 2:
                    break;
            }

        } while (opcao != 7);
    }
}
