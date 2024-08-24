# Post Management Application

## Visão Geral

### Descrição do Projeto

Este projeto é uma aplicação monolítica para gerenciamento de posts. Ele permite a criação, visualização, edição e exclusão de posts, com uma interface web baseada em Thymeleaf para interação com o usuário.

### Funcionalidades

- **Listar Posts**: Exibe uma lista de todos os posts.
- **Criar Post**: Permite criar novos posts.
- **Editar Post**: Permite editar posts existentes.
- **Mostrar Post**: Exibe detalhes de um post específico.
- **Excluir Post**: Permite excluir posts existentes.

### Tecnologias Utilizadas

- **Back-end**: Spring Boot
- **Front-end**: Thymeleaf
- **Banco de Dados**: MySQL

## Configuração do Ambiente

### Pré-requisitos

- JDK 11 ou superior
- MySQL
- Maven ou Gradle (dependendo da configuração do projeto)

### Configuração do Banco de Dados

1. **Criação do Banco de Dados**:

   ```MySQL
   CREATE DATABASE postmanagementapp;
  ```
2. **Configurar o application.properties**:

  ```properties
  spring.application.name=PostManagementApp
  spring.datasource.url=jdbc:mysql://localhost:3306/postmanagementapp
  spring.datasource.username=root
  spring.datasource.password=

  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
  spring.jpa.show-sql=true
  spring.jpa.hibernate.ddl-auto=update
  ```
3. **Estruturando o Projeto Back-end**:

  ```Controller
  PostController
  ```
  ```Model
  Post
  ```
  ```Service
  PostService
  ```
  ```Repository
  PostRepository
  ```
4. **Estruturando o Projeto Front-end**:

  ```Lists.html
    Exibe a lista de posts com links para visualizar, editar e excluir.
  ```
  ```Create.html
    Formulário que cria novos posts.
  ```
  ```Edit.html
    Formulário que edita posts existentes.
  ```
  ```Show.html
    Exibe detalhes de um post.
  ```
5. **Testes & Validações**:

6. **Deployment**

  ```Maven
    mvn clean packpage
  ```

7. **Configuração do Ambiente de Produção**:

  ```Banco de Dados
    Certifique-se que as configurações está apontando para o ambiente de produção
  ```
  ```Segurança
    Configure as medidas de segurança apropiada, como autenticação e autorização, se necessário.
  ```