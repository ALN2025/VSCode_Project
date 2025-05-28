# Sistema de Gerenciamento de Conexão com Banco de Dados

## 📋 Descrição
Este projeto implementa um sistema de gerenciamento de conexão com banco de dados PostgreSQL utilizando Java, seguindo padrões de projeto e boas práticas de desenvolvimento. O sistema foi desenvolvido como parte do curso de Análise e Desenvolvimento de Sistemas (ADS) da Universidade de Caxias do Sul (UCS), onde o código fonte base foi fornecido pela instituição e adaptado para execução no Visual Studio Code.

## 🎓 Informações Acadêmicas
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Instituição:** Universidade de Caxias do Sul (UCS)
- **Ano:** 2025
- **Desenvolvedor:** Dev ⩿ A.L.N/⪀
- **Tipo de Projeto:** Adaptação de código fonte fornecido pela instituição

## 🚀 Tecnologias Utilizadas
- Java 8
- PostgreSQL
- Maven
- JDBC
- Visual Studio Code

## 📦 Pré-requisitos
- JDK 8 ou superior
- PostgreSQL 12 ou superior
- Maven 3.6 ou superior
- Visual Studio Code com extensões Java

## 🔧 Instalação

1. Clone o repositório:
```bash
git clone [URL_DO_REPOSITÓRIO]
```

2. Configure o banco de dados PostgreSQL:
```sql
CREATE DATABASE livros;
```

3. Configure as credenciais do banco de dados no arquivo `src/main/java/combo/principal/Principal.java`:
```java
conexaoModel.setHost("localhost");
conexaoModel.setPorta("5432");
conexaoModel.setBanco("livros");
conexaoModel.setUsuario("postgres");
conexaoModel.setSenha("sua_senha");
```

4. Compile o projeto:
```bash
mvn clean install
```

## 🏗️ Estrutura do Projeto
```
VSCode_Project/
├── src/
│   └── main/
│       └── java/
│           └── combo/
│               ├── principal/
│               │   └── Principal.java
│               ├── bo/
│               │   └── BoConexao.java
│               ├── dao/
│               │   └── DaoConectarBD.java
│               └── modelo/
│                   └── Conexao.java
├── pom.xml
└── .vscode/
    └── launch.json
```

## 🎯 Funcionalidades
- Conexão com banco de dados PostgreSQL
- Validação de dados de conexão
- Tratamento de erros
- Gerenciamento de conexão

## 📊 Arquitetura

### Camadas do Sistema
1. **Apresentação**: Interface com o usuário
2. **Negócios**: Regras de negócio e validações
3. **Acesso a Dados**: Interação com o banco de dados
4. **Modelo**: Representação dos dados

### Padrões de Design
- Arquitetura em Camadas
- DAO (Data Access Object)
- POJO (Plain Old Java Object)

## 🔄 Fluxo de Execução
1. Inicialização da aplicação
2. Validação dos dados de conexão
3. Estabelecimento da conexão
4. Execução das operações
5. Encerramento da conexão

## 🛠️ Desenvolvimento

### Configuração do Ambiente
1. Instale o JDK 8
2. Instale o PostgreSQL
3. Instale o Maven
4. Configure o VS Code com as extensões Java

### Executando o Projeto
1. Abra o projeto no VS Code
2. Execute a classe `Principal.java`
3. Verifique a saída no console

## 📈 Melhorias Futuras
- Implementação de suporte a múltiplos SGBDs
- Interface gráfica com JavaFX
- Sistema de paginação
- Validação visual de campos
- Logs detalhados

## 🤝 Contribuição
1. Faça o fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📝 Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👥 Autores
- Dev ⩿ A.L.N/⪀ - ADS UCS 2025

## 📚 Referências
- [Oracle Java Documentation](https://docs.oracle.com/javase/8/)
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)
- [Maven Documentation](https://maven.apache.org/guides/)
- Design Patterns: Elements of Reusable Object-Oriented Software
- Material didático fornecido pela UCS 