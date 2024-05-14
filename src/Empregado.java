
public class Empregado {

    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        System.out.println("\nEmpregado criado com sucesso!");
    }

    public void promover() {
        if (idade > 18) {
            aumentarSalario(25);
        }
    }

    public void aumentarSalario (int percentualAumento) {
        salario *= 1 + (percentualAumento / 100);
    }

    public String demitir (int motivo) {
        switch (motivo) {
            case 1: // Justa Causa
                return "A pessoa colaboradora precisará cumprir aviso prévio.";
                break;
            case 2: // Decisão do Empregador
                double multa = this.salario * 0.40;
                return "A pessoa colaboradora foi demitida por decisao do empregador. o valor da multa é de R$ " + multa;
                break;
            default: // Aposentadoria
                double salarioAposentadoria;
                if (this.salario < 2000) {
                    salarioAposentadoria = 1500;
                } else if (this.salario < 3000) {
                    salarioAposentadoria = 2500;
                } else if (this.salario < 4000) {
                    salarioAposentadoria = 3500;
                }
                else
                    salarioAposentadoria = 4000;
                return "O salário de aposentadoria será" + salarioAposentadoria;
                break;
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade () {
        return idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
