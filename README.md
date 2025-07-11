# Biblioteca - Gerenciamento de Itens

## Descrição
Este projeto simula um sistema simples de gerenciamento de itens em uma biblioteca, utilizando conceitos de herança, classes abstratas e polimorfismo em Java.

## Estrutura
- **Classe abstrata `ItemBiblioteca`**: classe base com atributos comuns `titulo` e `codigo` e método abstrato `exibirInformacoes()`.
- **Subclasses**:
  - `Livro`: possui atributos adicionais `autor` e `numeroPaginas`.
  - `Revista`: possui atributo adicional `edicao`.
  - `DVD`: possui atributo adicional `duracao` (em minutos).

## Funcionalidades
- Criação de uma lista mista contendo livros, revistas e DVDs.
- Exibição das informações específicas de cada item utilizando polimorfismo, através do método `exibirInformacoes()` sobrescrito em cada subclasse.

