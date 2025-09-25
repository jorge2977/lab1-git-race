# Lab 1 Git Race -- Project Report

## Description of Changes
Lenguage Standart: It´s been created a I18nConfig class to allow different lenguages in the web application. The user can change the language by adding a query parameter to the URL (?lang=es for Spanish or ?lang=en for English). The default language is set to English but it can also be set to Spanish or French in the user interface.

Light and Dark Mode: The application now supports both light and dark modes. The user can toggle between these modes using a button in the navigation bar. The selected mode is stored in the browser's local storage, ensuring that the preference persists across sessions.

Swagger UI: It´s been integrated the Swagger UI to show the API documentation. This allows users to explore and interact with the API endpoints directly from the web interface. The Swagger UI is accessible via: http://localhost:8080/swagger-ui.html

Time-Based Greeting: The greeting message on the welcome page now changes based on the time of day. 

Error Handling: Created error handling, it´s been implemented in the HelloController. If the 'name' parameter is missing on the /api/hello endpoint, the application will return a 400 Bad Request status with a descriptive error message.

Bye Endpoint: Added a new endpoint /api/bye that responds with a farewell message. Similar to the /api/hello endpoint, it accepts an optional 'name' parameter and returns a JSON response.

Test Changes: The test cases have been updated to reflect the changes made in the HelloController. The tests now check for the correct handling of the 'name' parameter, including scenarios where it is missing or empty. It´s also been added tests for the new /api/bye endpoint to ensure it behaves as expected.

## Technical Decisions
It´s beean created a GlobalExceptionHandler class to handle exceptions globally across the application. In this case it´s been used to handle IllegalArgumentException and return a 400 Bad Request status with a descriptive error message when the 'name' parameter is missing or empty. In general there´s no been big technical decisions, the main goal it´s been to learn about the standart and modifiy little details of the project.

## Learning Outcomes
From this assignment, I learned how to work with Spring Boot to create a web application. Also I got a first contact with Kotlin, a programming language that I had never used before. I learned how to create controllers, services, and repositories in Spring Boot, as well as how to handle requests and responses. Additionally, I learnt about the lenguage standart and how to implement it in a web application. The tests were also an interesting part, to understand how to write unit tests and integration tests for the application. 

## AI Disclosure
### AI Tools Used
- GitHub Copilot

### AI-Assisted Work
- The GlobalExceptionHandler class.
- 20% vs 80%.
- 

### Original Work
- All the modifications in the HelloController and HelloControllerMVCTests classes.
  The I18nConfig class, the light and dark mode implementation, the Swagger UI integration, and the time-based greeting.
- I hadn´t deal with Spring Boot before, so I had to understand each file and how they interact with each other.