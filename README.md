# Sistema de Gerenciamento de Conexão com Banco de Dados PostgreSQL

![Java 8](https://img.shields.io/badge/Java-8-orange) ![Status](https://img.shields.io/badge/Status-Development-blue) ![License](https://img.shields.io/badge/License-UCS_License-blue) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white) ![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white) ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white) ![pgAdmin 4](https://img.shields.io/badge/pgAdmin4-23211F?style=for-the-badge&logo=pgadmin4&logoColor=white)

## 📋 Sobre o Projeto

Este projeto foi desenvolvido e adaptado por mim como parte da disciplina de Análise e Desenvolvimento de Sistemas da Universidade de Caxias do Sul (UCS). O sistema implementa uma conexão com banco de dados PostgreSQL utilizando Java, seguindo padrões de projeto como DAO e POJO. O código base inicial foi fornecido pela instituição.

## 🚀 Tecnologias Utilizadas

- Java 8
- PostgreSQL
- Maven
- Visual Studio Code
- pgAdmin 4

## ⚙️ Funcionalidades

- Conexão com banco de dados PostgreSQL
- Validação de dados de conexão
- Tratamento de exceções
- Feedback de status da conexão

## 🛠️ Arquitetura

O projeto segue uma arquitetura em camadas:
- Camada de Apresentação (Principal)
- Camada de Negócios (BO)
- Camada de Acesso a Dados (DAO)
- Camada de Modelo

## 📦 Estrutura do Projeto

```
combo/
├── principal/  (Camada de Apresentação)
│   └── Principal.java
├── bo/         (Camada de Negócios)
│   └── BoConexao.java
├── dao/        (Camada de Acesso a Dados)
│   └── DaoConectarBD.java
└── modelo/     (Camada de Modelo)
    └── Conexao.java
```

## 🔧 Configuração do Ambiente

1. Instale o JDK 8
2. Instale o Maven
3. Instale o PostgreSQL
4. Instale o pgAdmin 4
5. Clone este repositório
6. Configure o banco de dados `livros`
7. Execute o projeto

## 🚧 Processo de Desenvolvimento

O código base inicial deste projeto foi fornecido pela Universidade de Caxias do Sul (UCS), originalmente desenvolvido no ambiente Eclipse. Meu trabalho envolveu a adaptação deste código para ser executado no Visual Studio Code, meu editor de código preferido. Para isso, estruturei o projeto utilizando Maven para o gerenciamento de dependências e configurei o ambiente de desenvolvimento no VS Code, incluindo o arquivo `launch.json` para facilitar a execução e o debug.

## 📝 Requisitos do Sistema

### Requisitos Funcionais
- Estabelecer e encerrar conexão com PostgreSQL
- Validar dados de conexão
- Fornecer feedback sobre o status da conexão

### Requisitos Não-Funcionais
- Confiabilidade no tratamento de erros
- Usabilidade através de interface clara
- Portabilidade entre diferentes ambientes
- Segurança básica na validação de dados

## 🔄 Próximas Melhorias

- Implementação do padrão Factory Method para suporte a múltiplos SGBDs
- Desenvolvimento de sistema de paginação
- Criação de interface gráfica

## 👨‍💻 Autor

Dev ⩿ A.L.N/⪀

## 📄 Licença

Este projeto está sob a licença da Universidade de Caxias do Sul.

## 📚 Referências

- Documentação oficial do Java
- Documentação oficial do PostgreSQL
- Documentação oficial do Maven
- Código base fornecido pela UCS 
