import java.time.LocalDate;

public class Funcionario {
    public String nome;
    private double salarioHora;
    public double horasTrabalhadas;

    public Funcionario(String nome, double salarioHora, double horasTrabalhadas){
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;

    }

    public double calcularSalario() {
        return salarioHora * horasTrabalhadas;
    }
}
