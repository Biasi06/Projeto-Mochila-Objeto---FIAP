package br.com.Mochila.model;

public class Mochila {
    private String cor;
    private double capacidadeMax;
    private double pesoAtual;
    private boolean aberta;

    // Construtor: Nome deve ser igual à classe
    public Mochila(String cor, double capacidadeMax) {
        this.cor = cor;
        this.capacidadeMax = capacidadeMax;
        this.pesoAtual = 0.0;
        this.aberta = false;
    }

    // Método 1: Altera o estado (aberta/fechada)
    public void alternarZiper() {
        this.aberta = !this.aberta;
        System.out.println("Mochila agora está " + (aberta ? "aberta" : "fechada"));
    }

    // Método 2: Altera o atributo pesoAtual com validação (Regra de Negócio)
    public void adicionarItem(double pesoItem) {
        if (!aberta) {
            System.out.println("ERRO: Não é possível adicionar itens com a mochila fechada.");
        } else if (pesoAtual + pesoItem > capacidadeMax) {
            System.out.println("ERRO: Capacidade excedida! Limite: " + capacidadeMax + "kg.");
        } else {
            this.pesoAtual += pesoItem;
            System.out.println("Item de " + pesoItem + "kg adicionado. Peso atual: " + pesoAtual + "kg.");
        }
    }
}