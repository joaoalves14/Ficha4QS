public class Aluno {

    private String nome;
    private double saldo;

    public Aluno(String nome, double saldo)
    {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome()
    {
        return nome;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void adicionarSaldo(double valor)
    {
        saldo += valor;
    }

}
