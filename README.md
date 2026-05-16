# Sistema Automotivo – Gestão de Estoque de Veículos

## Sobre o projeto

Este projeto foi desenvolvido como atividade da disciplina de **Programação Orientada a Objetos**, com o objetivo de aplicar na prática os conceitos aprendidos em aula por meio da criação de um sistema para gerenciamento de estoque de veículos.

A proposta do sistema é ajudar uma concessionária ou loja de automóveis a organizar seu estoque, permitindo cadastrar, consultar, atualizar e excluir veículos de forma simples e eficiente.

Durante o desenvolvimento, foram utilizados conceitos importantes de programação orientada a objetos, como organização em classes, separação de responsabilidades e persistência de dados em banco.

---

## Tecnologias utilizadas

Para desenvolver o projeto, foram utilizadas as seguintes tecnologias:

- **Java**
- **Spring Boot**
- **MySQL**
- **JPA / Hibernate**
- **Maven**
- **Talend API Tester** (para testes da API)

---

## Funcionalidades implementadas

O sistema permite realizar as seguintes operações:

- Cadastro de veículos
- Consulta de todos os veículos cadastrados
- Busca com filtros por:
  - marca
  - modelo
  - preço
  - ano
  - status
- Atualização de informações do veículo (preço, quilometragem e status)
- Exclusão de veículos do estoque

---

## Estrutura do projeto

O projeto foi organizado seguindo uma arquitetura em camadas para facilitar o entendimento e a manutenção do código:

- **model** → representa a entidade `Veiculo`
- **repository** → responsável pela comunicação com o banco de dados
- **service** → contém as regras de negócio do sistema
- **controller** → responsável pelos endpoints da API

---

## Como executar

Para rodar o projeto localmente:

1. Criar um banco MySQL
2. Configurar usuário e senha no arquivo `application.properties`
3. Executar a classe principal `EstoqueVeiculosApplication`
4. Utilizar o Talend API Tester para testar os endpoints

---

## Aprendizados

Com este projeto foi possível colocar em prática diversos conceitos estudados durante a graduação, principalmente:

- Programação Orientada a Objetos
- Organização de código em camadas
- Desenvolvimento de API REST
- Integração com banco de dados MySQL
- Operações CRUD completas

Foi uma ótima oportunidade para entender melhor como funciona o desenvolvimento backend utilizando Java e Spring Boot.

---

## Autor

**Vinicius Gonçalves**  
Projeto acadêmico – Graduação
