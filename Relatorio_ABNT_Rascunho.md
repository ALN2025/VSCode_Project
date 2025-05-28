# Relatório de Implementação e Análise de Projeto Java com PostgreSQL

## Capa

UNIVERSIDADE DE CAXIAS DO SUL (UCS)

CURSO: ANÁLISE E DESENVOLVIMENTO DE SISTEMAS (ADS)

PROJETO:
Sistema de Gerenciamento de Conexão com Banco de Dados PostgreSQL

DISCIPLINA:
Análise e Desenvolvimento de Sistemas

Professor:
[Nome do Professor]

Alunos:
1. Dev ⩿ A.L.N/⪀
2. [Nome do Aluno 2]
3. [Nome do Aluno 3]
4. [Nome do Aluno 4]
5. [Nome do Aluno 5]
6. [Nome do Aluno 6]

CAXIAS DO SUL
2025

## Folha de Rosto

[Título do Projeto: Sistema de Gerenciamento de Conexão com Banco de Dados PostgreSQL]

Relatório apresentado como requisito parcial para obtenção de aprovação na disciplina Análise e Desenvolvimento de Sistemas, do curso de Análise e Desenvolvimento de Sistemas da Universidade de Caxias do Sul.

Orientador:
[Nome do Professor Orientador, se houver]

Alunos:
1. Dev ⩿ A.L.N/⪀
2. [Nome do Aluno 2]
3. [Nome do Aluno 3]
4. [Nome do Aluno 4]
5. [Nome do Aluno 5]
6. [Nome do Aluno 6]

CAXIAS DO SUL
2025

## Resumo

Neste projeto, desenvolvi a implementação e análise de um sistema em Java para conexão com banco de dados PostgreSQL. Adaptei o código base do ambiente Eclipse para o Visual Studio Code, que é o editor que mais gosto de usar, utilizando Maven para organizar as dependências. No relatório, detalho todo o processo de instalação e configuração que realizei, identifico os requisitos do sistema original, descrevo como entendi a arquitetura implementada e proponho melhorias para as próximas fases, incluindo suporte a múltiplos bancos de dados, implementação de paginação e desenvolvimento de interface gráfica. A implementação seguiu os padrões de projeto que estudamos na disciplina, como DAO e POJO, mantendo uma arquitetura em camadas que facilita a manutenção e evolução do sistema.

**Palavras-chave:** Java, PostgreSQL, Maven, VS Code, ABNT, Arquitetura de Software, DAO, Requisitos, Análise e Desenvolvimento de Sistemas.

## Lista de Ilustrações

Figura 1 – Diagrama da Arquitetura Lógica do Sistema
Figura 2 – Diagrama da Arquitetura Física do Sistema

## Sumário

1 INTRODUÇÃO
2 IMPLEMENTAÇÃO E TESTE DO SISTEMA
   2.1 PROCESSO DE INSTALAÇÃO E CONFIGURAÇÃO
   2.2 RESULTADOS DOS TESTES
3 REQUISITOS DO SISTEMA
   3.1 REQUISITOS FUNCIONAIS
   3.2 REQUISITOS NÃO-FUNCIONAIS
4 ARQUITETURA DO SISTEMA
   4.1 ARQUITETURA FÍSICA
   4.2 ARQUITETURA LÓGICA
   4.3 ARQUITETURA DE SOFTWARE
5 PROPOSTAS DE MELHORIAS
   5.1 SUPORTE A MÚLTIPLOS BANCOS DE DADOS
   5.2 IMPLEMENTAÇÃO DE PAGINAÇÃO
   5.3 DESENVOLVIMENTO DE INTERFACE GRÁFICA
6 CONCLUSÃO
REFERÊNCIAS
APÊNDICE A – CHECKLIST DO PROJETO

## 1 INTRODUÇÃO

