# Script SQL para inserção

### Banco AUTH

```sql
USE auth;

INSERT INTO usuario (nome, email, senha) VALUES
('João', 'joao@email.com', 'senha123'),
('Maria', 'maria@email.com', 'senha456'),
('Pedro', 'pedro@email.com', 'senha789'),
('Ana', 'ana@email.com', 'senha321'),
('Carlos', 'carlos@email.com', 'senha654'),
('Mariana', 'mariana@email.com', 'senha987'),
('Lucas', 'lucas@email.com', 'senha1234'),
('Juliana', 'juliana@email.com', 'senha5678'),
('Fernando', 'fernando@email.com', 'senha9012'),
('Lúcia', 'lucia@email.com', 'senha3456'),
('André', 'andre@email.com', 'senha7890'),
('Patrícia', 'patricia@email.com', 'senha12345'),
('Gabriel', 'gabriel@email.com', 'senha67890'),
('Tatiane', 'tatiane@email.com', 'senha09876'),
('Rafael', 'rafael@email.com', 'senha54321');
```

### Banco APP
```sql
USE app;

INSERT INTO livro (titulo, autor, tema, nome_usuario) VALUES
('Aventuras de Tom Sawyer', 'Mark Twain', 'Aventura', 'João'),
('Dom Quixote', 'Miguel de Cervantes', 'Ficção', 'Maria'),
('O Senhor dos Anéis', 'J.R.R. Tolkien', 'Fantasia', 'Pedro'),
('Orgulho e Preconceito', 'Jane Austen', 'Romance', 'Ana'),
('1984', 'George Orwell', 'Ficção Científica', 'Carlos'),
('O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 'Infantil', 'Mariana'),
('Cem Anos de Solidão', 'Gabriel García Márquez', 'Realismo Mágico', 'Lucas'),
('A Culpa é das Estrelas', 'John Green', 'Romance', 'Juliana'),
('O Poder do Hábito', 'Charles Duhigg', 'Autoajuda', 'Fernando'),
('Pai Rico, Pai Pobre', 'Robert T. Kiyosaki', 'Finanças', 'Lúcia'),
('O Hobbit', 'J.R.R. Tolkien', 'Fantasia', 'André'),
