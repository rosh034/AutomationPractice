# AutomationPractice
automationpractice.com is an end-end e-commerce website. It covers the complete online shopping workflow.
Tools:

• Selenium Web Driver

• Java

• TestNG

Tested functionalities:

• Create new account form

• Login form

• Complete shopping workflow


# Additional libraries
Besides `Selenium` and `TestNG`, this project also uses additional libraries, such as:
* `WebDriverManager`: to access browser's driver
* `AllureReports`: to generate the test evidence in an elegant and user friendly way as an HTML file

# Requirements
* Java 8 installed

# Running the tests
Tests can be run using the following commands:
```bash
set classpath=<path where you saved the project>\automation-practice\target\test-classes;<path where you saved the project>\automation-practice\target\dependency\*
```
```bash
java org.testng.TestNG <path where you saved the project>\automation-practice\testng.xml 
```
This command will run the tests and generate the HTML file with the test evidences using `ExtentReports`.

# Test results
After the execution, you will be able to find the HTML file of the generated report inside the `reports` folder.
