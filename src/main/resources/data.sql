drop table if exists Livros;


CREATE TABLE Livros (
   id INTEGER PRIMARY KEY AUTO_INCREMENT,
   titulo VARCHAR(50) NOT NULL,
   descricao VARCHAR(1000),
   referencia VARCHAR(1000) NOT NULL,
   cadastro DATE NOT NULL
);


insert into Livros(titulo,descricao,referencia,cadastro) values
('50 tons de liberdade','Conto submissão','123545', CURRENT_DATE()),
('La casa de papel','Baseado em serie','45785','2020-12-21');
