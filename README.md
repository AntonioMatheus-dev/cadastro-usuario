# Cadastro de Usuário

Este projeto é uma API REST desenvolvida em **Spring Boot** para gerenciar usuários. Permite cadastrar, buscar, atualizar e deletar usuários utilizando um banco de dados em memória (H2).

## Endpoints

- **POST `/usuario`**  
  Cadastra um novo usuário.  
  **Body (JSON):**
  ```json
  {
    "nome": "Nome do Usuário",
    "email": "usuario@email.com"
  }
  ```

- **GET `/usuario?email={email}`**  
  Busca um usuário pelo e-mail.

- **PUT `/usuario?id={id}`**  
  Atualiza os dados de um usuário pelo ID.  
  **Body (JSON):**
  ```json
  {
    "nome": "Novo Nome",
    "email": "novo@email.com"
  }
  ```

- **DELETE `/usuario?email={email}`**  
  Remove um usuário pelo e-mail.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- H2 Database (em memória)
- Lombok

## Como Executar

1. **Pré-requisitos:**  
   - Java 21+
   - Maven

2. **Execute o projeto:**  
   No terminal, na raiz do projeto:
   ```sh
   ./mvnw spring-boot:run
   ```
   Ou, no Windows:
   ```sh
   .\mvnw.cmd spring-boot:run
   ```

3. **Acesse a aplicação:**  
   - API: [http://localhost:8081/usuario](http://localhost:8081/usuario)
   - Console H2: [http://localhost:8081/h2-console](http://localhost:8081/h2-console)  
     - JDBC URL: `jdbc:h2:mem:usuario`
     - User: `sa`
     - Password: (em branco)

## Testando

Utilize o **Postman** para testar os endpoints conforme exemplos acima.

---

Desenvolvido por MatheusDev.