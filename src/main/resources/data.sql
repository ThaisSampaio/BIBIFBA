drop table if exists Livros;

create table Livros{
idLivros integer key auto_increment,
titulo varchar(50) not null,
descricao varchar(1000),
referencia varchar(1000)not null,
cadastro date not null
);

insert into Livros(idLivros,titulo,descricao,referencia,cadastro) values
(1,'50 tons de liberdade','Conto submissão','123545', CURRENT_DATE()),
(2,'La casa de papel','Baseado em serie','45785','2020-12-21');