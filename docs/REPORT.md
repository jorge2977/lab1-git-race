# Lab 1 Git Race -- Project Report

## Description of Changes
Lenguage Standart: It´s been created a I18nConfig class to allow different lenguages in the web application. The user can change the language by adding a query parameter to the URL (?lang=es for Spanish or ?lang=en for English). The default language is set to English but it can also be set to Spanish or French in the user interface.

Light and Dark Mode: The application now supports both light and dark modes. The user can toggle between these modes using a button in the navigation bar. The selected mode is stored in the browser's local storage, ensuring that the preference persists across sessions.

Swagger UI: It´s been integrated the Swagger UI to show the API documentation. This allows users to explore and interact with the API endpoints directly from the web interface. The Swagger UI is accessible via: http://localhost:8080/swagger-ui.html

Time-Based Greeting: The greeting message on the welcome page now changes based on the time of day. 

Error Handling: Created error handling, it´s been implemented in the HelloController. If the 'name' parameter is missing on the /api/hello endpoint, the application will return a 400 Bad Request status with a descriptive error message.

Test Changes: The test cases have been updated to reflect the changes made in the HelloController. The tests now check for the correct handling of the 'name' parameter, including scenarios where it is missing or empty.

## Technical Decisions
[Explanation of technical choices made]

## Learning Outcomes
[What you learned from this assignment]

## AI Disclosure
### AI Tools Used
- GitHub Copilot

### AI-Assisted Work
- [Describe what was generated with AI assistance]
- [Percentage of AI-assisted vs. original work]
- [Any modifications made to AI-generated code]

### Original Work
- [Describe work done without AI assistance]
- [Your understanding and learning process]