# Projeto UI - SauceDemo

## Descrição

O objetivo deste projeto é criar uma automação de testes para a interface do usuário (UI) da aplicação web [SauceDemo](https://www.saucedemo.com/). O projeto foi desenvolvido em Java, utilizando o Selenium WebDriver para interações automatizadas e o JUnit para a execução dos testes.

## Estrutura do Projeto

- **`Drivers.java`**: Configura e inicializa os drivers de navegador (como ChromeDriver, GeckoDriver) utilizados nos testes automatizados.
- **`Metodos.java`**: Contém métodos genéricos para interações com a interface do usuário, como cliques, preenchimento de formulários e captura de textos.
- **`Executa.java`**: Gerencia a execução dos testes, incluindo a configuração inicial (setup) e finalização (teardown).
- **`LoginTest.java`**: Implementa o caso de teste que valida o processo de login na aplicação SauceDemo.
- **`.classpath`**: Define o classpath do projeto, listando as dependências e bibliotecas utilizadas.
- **`.project`**: Arquivo de configuração do Eclipse, definindo as propriedades do projeto.
- **`pom.xml`**: Gerencia as dependências do projeto utilizando o Maven.
- **`org.eclipse.jdt.core.prefs`** e **`org.eclipse.m2e.core.prefs`**: Arquivos de configuração do Eclipse, armazenando preferências e configurações específicas do ambiente de desenvolvimento.

## Funcionalidades

- **Testes Automatizados**: Automação de testes para a interface do usuário da aplicação SauceDemo, incluindo cenários de login e outras funcionalidades críticas.
- **Configuração de Drivers**: Suporte a múltiplos navegadores através da configuração centralizada em `Drivers.java`.
- **Reutilização de Código**: Métodos genéricos de interação com a UI definidos em `Metodos.java`, reutilizados em diferentes testes.
- **Estrutura de Testes**: Testes organizados e executados de forma ordenada através de `Executa.java`, garantindo consistência e confiabilidade.

## Dependências

As dependências do projeto são gerenciadas pelo Maven:

- **Selenium Java**: Versão `4.23.1` para interações com a UI.
- **JUnit**: Versão `4.13.2` para criação e execução dos testes.

## Requisitos

- **Java**: JDK 8 ou superior.
- **Maven**: Para gerenciamento de dependências e construção do projeto.
- **Eclipse**: IDE utilizada para o desenvolvimento e execução dos testes.

## Como Executar

1. **Clone o repositório**:
   ```bash
   git clone <url-do-repositorio>

## Como Executar

2. **Importe o projeto para o Eclipse**:
   - Abra o Eclipse.
   - Selecione a opção de importação de projetos Maven existentes.
   - Navegue até o diretório onde o repositório foi clonado e importe o projeto.

3. **Execute os testes**:
   - Certifique-se de que todas as dependências foram resolvidas corretamente pelo Maven.
   - Navegue até a classe `Executa.java` e execute-a para rodar todos os testes definidos no projeto.

## Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/MinhaFeature`).
3. Comite suas mudanças (`git commit -m 'Adiciona MinhaFeature'`).
4. Faça o push para a branch (`git push origin feature/MinhaFeature`).
5. Abra um Pull Request.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
