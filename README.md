
# BDD Cucumber Java Selenium Project

## Overview

This project demonstrates a Behavior-Driven Development (BDD) approach using Cucumber in a Java environment. It integrates UI testing with Selenium, database interactions via MySQL, and API testing using the RestAssured library. The project follows the Page Object Model (POM) design pattern to enhance maintainability and readability.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [Author](#author)

## Features

- Automated UI testing with Selenium WebDriver
- Database validation using MySQL
- API testing with RestAssured
- BDD framework using Cucumber for clear test scenarios
- Page Object Model for better organization of UI tests

## Technologies Used

- **Java**: The primary programming language for the project.
- **Selenium**: For automating web browser interaction.
- **Cucumber**: For writing BDD-style test scenarios and test cases.
- **MySQL**: For database connectivity and validations.
- **RestAssured**: For API testing.
- **JUnit**: For running tests and reporting.

## Project Structure

/src

/main

/java

/com

/demo

/pages         # Page Object Model classes

/runners

/steps         # Step definitions for Cucumber

/utility       # Utility classes

/resources

/features      # Cucumber feature files

## Setup Instructions

1. **Clone the repository**:
´´´javascript
git clone https://github.com/hiltas73/DEMO_UI_DB_API
cd your-repo-name
´´´

2. **Install dependencies**:
   Make sure you have Maven installed, then run:
   
```
mvn install
```

3. **Configure MySQL Connection**:
   Update the MySQL connection settings in the `config.properties` file located in the `src/test/resources` directory.

4. **Set up WebDriver**:
   Download the appropriate WebDriver for your browser and ensure it is in your system's PATH.

## Running Tests

To run the tests, use the following command:

```javascript
mvn test
```

You can also run specific feature files by specifying their paths.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

Contributions are welcome! Please follow these steps:

Fork the repository.

Create a new branch: git checkout -b feature/YourFeature

Make your changes and commit them: git commit -m "Add some feature"

Push to the branch: git push origin feature/YourFeature

Open a pull request.

## Author

hiltas73 - [hiltas73](https://www.linkedin.com/in/halim-iltas/)

