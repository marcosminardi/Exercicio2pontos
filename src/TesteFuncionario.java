public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Luiza", 24, 2500.00);
        Gerente gerente = new Gerente("José Geraldo", 69, 5000.00, "Recursos Humanos");

        f1.info();
        gerente.info();
    }
}