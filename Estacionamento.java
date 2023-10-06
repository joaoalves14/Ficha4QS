import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private int lotacao; // Capacidade máxima de vagas no estacionamento
    private int vagasOcupadas; // Número de vagas ocupadas
    private List <Aluno> alunosEstacionados; // Lista de alunos estacionados

    // Construtor
    public Estacionamento(int lotacao) {
        this.lotacao = lotacao;
        this.vagasOcupadas = 0;
        this.alunosEstacionados = new ArrayList<>();
    }

    // Método para permitir a entrada de um aluno no estacionamento
    public boolean entradaAluno(Aluno aluno) {
        if (vagasOcupadas < lotacao) {
            alunosEstacionados.add(aluno);
            vagasOcupadas++;
            return true;
        } else {
            System.out.println("O estacionamento está lotado. Não é possível entrar.");
            return false;
        }
    }

    // Método para registrar a saída de um aluno e calcular o valor a pagar
    public double registrarSaida() {
        if (vagasOcupadas > 0) {
            Aluno alunoSaida = alunosEstacionados.remove(0); // Remove o primeiro aluno estacionado (FIFO)
            vagasOcupadas--;

            double valorPagar = calcularValorEstacionamento(alunoSaida);
            System.out.println("Aluno " + alunoSaida.getNome() + " saiu do estacionamento.");
            System.out.println("Valor a pagar: " + valorPagar + " €");

            return valorPagar;
        } else {
            System.out.println("O estacionamento está vazio. Não há alunos para registrar a saída.");
            return 0.0;
        }
    }

    // Método privado para calcular o valor do estacionamento com base no tempo de estacionamento do aluno
    private double calcularValorEstacionamento(Aluno aluno) {
        int tempoEstacionamento = aluno.getTempoEstacionamento();
        double valorAPagar = tempoEstacionamento * 0.10; // Cada 15 minutos custam 0.10 €
        return valorAPagar;
    }
}//fim da classe Estacionamento