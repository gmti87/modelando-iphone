
```mermaid
classDiagram
      Veiculo <|-- Carro
      Veiculo <|-- Aviao
      Veiculo <|-- Motocicleta
      Veiculo : +int idade
      Veiculo : +int kmsRodados
      Veiculo: +estaFuncionando()
      Veiculo: +dirigir()
      class Carro{
          +String Cor
          +acelerar()
          +parar()
      }
      class Aviao{
          -int tamanhoEmMetros
          -decolar()
      }
      class Motocicleta{
          +bool estaFuncionando
          +acelerar()
      }
```

Projeto Dio
