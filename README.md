# Projeto-Mochila-Objeto---FIAP

Este projeto implementa uma abstração de uma mochila física utilizando Java.

### Funcionamento
O objeto `Mochila` controla o armazenamento de itens baseado em peso e estado do zíper.

**Regras de Negócio Implementadas:**
1. **Zíper Travado:** Não é permitido adicionar itens se a mochila estiver fechada (`aberta == false`).
2. **Limite de Carga:** O método `adicionarItem` valida se a soma do peso atual com o novo item ultrapassa a `capacidadeMax`.

### Métodos
- `alternarZiper()`: Inverte o estado atual (abre/fecha).
- `adicionarItem(double)`: Tenta inserir um peso se as condições forem atendidas.
