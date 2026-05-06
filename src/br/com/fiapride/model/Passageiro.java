package br.com.fiapride.model;

public class Passageiro {

    private String nome;
    private double saldo;

    // GETTERS
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // SETTERS COM VALIDAÇÃO
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

    // MÉTODO DE EXIBIÇÃO
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }

    // MÉTODO DE ADIÇÃO DE SALDO
    public void adicionarSaldo(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para adicionar!");
            return;
        }
        saldo += valor;
    }

    // MÉTODO DE DÉBITO DE SALDO
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