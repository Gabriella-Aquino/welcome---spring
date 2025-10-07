# Spring Boot Welcome App

Esta é a resolução de uma atividade que pede uma aplicação **Spring Boot** simples criada para demonstrar a criação de endpoints REST sem a necessidade de banco de dados.

---

##  Objetivo
O objetivo da aplicação é mostrar como criar uma API básica com dois endpoints:
1. Um endpoint que retorna uma mensagem de boas-vindas.
2. Um endpoint que retorna uma mensagem personalizada com o nome informado na URL.

---

## Como executar localmente

### Pré-requisitos
- Java 17 ou superior
- Maven instalado

### Passos
1. Clone o repositório ou baixe o projeto:
   ```bash
   git clone https://github.com/Gabriella-Aquino/welcome---spring.git```

Compile e execute o projeto:

```
mvn spring-boot:run
```


Acesse no navegador:

```
http://localhost:8080/api/welcome
http://localhost:8080/api/welcome/{nome}
```
