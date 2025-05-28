# Sistema de Gerenciamento de Conexão com Banco de Dados PostgreSQL

## 📋 Sobre o Projeto

Este projeto foi desenvolvido como parte da disciplina de Análise e Desenvolvimento de Sistemas da Universidade de Caxias do Sul (UCS). O sistema implementa uma conexão com banco de dados PostgreSQL utilizando Java, seguindo padrões de projeto como DAO e POJO.

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