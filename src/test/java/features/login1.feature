Feature: Login scenario


@Regression
Scenario: Login with valid username and password

Given open the browser and URL
When enter username and password
Then validate home page 
Then close the Browser


@Sanity
Scenario: Login with Invalid username and password

Given open the browser and URL
When enter invalid username and password
Then validate home page 
Then close the Browser