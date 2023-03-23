Feature: Login 

Background:
Given print something

@Regression @Sanity
Scenario: Login with valid username and password
Given open the browser and URL
Then close the Browser

@Smoke
Scenario Outline:
Given open the browser and URL
When enter <username> and <password>
Then validate home page 
Then close the Browser

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|