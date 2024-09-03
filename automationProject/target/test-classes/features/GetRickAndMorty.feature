# language: pt

#noinspection NonAsciiCharacters
@RickAndMorty
Funcionalidade: Validar retorno da API Rick And Morty

  Cenário: Deve ser possivel consultar passando um id existente
    Quando eu enviar no endpoint "/api/character" usando o id "692"
    Entao o status devera ser "Alive"
    E o servidor deve me retornar o status code 200