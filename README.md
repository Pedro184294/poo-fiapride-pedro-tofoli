# Projeto FiapRide - Pedro Luis Tofoli

## Informações do Aluno

* **Nome:** Pedro Luis Tofoli
* **RM:** 564441
* **Turma:** 2CCPG
* **Curso:** Ciências da Computação
* **GitHub:** @Pedro184294

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

O sistema simula passageiros, veículos (carro e moto) e operações como saldo, pagamento e comportamento dos veículos, aplicando conceitos fundamentais de OO.

---

## Checklist de Implementação

* [x] Aula 1 - Classes e Objetos
* [x] Aula 2 - Métodos
* [x] Aula 3 - Encapsulamento
* [x] Aula 4 - Construtores
* [x] Aula 5 - Associação
* [x] Aula 6 - Herança
* [x] Aula 7 - Polimorfismo
* [x] Aula 8 - Classes Abstratas
* [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:**
Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main?

**Resposta:**
Criar uma classe permite organizar melhor os dados e comportamentos relacionados ao passageiro. Usar variáveis soltas funciona apenas para poucos casos, mas em um sistema com muitos usuários se torna inviável. A classe permite reutilização, organização, manutenção e escalabilidade do sistema.

---

### Aula 2 - Métodos

**Pergunta:**
Por que criar um método como `adicionarSaldo()` ao invés de alterar diretamente o atributo?

**Resposta:**
O método garante que regras de negócio sejam respeitadas, como impedir valores negativos. Se qualquer programador alterasse diretamente o saldo, o sistema poderia ficar inconsistente. Métodos trazem segurança e controle sobre os dados.

---

### Aula 3 - Encapsulamento

**Pergunta:**
Por que é seguro ter getters públicos, mas perigoso ter atributos públicos?

**Resposta:**
Getters apenas permitem leitura dos dados, enquanto atributos públicos permitem alteração direta sem validação. Isso pode gerar erros e inconsistências. O encapsulamento protege os dados e garante que alterações sejam feitas de forma controlada.

---

### Aula 4 - Construtores

**Pergunta:**
Por que não devemos gerar getters e setters para tudo automaticamente?

**Resposta:**
Nem todos os atributos devem ser alteráveis. Por exemplo, o modelo de um veículo não deve mudar após criação. Criar setters para tudo pode abrir brechas para erros e fraudes. O construtor garante que o objeto seja criado corretamente desde o início.

---

### Aula 5 - Associação

**Pergunta:**
Por que usar o objeto Passageiro em vez de apenas uma String com o nome?

**Resposta:**
Usar o objeto permite acessar seus dados e comportamentos, como saldo. Se fosse apenas uma String, não seria possível realizar operações como cobrança. A associação permite interação real entre objetos.

---

### Aula 6 - Herança

**Pergunta:**
Por que o Java não permite acesso direto aos atributos privados da classe mãe?

**Resposta:**
Para proteger o encapsulamento. Isso garante que as regras definidas na classe mãe sejam respeitadas e evita alterações indevidas nos dados, mantendo a integridade do sistema.

---

### Aula 7 - Polimorfismo

**Pergunta:**
Por que o método precisa existir na classe mãe?

**Resposta:**
Porque o polimorfismo depende de um contrato comum. Sem o método na classe mãe, não seria possível chamá-lo de forma genérica. Isso garante que todas as subclasses implementem o comportamento.

---

### Aula 8 - Classes Abstratas

**Pergunta:**
Por que transformar a classe Veiculo em abstrata?

**Resposta:**
Porque não faz sentido criar um veículo genérico sem tipo. Tornar a classe abstrata impede sua instância direta e garante que apenas classes específicas sejam utilizadas, evitando erros no sistema.

---

### Aula 9 - Interfaces

**Pergunta:**
Por que Java permite múltiplas interfaces mas não múltipla herança?

**Resposta:**
Porque interfaces definem contratos, não implementação. Isso evita conflitos de métodos. Cada classe implementa sua própria versão, garantindo flexibilidade e organização sem ambiguidades.

---

## Desafios Técnicos Implementados

### Desafio Pessoal

**Domínio escolhido:**
Sistema de mobilidade urbana (FiapRide)

**Classes criadas:**
Passageiro, Veiculo, Carro, Moto, Pagavel

**Maior desafio:**
Integrar todos os conceitos de OO corretamente, principalmente herança, polimorfismo e interfaces. Foi necessário entender como as classes se relacionam e como organizar o código de forma eficiente. Resolvi isso testando cada parte separadamente e depois integrando tudo.

---

## Conclusão

**O que você aprendeu?**
Aprendi a aplicar conceitos fundamentais de orientação a objetos na prática, criando um sistema organizado, reutilizável e escalável.

**Maior dificuldade:**
Polimorfismo e classes abstratas, pois exigem entender bem a relação entre classes. Superei praticando bastante.

**O que melhoraria?**
Adicionaria mais funcionalidades, como sistema de viagens e pagamentos mais detalhado, além de melhorar a organização do projeto.

