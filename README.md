# Controle de Casa Inteligente

Este projeto implementa um sistema para controle de dispositivos inteligentes utilizando padrões de projeto como **Strategy**, **State**, **Null Object** e **Hook Methods**. O sistema permite a adição, controle e remoção de dispositivos, com suporte para modos de operação e transições de estado.

## Funcionalidades

- **Gerenciamento de Dispositivos**: Adição, remoção e controle.
- **Modos de Operação**: Modo Normal, Economia e Turbo.
- **Controle de Estados**: Estados `Ligado` e `Desligado` com transições automáticas.
- **Dispositivo Genérico/Nulo**: Implementações para dispositivos que não existem ou genéricos.
- **Hook Methods**: Personalização antes e depois de ligar/desligar.

## Padrões de Projeto

### Strategy
Gerencia o comportamento de dispositivos em diferentes modos de operação:
- **Interface**: `ModoOperacao`
- **Implementações**: `ModoNormal`, `ModoEconomia`, `ModoTurbo`

### State
Controla o estado do dispositivo (`Ligado`/`Desligado`):
- **Classe abstrata**: `Estado`
- **Implementações**: `EstadoLigado`, `EstadoDesligado`

### Null Object
Evita erros de referência quando um dispositivo não existe:
- **Implementação**: `DispositivoNulo`, `ModoNulo`

### Hook Methods
Métodos para personalizar ações antes/depois de ligar/desligar dispositivos:
- **Métodos**: `preLigarDesligar()`, `posLigarDesligar()`

## Estrutura de Código

- **ControleCasaInteligente**: Gerencia dispositivos e suas operações.
- **Dispositivo**: Classe base para dispositivos.
- **DispositivoNulo**: Para dispositivos ausentes.
- **Modos de Operação**: `ModoNormal`, `ModoEconomia`, `ModoTurbo`.
- **Estados**: `EstadoLigado`, `EstadoDesligado`.
