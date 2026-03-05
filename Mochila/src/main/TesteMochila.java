package main;

import br.com.Mochila.model.Mochila;

public class TesteMochila {
    public static void main(String[] args) {
        // Agora o Java reconhece o construtor Mochila porque ele existe no arquivo Mochila.java
        Mochila minhaMochila = new Mochila("Preta", 10.0);

        // Teste Inválido: Mochila fechada

        // Teste Válido: Abrir e adicionar
        minhaMochila.alternarZiper();
        minhaMochila.adicionarItem(5.0);

        // Teste Inválido: Exceder peso
        minhaMochila.adicionarItem(6.0);
    }
}