# Sistema de Cadastro de Pessoas

Este é um sistema simples de cadastro de pessoas em Java que permite:
- Cadastrar até 10 pessoas
- Calcular IMC e classificação corporal
- Calcular idade automaticamente
- Verificar duplicidade de nomes

## Funcionalidades
- Cadastro de pessoas com nome, sobrenome, data de nascimento, altura e peso
- Cálculo automático de IMC e classificação corporal
- Cálculo de idade baseado na data de nascimento
- Verificação de duplicidade de nomes
- Exibição formatada dos dados cadastrados

## Como executar
1. Compile os arquivos Java:
```bash
javac *.java
```

2. Execute a classe Main:
```bash
java Main
```

## Estrutura do Projeto
- `Data.java`: Classe para manipulação de datas
- `Pessoa.java`: Classe que representa uma pessoa e seus atributos
- `Main.java`: Classe principal com a lógica de cadastro e exibição