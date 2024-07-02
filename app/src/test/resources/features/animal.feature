# language: pt

Funcionalidade: Gerenciamento de um animal na Petstore

  @deleteAllUsers
  Cenario: Lista somente animais disponiveis para venda
    Dado que eu possua animais available
    Quando eu pesquiso por todos os animais available
    Entao eu recebo a lista de animais available
