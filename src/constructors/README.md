Exemplo do comportamento das chamadas de construtores na hierarquia. Os construtores são sempre chamados
iniciando-se no topo da hierarquia, descendo níveis até chegar na classe-filha. Portanto, 
para garantir esse comportamento, a primeira coisa que um construtor da classe-filha deve fazer é
chamar o construtor da classe-mãe (já na primeira linha).