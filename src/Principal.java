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
            in.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o nome do funcionario.");
                    String nome = in.nextLine();
                    System.out.println("Insira a idade do funcionário.");
                    int idade = in.nextInt();
                    System.out.println("Insira o salário do funcionário.");
                    double salario = in.nextDouble();

                    Empregado empregado = new Empregado(nome, idade, salario);
                    break;
                case 2:
                    empregado.promover();
                    break;
                case 3:
                    System.out.println("Informe o percentual de aumento do salário:");
                    int percentual = in.nextInt();
                    empregado.aumentarSalario(percentual);
                    break;
                case 4:
                    System.out.println("Informe o motivo da demissão:");
                    int motivo = in.nextInt();
                    empregado.demitir(motivo);
                    break;
                case 5:
                    empregado.fazerAniversario();
                    break;
                case 6:
                    empregado.toString();
                    break;
                case 7:
                    break;

            }

        } while (opcao != 7);
    }
}
