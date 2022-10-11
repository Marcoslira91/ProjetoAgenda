CREATE DATABASE agenda;
USE agenda;

CREATE TABLE Contatos(
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR (50),
idade int,
datacadastro DATE
);
desc contatos;

select * FROM Contatos;