Este relatório apresenta a primeira etapa do projeto desenvolvido para a disciplina Análise e Desenvolvimento de Sistemas da UCS, em 2025. O objetivo principal foi analisar e adaptar um sistema Java base para conexão com PostgreSQL, originalmente desenvolvido no Eclipse, para o ambiente Visual Studio Code com gerenciamento de dependências via Maven. A documentação abrange o processo de configuração do ambiente, análise dos requisitos do sistema, descrição da arquitetura implementada e propostas de melhorias para as próximas etapas. O código fonte está disponível no repositório GitHub: https://github.com/ALN2025/VSCode_Project.

## 2 IMPLEMENTAÇÃO E TESTE DO SISTEMA

### 2.1 PROCESSO DE INSTALAÇÃO E CONFIGURAÇÃO

Para implementar e testar o sistema, realizei as seguintes etapas:

1. **Preparação do Ambiente de Desenvolvimento:**
   - Instalei o Visual Studio Code, que é o editor que mais gosto de usar
   - Configurei as extensões Java necessárias
   - Instalei o JDK 8
   - Instalei o Maven para gerenciar as dependências

2. **Configuração do Banco de Dados:**
   - Instalei o PostgreSQL
   - Instalei o pgAdmin 4 para gerenciar o banco
   - Criei o banco de dados `livros`
   - Configurei o usuário `postgres`

3. **Estruturação do Projeto:**
   - Criei o projeto Maven
   - Configurei o arquivo `pom.xml` com as dependências necessárias
   - Organizei a estrutura de diretórios seguindo o padrão Maven
   - Configurei o arquivo `launch.json` para executar o projeto no VS Code

### 2.2 RESULTADOS DOS TESTES

O sistema funcionou perfeitamente na primeira execução. A conexão com o banco de dados PostgreSQL foi estabelecida e encerrada com sucesso, sem apresentar erros. O output do terminal confirmou o sucesso da operação:

```
Conexão estabelecida com sucesso!
Conexão encerrada com sucesso!
```

Este resultado me mostrou que:
1. A configuração do ambiente de desenvolvimento estava correta
2. As credenciais do banco de dados estavam configuradas adequadamente
3. O driver JDBC do PostgreSQL estava funcionando corretamente
4. O código implementava adequadamente o tratamento de conexões e exceções

## 3 REQUISITOS DO SISTEMA

### 3.1 REQUISITOS FUNCIONAIS

1. **RF1:** Estabelecer e encerrar conexão com o PostgreSQL
2. **RF2:** Validar dados de conexão antes da execução
3. **RF3:** Fornecer feedback sobre o status da conexão

### 3.2 REQUISITOS NÃO-FUNCIONAIS

1. **RNF1:** Confiabilidade no tratamento de erros
2. **RNF2:** Usabilidade através de interface clara
3. **RNF3:** Portabilidade entre diferentes ambientes
4. **RNF4:** Segurança básica na validação de dados

## 4 ARQUITETURA DO SISTEMA

### 4.1 ARQUITETURA FÍSICA

O sistema é composto por:
- Ambiente de desenvolvimento (VS Code, JDK, Maven)
- Servidor PostgreSQL
- Banco de dados `livros`

### 4.2 ARQUITETURA LÓGICA

O sistema implementa uma arquitetura em camadas:
1. Camada de Apresentação (Principal)
2. Camada de Negócios (BoConexao)
3. Camada de Acesso a Dados (DaoConectarBD)
4. Camada de Modelo (Conexao)

### 4.3 ARQUITETURA DE SOFTWARE

Padrões de projeto implementados:
1. DAO (Data Access Object)
2. POJO (Plain Old Java Object)
3. Arquitetura em Camadas

## 5 PROPOSTAS DE MELHORIAS

### 5.1 SUPORTE A MÚLTIPLOS BANCOS DE DADOS

Implementação do padrão Factory Method para suportar diferentes SGBDs:
- Interface ConexaoDAO
- Implementações específicas para PostgreSQL e MySQL
- Fábrica de conexões

