public class Aluno {
    private String nome;
    private int id;
    private Carro carro;
    private int tempoEstacionamento; // Tempo de estacionamento em minutos

    // Construtor
    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    // Getter para o nome do aluno
    public String getNome() {
        return nome;
    }

    // Setter para associar um carro ao aluno
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    // Simular o tempo de estacionamento do aluno
    public void simularTempoEstacionamento(int minutos) {
        this.tempoEstacionamento = minutos;
    }

    // Obter o tempo de estacionamento do aluno
    public int getTempoEstacionamento() {
        return tempoEstacionamento;
    }
}//fim da classe Aluno