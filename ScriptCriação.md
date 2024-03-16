# Script SQL para Databases

### SQL Server

```sql
CREATE DATABASE auth;
USE auth;

CREATE TABLE usuario (
    codigo INT PRIMARY KEY IDENTITY,
    nome VARCHAR(56),
    email VARCHAR(50),
    senha VARCHAR(20)
);

CREATE DATABASE app;
USE app;

CREATE TABLE livro (
    codigo INT PRIMARY KEY IDENTITY,
    titulo VARCHAR(50),
    autor VARCHAR(50),
    tema VARCHAR(50),
    nome_usuario VARCHAR(50)
);
```

### MySQL

```sql
CREATE DATABASE auth;
USE auth;

CREATE TABLE usuario (
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(56),
    email VARCHAR(50),
    senha VARCHAR(20)
);

CREATE DATABASE app;
USE app;

CREATE TABLE livro (
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(50),
    autor VARCHAR(50),
    tema VARCHAR(50),
    nome_usuario VARCHAR(50)
);
```
### Oracle

```sql
CREATE USER auth IDENTIFIED BY senha_auth;
GRANT CONNECT, RESOURCE TO auth;
ALTER USER auth DEFAULT TABLESPACE users;

CREATE TABLE usuario (
    codigo INT PRIMARY KEY,
    nome VARCHAR2(56),
    email VARCHAR2(50),
    senha VARCHAR2(20)
);

CREATE USER app IDENTIFIED BY senha_app;
GRANT CONNECT, RESOURCE TO app;
ALTER USER app DEFAULT TABLESPACE users;

CREATE TABLE livro (
    codigo INT PRIMARY KEY,
    titulo VARCHAR2(50),
    autor VARCHAR2(50),
    tema VARCHAR2(50),
    nome_usuario VARCHAR2(50)
);

```
