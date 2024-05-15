public class Main {
    public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("kaue", 15, 20);
    Gerente gerente = new Gerente("ei voce ai", 15, 20);
    Lider lider = new Lider("me da um dinheiro", 15, 20);
    System.out.println(funcionario.calcularSalario());
    System.out.println(gerente.calcularSalario());
    System.out.println(lider.calcularSalario());

    }
}