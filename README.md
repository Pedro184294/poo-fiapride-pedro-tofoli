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

O sistema simula um ambiente onde passageiros utilizam veículos (como carros e motos), aplicando conceitos fundamentais de orientação a objetos como encapsulamento, herança, polimorfismo, abstração e interfaces.

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

**Sua Resposta:**
Criar uma classe como Passageiro permite organizar melhor os dados e comportamentos relacionados a um usuário do sistema. Se utilizássemos apenas variáveis soltas no main, o código ficaria desorganizado e difícil de manter, principalmente com muitos usuários. Em um sistema com 1 milhão de usuários, seria inviável controlar tudo manualmente. A classe permite reutilização, organização e escalabilidade do sistema.

---

### Aula 2 - Métodos

**Sua Resposta:**
Criar métodos como adicionarSaldo() garante que existam regras de negócio aplicadas ao alterar o saldo. Se qualquer programador pudesse alterar diretamente o valor, poderiam ocorrer erros como adicionar valores negativos ou inconsistências. Os métodos garantem segurança, controle e evitam falhas críticas no sistema.

---

### Aula 3 - Encapsulamento

**Sua Resposta:**
O get é seguro porque apenas permite leitura do valor, enquanto deixar o atributo público permitiria alterações diretas sem validação. Isso é perigoso porque pode gerar dados inconsistentes. É como entregar uma cópia de um documento versus o original: com o original, qualquer um pode alterar e comprometer a integridade da informação.

---

### Aula 4 - Construtores

**Sua Resposta:**
Gerar getters e setters para tudo é um erro porque expõe demais o objeto, permitindo alterações indevidas. No caso de um veículo, por exemplo, o modelo não deve ser alterado após criação. Já a placa exige um processo controlado, não apenas uma simples mudança de valor. Isso protege o sistema contra fraudes e mantém a lógica consistente com o mundo real.

---

### Aula 5 - Associação

**Sua Resposta:**
Usar o objeto Passageiro ao invés de apenas uma String permite acessar todos os dados e comportamentos dele, como saldo. Se fosse apenas uma String, não seria possível realizar operações como cobrança ao final da viagem. A associação permite que os objetos interajam de forma completa e realista dentro do sistema.

---

### Aula 6 - Herança

**Sua Resposta:**
O Java não permite acesso direto aos atributos privados da classe mãe para proteger o encapsulamento. Isso garante que as regras definidas na classe base sejam respeitadas. Esse conceito evita alterações indevidas e mantém a integridade dos dados, seguindo o princípio de proteção do estado do objeto.

---

### Aula 7 - Polimorfismo

**Sua Resposta:**
Não seria possível chamar o método se ele não existisse na classe mãe. O contrato precisa estar definido na base da hierarquia para garantir que todas as classes filhas implementem esse comportamento. Isso permite que o polimorfismo funcione corretamente, garantindo flexibilidade e reutilização de código.

---

### Aula 8 - Classes Abstratas

**Sua Resposta:**
Não faz sentido existir um objeto genérico “Veiculo” sem um tipo específico. Tornar a classe abstrata impede que ela seja instanciada diretamente. Se não fizermos isso, alguém poderia criar um objeto inválido, quebrando a lógica do sistema. O Java exige isso explicitamente para garantir maior controle e clareza no código.

---

### Aula 9 - Interfaces

**Sua Resposta:**
Java permite múltiplas interfaces porque elas representam contratos, não implementação. Se houvesse herança múltipla, poderia haver conflito de métodos com o mesmo nome. As interfaces resolvem isso pois obrigam cada classe a implementar sua própria versão do método, evitando ambiguidade e mantendo o sistema organizado.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
Sistema de mobilidade urbana (FiapRide)

**Quais classes você criou?**
Passageiro, Veiculo, Carro, Moto, Pagavel

**Qual foi o maior desafio técnico que você enfrentou?**
O maior desafio foi integrar todos os conceitos de orientação a objetos de forma correta, principalmente herança, polimorfismo e interfaces. No início, foi difícil entender como as classes se relacionavam e como aplicar corretamente o conceito de classe abstrata junto com interfaces. Também houve dificuldade em organizar o código para manter boas práticas de encapsulamento. Esse problema foi resolvido revisando os conceitos e implementando passo a passo, garantindo que cada parte funcionasse corretamente antes de avançar.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
Aprendi os principais conceitos de programação orientada a objetos e como aplicá-los na prática. Entendi como organizar melhor o código, reutilizar componentes e criar sistemas mais estruturados e escaláveis.

**Qual conceito foi mais difícil de entender?**
O conceito de polimorfismo e classes abstratas foi o mais desafiador, pois exige uma compreensão mais profunda de como as classes se relacionam. Superei isso praticando e testando diferentes implementações no código.

**O que você melhoraria no seu projeto se pudesse refazer?**
Eu melhoraria a organização dos pacotes e criaria mais classes para deixar o sistema ainda mais próximo de um cenário real, como adicionar uma classe de Viagem ou Sistema de Pagamento mais detalhado.

---
