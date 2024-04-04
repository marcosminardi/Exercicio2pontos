
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void info() {
        System.out.println("O gerente se chama " + getNome() + "tem" + getIdade() + ", recebe R$" + getSalario() + "e trabalha no departamento" + getDepartamento());

    }
}