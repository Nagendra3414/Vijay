Feature: Login scenario

Scenario: Login with valid username and password

Given open the browser and URL
When enter username and password
Then validate home page 
Then close the Browser


Scenario: Login with Invalid username and password

Given open the browser and URL
When enter invalid username and password
Then validate home page 
Then close the Browser