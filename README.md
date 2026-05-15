# Projeto Smartphone - Pedro Luis Tofoli

## Informações do Aluno

- **Nome:** Pedro Luis Tofoli  
- **RM:** 564441  
- **Turma:** 2CCPG  
- **Curso:** Ciências da Computação  
- **GitHub:** @Pedro184294  

---

# Descrição do Projeto

Este projeto foi desenvolvido durante as aulas 1-9 da disciplina de Programação Orientada a Objetos.

O sistema representa um ambiente de gerenciamento de smartphones, aplicando os principais conceitos da Programação Orientada a Objetos, como:

- Classes e Objetos
- Métodos
- Encapsulamento
- Construtores
- Associação
- Herança
- Polimorfismo
- Classes Abstratas
- Interfaces

O projeto simula diferentes tipos de smartphones, como Android e iPhone, permitindo aplicar conceitos de orientação a objetos de maneira prática e organizada.

---

# Checklist de Implementação

- [x] Aula 1 - Classes e Objetos  
- [x] Aula 2 - Métodos  
- [x] Aula 3 - Encapsulamento  
- [x] Aula 4 - Construtores  
- [x] Aula 5 - Associação  
- [x] Aula 6 - Herança  
- [x] Aula 7 - Polimorfismo  
- [x] Aula 8 - Classes Abstratas  
- [x] Aula 9 - Interfaces  

---

# Perguntas de Reflexão

## Aula 1 - Classes e Objetos

### Pergunta

Por que precisamos criar uma classe `Smartphone`? Não seria mais fácil apenas criar variáveis soltas no main?

### Resposta

Criar uma classe Smartphone permite organizar melhor os dados e comportamentos relacionados ao dispositivo. Se utilizássemos apenas variáveis soltas, o sistema ficaria desorganizado e difícil de manter. Em um cenário real com milhares de smartphones, seria inviável controlar tudo manualmente. A classe facilita reutilização, manutenção, organização e escalabilidade do sistema.

---

## Aula 2 - Métodos

### Pergunta

Por que criar métodos específicos ao invés de alterar atributos diretamente?

### Resposta

Os métodos permitem controlar as regras de negócio do sistema. Por exemplo, ao alterar o armazenamento do smartphone, é possível validar valores inválidos. Se qualquer programador alterasse atributos diretamente, o sistema poderia ficar inconsistente. Os métodos ajudam a manter segurança, organização e confiabilidade no código.

---

## Aula 3 - Encapsulamento

### Pergunta

Por que os atributos são privados e os getters públicos?

### Resposta

Os atributos privados protegem os dados do objeto contra alterações indevidas. Já os getters públicos permitem apenas leitura controlada das informações. Isso garante maior segurança e evita inconsistências. O encapsulamento é importante para proteger o estado interno do objeto.

---

## Aula 4 - Construtores

### Pergunta

Por que não devemos criar setters para tudo automaticamente?

### Resposta

Nem todos os dados devem ser alterados livremente. Algumas informações precisam ser definidas apenas na criação do objeto. Criar setters para tudo pode permitir alterações indevidas e quebrar a lógica do sistema. O construtor garante que o objeto seja criado corretamente desde o início.

---

## Aula 5 - Associação

### Pergunta

Por que usar um objeto associado em vez de apenas uma String?

### Resposta

A associação permite que um objeto utilize comportamentos e informações completas de outro objeto. Se fosse apenas uma String, não seria possível acessar métodos ou outras características do objeto relacionado. Isso torna o sistema mais flexível e próximo de um cenário real.

---

## Aula 6 - Herança

### Pergunta

Por que o Java protege atributos privados da classe mãe?

### Resposta

O Java protege os atributos privados para garantir o encapsulamento e impedir alterações indevidas. Isso obriga as subclasses a utilizarem métodos controlados para acessar os dados, mantendo segurança e organização no sistema.

---

## Aula 7 - Polimorfismo

### Pergunta

Por que o método precisa existir na superclasse?

### Resposta

O polimorfismo depende de um contrato comum entre as classes. Se o método não existir na superclasse, não seria possível chamá-lo de forma genérica. Isso garante que todas as subclasses implementem o comportamento corretamente.

---

## Aula 8 - Classes Abstratas

### Pergunta

Por que transformar a classe Dispositivo em abstrata?

### Resposta

Porque não faz sentido criar um dispositivo genérico sem um tipo específico. Tornar a classe abstrata impede que ela seja instanciada diretamente e garante que apenas classes concretas, como Android e Iphone, sejam utilizadas.

---

## Aula 9 - Interfaces

### Pergunta

Por que Java permite múltiplas interfaces mas não herança múltipla?

### Resposta

As interfaces representam contratos de comportamento, enquanto a herança envolve implementação completa. Permitir herança múltipla poderia causar conflitos entre métodos iguais. As interfaces evitam esse problema porque cada classe implementa sua própria lógica.

---

# Desafios Técnicos Implementados

## Qual foi o domínio escolhido?

Sistema de Smartphones.

---

## Quais classes foram criadas?

- Smartphone
- Dispositivo
- Android
- Iphone
- Conectavel
- Principal

---

## Qual foi o maior desafio técnico?

O maior desafio foi integrar corretamente os conceitos de herança, polimorfismo e interfaces dentro do mesmo projeto. Também foi necessário reorganizar o sistema originalmente baseado em FiapRide para um domínio totalmente diferente, mantendo toda a estrutura orientada a objetos funcionando corretamente.

---

# Conclusão

## O que você aprendeu nestas 9 aulas?

Aprendi os principais conceitos de Programação Orientada a Objetos e como aplicá-los em um projeto real. Também aprendi a organizar melhor o código, reutilizar estruturas e desenvolver sistemas mais escaláveis e organizados.

---

## Qual conceito foi mais difícil?

Polimorfismo e classes abstratas foram os conceitos mais difíceis inicialmente, pois exigem maior entendimento da relação entre as classes. A prática e os testes ajudaram a compreender melhor esses conceitos.

---

## O que você melhoraria no projeto?

Eu adicionaria novas funcionalidades, como instalação de aplicativos, gerenciamento de bateria e sistema de atualizações. Também organizaria melhor os pacotes e criaria mais interações entre os objetos.

