# Chess Application 🏁

This is a web-based open chess application built with Vue.js for the frontend, MongoDB for the database, Java for the chess logic, and SpringBoot for the backend requisitions and routing.

## Technologies Used 🛠️

### Frontend:

Vite: Fast build tool and development server that is used in this project along with Vue.js for building the frontend. [https://vuejs.org/](Vite Documentation)🚀
Vue.js: A progressive JavaScript framework for building user interfaces. [https://vuejs.org/](Vue.js Documentation)😎
Vuex: A state management library for Vue.js that is used for managing the application's state. [https://vuex.vuejs.org/](Vuex Documentation)📊
VueRouter: A routing library for Vue.js that is used for navigating between different views in the application. [https://router.vuejs.org/](VueRouter Documentation)🚦

### Backend:

SpringBoot: A Java-based framework that is used for building the backend of the application. It provides a simple and efficient way to build APIs and handle HTTP requests. [https://spring.io/projects/spring-boot](SpringBoot Documentation) 🚀
MongoDB: A NoSQL database that is used for storing data related to the chess application. [https://docs.mongodb.com/](MongoDB Documentation) 📊

### Java Chess Logic:

DeepBlue UML: An inspiration for the chess business logic that is implemented in this project. [https://example.com/deepblue-uml](DeepBlue UML Reference) 📈

## Workflow 🚀

###Frontend Development:

The frontend of the application is developed using Vue.js, Vuex, and VueRouter.
Three main views are implemented: Home View, Login Screen, and Play Screen.
The Home View includes six routes: "Play", "Learn", "Rank", "News", "Login In", and "Sign Up".
The Login Screen includes Google Identity OAuth2 Google Button for tokenized login and registration.
The Play Screen includes Board Square and Pieces views in SVG, with reactive grabbing and movement (yet to be implemented). 🖼️

### Java Chess Logic:

The chess business logic is implemented in Java, taking inspiration from DeepBlue UML. DeepBlue UML Reference 📈
All the necessary models, such as Piece, Player, Board, and Square, are implemented with some methods yet to be implemented.
Console display and movement logic and validation are implemented (validation still in progress). 💻

### Backend Development:

The backend of the application is implemented using SpringBoot and MongoDB.
APIs and routes are implemented for handling HTTP requests from the frontend and interacting with the database.

## Contribution 🤝
👏 We welcome contributions to this project! If you would like to contribute, please follow these steps:

Fork the repository and clone it to your local machine.
Create a new branch for your changes.
Make your changes and test them thoroughly.
Commit your changes with descriptive commit messages.
Push your changes to your forked repository.
Create a pull request to the main repository, explaining your changes and how they improve the project.
Let's work together to make this chess application even better! 🚀