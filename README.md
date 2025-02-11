# ToDo List Server 🍃
Aplicação backend simples de API RESTful para o cliente da aplicação desenvolvido em **Java** e **Spring Boot** rodando em ambiente **Docker** com **Nginx** e **Postgres**.

## Como rodar o Projeto 🚀
Para que a aplicação funcione, é necessário ter instalado **Docker** e **Docker Compose**. ⚠️

Execute o comando para Buildar o container docker e rodar a aplicação na porta 80

```
docker-compose up --build -d
```

## Libs utilizadas no Projeto 📚
- **Spring Web** (para criar APIs REST)
- **Spring Boot DevTools** (para facilitar o desenvolvimento)
- **Lombok** (para reduzir código boilerplate)
- **Spring Data JPA** (para interagir com o banco de dados)
- **H2 Database** (banco de dados em memória para testes)