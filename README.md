# 📦 Spring Boot CRUD - Produto e Categoria

Projeto simples de CRUD em Spring Boot com duas entidades relacionadas: **Produto** e **Categoria**, utilizando **MariaDB** como banco de dados relacional.

---

## ✅ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MariaDB
- Lombok
- Maven

---

## 📁 Estrutura do Projeto

### Entidades:
- **Categoria**: `id`, `nome`
- **Produto**: `id`, `nome`, `categoria` (relacionamento `@ManyToOne`)

As tabelas são criadas automaticamente pelo Spring Boot.

---

## ⚙️ Como configurar o banco de dados

### 1. Inicie o MySQL com o XAMPP:
- Baixe e instale: [https://www.apachefriends.org/pt_br/index.html](https://www.apachefriends.org/pt_br/index.html)
- Abra o **XAMPP Control Panel**
- Clique em **Start** no MySQL

### 2. Crie o banco de dados:
- Acesse: `http://localhost/phpmyadmin`
- Clique em **"Nova"** (menu lateral)
- Nomeie como:

- Clique em **Criar**

> ❗️As tabelas `categoria` e `produto` serão criadas automaticamente ao rodar o projeto.

---

## 🧪 Configuração do `application.properties`

O projeto já vem configurado. O arquivo está em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/produto_categoria_db
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect
▶️ Como executar o projeto
Abra o projeto em uma IDE como IntelliJ, Spring Tool Suite, ou VSCode com Spring Boot Plugin

Vá até a classe:

Copiar
Editar
com.exemplo.springbootcrud.SpringbootCrudApplication
Clique com o botão direito e selecione Run

Você verá no console:

scss
Copiar
Editar
Tomcat started on port(s): 8080
🔁 Endpoints da API
📂 Categoria
GET /categorias → Listar categorias

POST /categorias → Cadastrar categoria

json
Copiar
Editar
{
  "nome": "Eletrônicos"
}
📦 Produto
GET /produtos → Listar produtos

POST /produtos → Cadastrar produto

json
Copiar
Editar
{
  "nome": "Notebook",
  "categoria": { "id": 1 }
}
📌 Observações
Relacionamento: Cada Produto pertence a uma Categoria (@ManyToOne)

Os dados são persistidos em MariaDB

Use ferramentas como Postman ou Insomnia para testar os endpoints
