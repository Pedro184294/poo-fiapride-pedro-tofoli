package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private double saldo;

    // 🔹 CONSTRUTOR PADRÃO
    public Passageiro() {
    }

    // 🔹 CONSTRUTOR PERSONALIZADO (ESSENCIAL)
    public Passageiro(String nome, double saldo) {
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
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

    // MÉTODOS
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
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