# Relatório de Implementação e Análise de Projeto Java com PostgreSQL

## Identificação do Grupo
[Preencher com os dados do grupo]

## 1. Processo de Instalação e Teste

### 1.1 Etapas Realizadas

1. **Configuração do Ambiente de Desenvolvimento**
   - Instalação do Visual Studio Code
   - Instalação das extensões Java para VS Code
   - Instalação do JDK 8
   - Instalação do PostgreSQL
   - Instalação do Maven

2. **Estruturação do Projeto**
   - Criação da pasta `VSCode_Project`
   - Configuração do projeto Maven com `pom.xml`
   - Criação da estrutura de diretórios padrão Maven
   - Configuração do arquivo `launch.json` para execução no VS Code

3. **Implementação do Código**
   - Criação dos pacotes necessários:
     - `combo.principal`
     - `combo.modelo`
     - `combo.bo`
     - `combo.dao`
   - Implementação das classes:
     - `Principal.java`
     - `Conexao.java`
     - `BoConexao.java`
     - `DaoConectarBD.java`

4. **Configuração do Banco de Dados**
   - Criação do banco de dados `livros`
   - Configuração do usuário `postgres`
   - Teste de conexão via psql

### 1.2 Problemas Encontrados e Soluções

1. **NullPointerException na Conexão**
   - **Problema:** Erro ao tentar acessar conexão nula
   - **Solução:** Implementação de verificações de nulo e tratamento de exceções

2. **ClassNotFoundException do Driver PostgreSQL**
   - **Problema:** Driver JDBC não encontrado no classpath
   - **Solução:** Adição da dependência no `pom.xml`:
     ```xml
     <dependency>
         <groupId>org.postgresql</groupId>
         <artifactId>postgresql</artifactId>
         <version>42.2.4</version>
     </dependency>
     ```

3. **Erros de Linter no VS Code**
   - **Problema:** Avisos sobre pacotes não correspondentes
   - **Solução:** Configuração correta do Maven para gerenciar a estrutura de pacotes

## 2. Requisitos do Sistema

### 2.1 Requisitos Funcionais

1. **Gerenciamento de Conexão**
   - Estabelecer conexão com banco de dados PostgreSQL
   - Validar dados de conexão
   - Encerrar conexão com o banco de dados

2. **Validação de Dados**
   - Verificar campos obrigatórios
   - Validar formato dos dados de conexão

### 2.2 Requisitos Não-Funcionais

1. **Confiabilidade**
   - Tratamento de erros de conexão
   - Validação de dados de entrada

2. **Usabilidade**
   - Interface simples e intuitiva
   - Mensagens claras de erro e sucesso

3. **Portabilidade**
   - Compatibilidade com diferentes sistemas operacionais
   - Uso de padrões Java e JDBC

4. **Segurança**
   - Proteção de credenciais do banco de dados
   - Validação de dados de entrada

## 3. Arquitetura do Sistema

### 3.1 Arquitetura Física

```
[Cliente] <---> [Servidor PostgreSQL]
   |
   +-- VS Code
   +-- JVM
   +-- Maven
```

### 3.2 Arquitetura Lógica

```
[Camada de Apresentação]
        |
[Camada de Negócios]
        |
[Camada de Acesso a Dados]
        |
[Camada de Modelo]
```

### 3.3 Arquitetura de Software

1. **Padrões de Design Utilizados**
   - Arquitetura em Camadas
   - DAO (Data Access Object)
   - POJO (Plain Old Java Object)

2. **Estrutura de Pacotes**
   ```
   combo/
   ├── principal/
   │   └── Principal.java
   ├── bo/
   │   └── BoConexao.java
   ├── dao/
   │   └── DaoConectarBD.java
   └── modelo/
       └── Conexao.java
   ```

## 4. Propostas de Melhorias

### 4.1 Segunda Conexão com Outro SGBD

1. **Padrão Factory Method**
   - Criação de interface `ConexaoDAO`
   - Implementações específicas para PostgreSQL e MySQL
   - Fábrica para criar instâncias de conexão

2. **Estrutura Proposta**
   ```
   combo/
   ├── dao/
   │   ├── ConexaoDAO.java
   │   ├── PostgreSqlConexaoDAO.java
   │   └── MySqlConexaoDAO.java
   └── factory/
       └── FabricaConexao.java
   ```

### 4.2 Paginação de Componentes

1. **Implementação Proposta**
   - Modificação das consultas SQL com LIMIT e OFFSET
   - Classe `Paginacao` para gerenciar estado
   - Interface para navegação entre páginas

2. **Estrutura de Dados**
   ```java
   public class Paginacao {
       private int paginaAtual;
       private int itensPorPagina;
       private int totalItens;
   }
   ```

### 4.3 Melhorias na Interface Gráfica

1. **Tecnologias Sugeridas**
   - JavaFX para interface desktop
   - Spring Boot para aplicação web

2. **Componentes Propostos**
   - Formulário de conexão
   - Tabela de dados com paginação
   - Mensagens de status
   - Validação visual de campos

## 5. Conclusão

O projeto demonstra a implementação de uma aplicação Java com conexão a banco de dados PostgreSQL, seguindo boas práticas de desenvolvimento e padrões de projeto. As propostas de melhorias visam tornar o sistema mais robusto, extensível e com melhor experiência do usuário.

## 6. Referências

1. Oracle Java Documentation
2. PostgreSQL Documentation
3. Maven Documentation
4. Design Patterns: Elements of Reusable Object-Oriented Software 