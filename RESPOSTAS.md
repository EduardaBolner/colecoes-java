# Respostas – Comparando as Coleções do Java

---

## Parte 1 – List

1. **Os elementos permaneceram na ordem de inserção?**
   Sim, tanto ArrayList quanto LinkedList mantiveram a ordem em que os elementos foram adicionados.

2. **Os elementos repetidos foram armazenados?**
   Sim, ambas as implementações aceitam duplicatas. "Bruno" e "Ana" aparecem duas vezes.

3. **Houve diferença visível na saída entre ArrayList e LinkedList?**
   Não. A saída foi idêntica nas duas implementações.

4. **Qual característica principal você observou na interface List?**
   A interface List mantém a ordem de inserção e permite elementos duplicados.

---

## Parte 2 – Queue

1. **Qual elemento foi removido primeiro na fila baseada em LinkedList?**
   "Bruno", pois a LinkedList segue a ordem FIFO (primeiro a entrar, primeiro a sair).

2. **Qual elemento foi removido primeiro na PriorityQueue?**
   "Ana", pois a PriorityQueue ordena os elementos em ordem natural (alfabética),
   removendo sempre o menor elemento primeiro.

3. **As duas filas se comportaram da mesma forma?**
   Não. A LinkedList respeitou a ordem de inserção, enquanto a PriorityQueue
   reordenou os elementos alfabeticamente.

4. **Qual característica principal você observou na interface Queue?**
   A interface Queue segue o princípio FIFO, mas a implementação pode alterar
   a ordem de saída, como no caso da PriorityQueue.

---

## Parte 3 – Set

1. **Quantos elementos ficaram armazenados em cada Set?**
   4 elementos em cada (Bruno, Ana, Daniel, Carlos), pois os duplicados foram ignorados.

2. **O que aconteceu com os nomes repetidos?**
   Foram ignorados. O Set não permite duplicatas.

3. **Qual implementação preservou a ordem de inserção?**
   LinkedHashSet.

4. **Qual implementação exibiu os elementos em ordem alfabética?**
   TreeSet.

5. **Qual implementação não garantiu ordem?**
   HashSet.

6. **Qual característica principal você observou na interface Set?**
   A interface Set não permite elementos duplicados. Cada implementação
   difere na forma como organiza os elementos.

---

## Parte 4 – Map

1. **O HashMap manteve a ordem de inserção?**
   Não. O HashMap não garante nenhuma ordem.

2. **O LinkedHashMap manteve a ordem de inserção?**
   Sim. Os elementos foram exibidos na mesma ordem em que foram inseridos.

3. **Como o TreeMap organizou os elementos?**
   Em ordem crescente pelas chaves numéricas (1, 2, 4, 5, 6, 33).

4. **Qual a função da chave em um Map?**
   A chave é um identificador único que permite acessar o valor associado.
   Não podem existir duas entradas com a mesma chave.

5. **Qual característica principal você observou na interface Map?**
   O Map armazena pares chave-valor, onde cada chave é única.
   Diferentes implementações variam na ordenação das entradas.

---

## Comparação Final

| Estrutura         | Aceita Duplicados | Mantém Ordem de Inserção | Mantém Ordenação |
|-------------------|:-----------------:|:------------------------:|:----------------:|
| ArrayList         | Sim               | Sim                      | Não              |
| LinkedList (List) | Sim               | Sim                      | Não              |
| LinkedList (Queue)| Sim               | Sim (FIFO)               | Não              |
| PriorityQueue     | Sim               | Não                      | Sim (natural)    |
| HashSet           | Não               | Não                      | Não              |
| LinkedHashSet     | Não               | Sim                      | Não              |
| TreeSet           | Não               | Não                      | Sim (natural)    |
| HashMap           | Não (nas chaves)  | Não                      | Não              |
| LinkedHashMap     | Não (nas chaves)  | Sim                      | Não              |
| TreeMap           | Não (nas chaves)  | Não                      | Sim (por chave)  |

---

## Reflexão Final

1. **Quando utilizaria uma List?**
   Quando a ordem dos elementos importa e duplicatas são permitidas.
   Exemplo: lista de itens de um carrinho de compras, onde o mesmo produto
   pode aparecer mais de uma vez e a ordem de adição deve ser preservada.

2. **Quando utilizaria uma Queue?**
   Quando precisar processar elementos na ordem em que chegaram (FIFO).
   Exemplo: fila de atendimento de um suporte técnico, onde o primeiro
   cliente a abrir um chamado deve ser o primeiro a ser atendido.

3. **Quando utilizaria um Set?**
   Quando não podem existir elementos repetidos.
   Exemplo: lista de CPFs cadastrados em um sistema, onde cada CPF
   deve aparecer uma única vez.

4. **Quando utilizaria um Map?**
   Quando precisar associar uma chave a um valor para buscas rápidas.
   Exemplo: dicionário de produtos onde a chave é o código do produto
   e o valor é o nome, facilitando a consulta pelo código.