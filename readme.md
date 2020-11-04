# FateNotes 
FateNotes é um projeto desenvolvido em Java Spring Boot, com o objetivo de servir como uma agenda, onde o usuário pode guardar textos ou anotações.
- Para vizualizar a aplicação em funcionamento acesse: https://fatenotes.herokuapp.com/

# Técnologias Utilizadas
  - Maven
  - Java
  - Spring Boot
  - Apache Tomcat

### Técnologias Utilizadas

As técnologias utilizadas para o desenvolvimento da aplicação são:

* [HTML5] - Linguagem para estruturação e apresentação de conteúdo para a World Wide Web e é uma tecnologia chave da Internet;
* [CSS3] - Utilizado para definir estilos para um projeto web;
* [Frameword Bootstrap] - Framework web com código-fonte aberto para desenvolvimento de componentes de interface e front-end para sites e aplicações web;
* [Java] - Linguagem de Programação;
* [Spring Boot] - O Spring Boot fornece a maioria dos componentes baseados no Spring necessários em aplicações em geral de maneira pré-configurada, tornando possível termos uma aplicação rodando em produção rapidamente com o esforço mínimo de configuração e implantação;
* [Maven] - Ajuda a gerenciar compilações, documentos, relatórios, dependências, configurações de software, releases e distribuições;
* [Apache Tomcat] - O Tomcat é um servidor web Java, mais especificamente, um container de servlets;
* IntelliJ IDEA Ultimate - Ambiente de desenvolvimento integrado escrito em Java para o desenvolvimento de software de computador.

### Instação e Configuração

Clonar o repositório: https://github.com/guianderson/Projeto_blog.git

Ao importar o projeto Maven, sua IDE, vai instalar automáticamente todas as dependências do projeto.

Após clonar o repositório e Importar o projeto Maven, navegar até o arquivo: application.properties
Nele você encontrará o seguinte código:
```sh
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
#Banco local - Blog
spring.datasource.url= jdbc:postgresql://localhost:5435/codeblog
spring.datasource.username=postgres
spring.datasource.password=123
spring.jpa.hibernate.ddl-auto=update
```

### Como configurar?

```sh
spring.datasource.url = jdbc:postgresql://localhost:PORTA/NOME_DO_PROJETO_NO_BANCO
spring.datasource.username=USUARIO_ROOT_DO_BANCO
spring.datasource.password=SENHA_ROOT_DO_BANCO
```
O restante das configurações devem ficar da forma que estão.

# Páginas do Sistema

### Tela - Inicial
![pag_inicial](https://user-images.githubusercontent.com/47038612/98030335-a0607f80-1def-11eb-8c5f-42ab30708c0f.png)
Página inicial do Sistema, assim que o usuário executar o projeto, acessará está página, onde será exibido para o mesmo uma breve explicação do que é o projeto,
e um botão para que ele acesse a plataforma de anotações.

### Tela - Sobre
![sobre](https://user-images.githubusercontent.com/47038612/98030817-5926be80-1df0-11eb-9f46-ca2fd3fca927.png)
Descendo um Pouco, será exibida a tela "Sobre o Projeto", a qual fornecerá uma explicação mais detalhada sobre o projeto.

### Tela - Desenvolvedor
![desenvolvedor](https://user-images.githubusercontent.com/47038612/98030329-9f2f5280-1def-11eb-856f-eaa4c28273ae.png)
Tela que mostrar um pouco sobre mim (Guilherme Anderson)

### Página Inicial do Sistema - Página dos Posts
![descricao_post](https://user-images.githubusercontent.com/47038612/98032683-1d412880-1df3-11eb-82ab-99c4125d3a0e.png)
Nesta página, são exibidos uma parde de cada post cadastrado no sistema.
- Clicando em "Deletar Post", o usuário será direcionado para uma página de login, onde deverá inserir usuário e senha de administrador do sistema, pois somente o admin tem acesso para deletar algum post, após isso o post será deletado e o usuário redirecionado para à página que contém todos os posts.

### Página que contém a descrição completa do Post
![descricao_post](https://user-images.githubusercontent.com/47038612/98032761-406bd800-1df3-11eb-9a68-57c71ba008ac.png)
Ao clicar sobre o titulo do post, o usuário é redirecionado para está página, onde é exibido o conteudo completo do post cadastrado.
- Clicando em "Deletar Post", o usuário será direcionado para uma página de login, onde deverá inserir usuário e senha de administrador do sistema, pois somente o admin tem acesso para deletar algum post, após isso o post será deletado e o usuário redirecionado para à página que contém todos os posts.

### Página - "Login"
![login](https://user-images.githubusercontent.com/47038612/98033405-3696a480-1df4-11eb-83ad-e8f4dd336cb5.png)
Ao clicar em "Deletar Post" ou "Novo Post" o usuário será direcionado para está página de Login do sistema, que foi determinado utilizando o securityConfig.
- Apenas o administrador do sistema possui permissão para criar ou deletar qualquer post.

### Página - "Novo Post"
![novo_post](https://user-images.githubusercontent.com/47038612/98033669-9e4cef80-1df4-11eb-9de3-4f411138dd84.png)
Após fazer login na plataforma, o usuário terá acesso à está página, onde poderá escrever seu post da forma que quiser, todos os campos são obrigatórios, depois de preencher todos os campos, clicando em publicar o post será inserido no banco de dados e será exibido na página inicial dos posts.

