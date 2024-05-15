public class Lider extends Funcionario{
    public Lider(String nome, double salarioHora, double horasTrabalhadas) {
        super(nome, salarioHora, horasTrabalhadas);
    }

    public double calcularSalario() {
        return super.calcularSalario() * 1.02;
    }
}
