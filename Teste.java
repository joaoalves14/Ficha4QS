public class Teste {
    public static void main(String[] args) {
        // Criar um estacionamento com uma capacidade máxima de 500 vagas
        Estacionamento estacionamentoUPT = new Estacionamento(500);

        // Criar alguns alunos e seus carros
        Aluno aluno1 = new Aluno("João", 1);
        Carro carroAluno1 = new Carro("AB-12-34");

        Aluno aluno2 = new Aluno("Maria", 2);
        Carro carroAluno2 = new Carro("CD-56-78");

        // Associar carros aos alunos
        aluno1.setCarro(carroAluno1);
        aluno2.setCarro(carroAluno2);

        // Registrar a entrada dos alunos no estacionamento
        estacionamentoUPT.entradaAluno(aluno1);
        estacionamentoUPT.entradaAluno(aluno2);

        // Simular o tempo de estacionamento dos alunos
        aluno1.simularTempoEstacionamento(3); // 3 * 15 minutos = 45 minutos
        aluno2.simularTempoEstacionamento(2); // 2 * 15 minutos = 30 minutos

        // Registrar a saída dos alunos e calcular o valor a pagar
        double valorPagarAluno1 = estacionamentoUPT.registrarSaida();
        double valorPagarAluno2 = estacionamentoUPT.registrarSaida();

        System.out.println("Valor a pagar por " + aluno1.getNome() + ": " + valorPagarAluno1 + " €");
        System.out.println("Valor a pagar por " + aluno2.getNome() + ": " + valorPagarAluno2 + " €");
    }
}//fim da classe Teste