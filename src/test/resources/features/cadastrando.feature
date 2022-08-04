# language: pt

  Funcionalidade: Me cadastrar no site do Pessoni
      Eu como usuario do site Pessonizando
      Quero me cadastrar meu email
      Para receber novidades de cursos e conteudos

Cenário: Cadastrando email
  Dado que estou no site do Pessoni
  Quando eu preencho meu nome
  E meu email
  E clico em inscrever
  Entao devo ser redirecionado para uma tela de confirmação de cadastro