### 5.2 IMPLEMENTAÇÃO DE PAGINAÇÃO

Desenvolvimento de sistema de paginação para exibição de dados:
- Classe Paginacao
- Modificação das consultas SQL
- Interface de navegação

### 5.3 DESENVOLVIMENTO DE INTERFACE GRÁFICA

Criação de interface gráfica utilizando JavaFX ou Spring Boot:
- Formulário de conexão
- Tabela de dados
- Validação visual
- Mensagens de status

## 6 CONCLUSÃO

Nesta primeira etapa do projeto, consegui implementar e testar com sucesso o sistema Java com PostgreSQL no VS Code, utilizando o Maven para gerenciar as dependências. Analisei a fundo o funcionamento do sistema, identifiquei seus requisitos e qualidades, e compreendi sua arquitetura em camadas. As propostas de melhorias que apresentei para as próximas fases, incluindo suporte a múltiplos bancos de dados, implementação de paginação e desenvolvimento de interface gráfica, servirão como base para a evolução do projeto. Acredito que o trabalho realizado até agora e as propostas apresentadas constituem um bom ponto de partida para o desenvolvimento das próximas etapas.

## REFERÊNCIAS

1. Documentação oficial do Java
2. Documentação oficial do PostgreSQL
3. Documentação oficial do Maven
4. Material didático da disciplina de Análise e Desenvolvimento de Sistemas

## APÊNDICE A – CHECKLIST DO PROJETO

# Meu Checklist do Projeto

## ✅ O que já consegui fazer

### Ambiente de Desenvolvimento
- [x] Instalei o VS Code, que é o editor que mais gosto de usar
- [x] Coloquei as extensões do Java que o VS Code pediu
- [x] Instalei o JDK 8 pra rodar o Java
- [x] Instalei o Maven pra organizar as dependências

### Estrutura do Projeto
- [x] Criei a pasta do projeto
- [x] Configurei o pom.xml com as dependências que precisava
- [x] Organizei as pastas do jeito que o Maven pede
- [x] Ajustei o launch.json pra rodar no VS Code

### Código
- [x] Criei os pacotes que o projeto precisa
- [x] Implementei a classe Principal
- [x] Implementei a classe Conexao
- [x] Implementei a classe BoConexao
- [x] Implementei a classe DaoConectarBD

### Banco de Dados
- [x] Criei o banco livros
- [x] Configurei o usuário postgres
- [x] Usei o pgAdmin 4 pra gerenciar o banco
- [x] Testei a conexão e funcionou de primeira!

### Documentação
- [x] Fiz o relatório inicial
- [x] Documentei a arquitetura que entendi
- [x] Documentei os requisitos que identifiquei
- [x] Documentei as ideias de melhoria que tive

## 📝 O que ainda falta fazer

### Melhorias no Código
- [ ] Implementar o Factory Method pra conectar com outros bancos
- [ ] Criar a interface ConexaoDAO
- [ ] Fazer a implementação pro PostgreSQL
- [ ] Fazer a implementação pro MySQL
- [ ] Criar a fábrica de conexões

### Paginação
- [ ] Criar a classe de paginação
- [ ] Ajustar as consultas SQL
- [ ] Fazer a interface de navegação

### Interface Gráfica
- [ ] Decidir se vou usar JavaFX ou Spring Boot
- [ ] Criar o formulário de conexão
- [ ] Fazer a tabela de dados
- [ ] Adicionar validação visual
- [ ] Implementar as mensagens de status

### Documentação Final
- [ ] Atualizar o relatório com as novas implementações
- [ ] Fazer os diagramas atualizados
- [ ] Documentar as decisões de design
- [ ] Preparar a apresentação

## 📋 Próximos Passos

1. Vou começar implementando o Factory Method pra poder conectar com outros bancos
2. Depois vou fazer a interface gráfica básica
3. Aí implemento a paginação
4. Atualizo a documentação
5. Por fim, preparo a apresentação