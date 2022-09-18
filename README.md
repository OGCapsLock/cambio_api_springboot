# Beckend Java Springboot
Este projeto foi desenvolvido como parte prática de um teste

# Objetivos Propostos
Crie um programa Java que expõe um serviço RESTfull de Consulta de Câmbios.
O programa deve usar:

i.      Spring Boot;

ii.     Maven;

iii.    In Memory H2, para ler os dados;

iv.     Fazer o deploy usando heroku.

Pontos de Foco:

i.      Boas Praticas;

ii.      SOLID Principle.

# Tecnologias usadas para realizar o teste

Spring Boot Framework (version 2.7.3.BUILD-SNAPSHOT);

Java 18

JPA;

Hibernate;

H2 Database;

Rest;

Heroku;

Maven;

Git;

GitHub;

Postman;

Intellij.


# API disponivel no Heroku
link: https://cambioapiher.herokuapp.com/cambio

# Principais EndPoints
Gravar, atualizar, consultar e excluir

# Estrutura da API
Entity => Este pacote serve para adicionar as nosss entidades de base de dados;

Repository => Este pacote serve para acessar as entidades da base de dados;

Service => Este pacote serve para adicionar as regras de negocio;

Http.Controller => Este pacote serve para adiconar tudo referente a exposicao dos endpoints(Rotas de acesso os serviços de cambio.

# API teste
GET requisições para /cambio retorna uma lista de Moedas/Pais com respetivos id, moeda e preço, em formato JSON

GET requisições para /cambio/1 retorna moeda com o ID 1

POST requisições para /cambio com um objeto cambio JSON cria uma nova moeda

PUT requisições para /cambio/1 com um objeto cambio JSON atualiza a moeda com ID 1

DELETE requisições para /cambio/1 deleta o usuário com ID 1



# Autor
Osvaldo Amosse Cuambe aka CapsLock

