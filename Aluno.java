public class Aluno {

    private String nome;
    private String matricula;
    private double saldo;

    public Aluno(String nome, String matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

}
