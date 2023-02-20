Feature: login 

Background:
Given Open the browser
Then print something



@Regression
Scenario Outline: Log in with multiple set of data
When user enters <Username> and <Password>
Then Click on login
Then close

Examples:
|Username|Password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|


@Sanity
Scenario: Validate login functionality with valid data
Then Enter Username
Then Enter password
And Click on login
When homepage should open
Then close

@Smoke
Scenario: Validate login functionality with valid data
Then Enter Username
Then Enter password
And Click on login
When homepage should open
Then close
