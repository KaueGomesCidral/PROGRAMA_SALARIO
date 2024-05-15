public class Gerente extends Funcionario{
    public Gerente(String nome, double salarioHora, double horasTrabalhadas) {
        super(nome, salarioHora, horasTrabalhadas);
    }

    public double calcularSalario() {
        return super.calcularSalario() * 1.05;
    }
}
