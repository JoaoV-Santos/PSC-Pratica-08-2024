
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

    public void demitir (int motivo) {

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
