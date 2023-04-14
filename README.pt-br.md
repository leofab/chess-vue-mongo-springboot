# Aplicação de Xadrez 🏁

Esta é uma aplicação de xadrez de código aberto baseada na web, construída com Vue.js para o frontend, MongoDB para o banco de dados, Java para a lógica de xadrez e SpringBoot para as requisições e roteamento do backend.

## Tecnologias Utilizadas 🛠️

### Frontend:

- Vite: Ferramenta de construção rápida e servidor de desenvolvimento que é usada neste projeto, juntamente com Vue.js para a construção do frontend. [!Documentação Vite](https://vitejs.dev/)🚀
- Vue.js: Um framework JavaScript progressivo para construir interfaces de usuário. [!Documentação Vue.js](https://vuejs.org/) 😎
- Vuex: Uma biblioteca de gerenciamento de estado para Vue.js que é usada para gerenciar o estado da aplicação. [!Documentação Vuex](https://vuex.vuejs.org/) 📊
- VueRouter: Uma biblioteca de roteamento para Vue.js que é usada para navegar entre diferentes visualizações na aplicação. [!Documentação VueRouter](https://router.vuejs.org/) 🚦

### Backend:

- SpringBoot: Um framework baseado em Java que é usado para construir o backend da aplicação. Ele fornece uma maneira simples e eficiente de construir APIs e lidar com requisições HTTP. [!Documentação SpringBoot](https://spring.io/projects/spring-boot) 🚀
- MongoDB: Um banco de dados NoSQL que é usado para armazenar dados relacionados à aplicação de xadrez. [!Documentação MongoDB](https://docs.mongodb.com/) 📊

### Lógica de Xadrez em Java:

- DeepBlue UML: Uma inspiração para a lógica de negócio do xadrez implementada neste projeto. [!Referência DeepBlue UML](https://example.com/deepblue-uml) 📈

## Fluxo de Trabalho 🚀

### Desenvolvimento do Frontend:

- O frontend da aplicação é desenvolvido usando Vue.js, Vuex e VueRouter.
- Três visualizações principais são implementadas: Home View, Tela de Login e Tela de Jogo.
- A Home View inclui seis rotas: "Jogar", "Aprender", "Ranking", "Notícias", "Login" e "Registrar".
- A Tela de Login inclui o botão do Google Identity OAuth2 para login e registro tokenizado.
- A Tela de Jogo inclui as visualizações de tabuleiro e peças em SVG, com funcionalidade de agarrar e mover reativa (ainda a ser implementada). 🖼️

### Lógica de Xadrez em Java ☕

- A lógica de negócio do xadrez é implementada em Java, inspirada na UML do DeepBlue 📈

- Todos os modelos necessários, como Peça, Jogador, Tabuleiro e Casa, são implementados, com alguns métodos ainda a serem implementados.

- A exibição no console, a lógica de movimento e a validação são implementadas (a validação ainda está em andamento). 💻

### Desenvolvimento do Backend:

- O backend da aplicação é implementado usando SpringBoot e MongoDB.

- APIs e rotas são implementadas para lidar com as requisições HTTP do frontend e interagir com o banco de dados.

## Contribuição 🤝

👏 Recebemos contribuições para este projeto! Se você deseja contribuir, siga estas etapas:

- Faça um fork do repositório e clone-o em sua máquina local.
- Crie um novo branch para suas mudanças.
- Faça suas mudanças e teste-as completamente.
- Faça commit de suas mudanças com mensagens de commit descritivas.
- Faça push de suas mudanças para o repositório forkado.
- Crie um pull request para o repositório principal, explicando suas mudanças e como elas melhoram o projeto.
- Vamos trabalhar juntos para tornar esta aplicação de xadrez ainda melhor! 🚀
