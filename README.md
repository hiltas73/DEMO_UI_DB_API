DEMO PROJECT
In this framework, I implemented BDD-Cucumber and used Page Object Model to store my WebElements. Used Maven as a build tool to store & manage dependencies. Used Gherkin Language in my feature files.

Created specific utilities such as Driver, ConfigurationReader. Used OOP-Encapsulation to reach driver using getDriver() method. In that method, driver name is declared from configuration.properties file with the help of getProperty() method which comes from ConfigurationReader utility class.

Created BasePage class where I store my pagefactory method and initialized my locators using initElements() method. Again, used OOP-Inheritance among Page classes (extended from BasePage).

RUNNER CLASSES
Used Runner class as my main test runner where I am able to run my scenarios by using @wip tag. Used CucumberReports plugin to see my test results public and online. Provided the path of my feature directory so that my runner can find my feature files. Provided the path for my step definitions where I store my Java code in. My runner class automatically combine my feature files with my Java code (step definitions)

Also added FailedTestRunner class by which I can run only failed tests.

Will work on and improve this in time...
