package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private double saldo;
    private Veiculo veiculo; // 🔥 ASSOCIAÇÃO

    // CONSTRUTOR PADRÃO
    public Passageiro() {
    }

    // CONSTRUTOR COM ASSOCIAÇÃO
    public Passageiro(String nome, double saldo, Veiculo veiculo) {
        this.setNome(nome);
        this.setSaldo(saldo);
        this.veiculo = veiculo;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo!");
            return;
        }
        this.saldo = saldo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    // MÉTODOS
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);

        if (veiculo != null) {
            System.out.println("Veículo: " + veiculo.getModelo() + " - " + veiculo.getPlaca());
        }
    }

    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para adicionar!");
            return;
        }
        saldo += valor;
    }

    public void debitarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para débito!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
    }
}