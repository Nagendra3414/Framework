Feature: Login


@Sanity
Scenario: login functionality testing
Given Open the browser
When user enters username and password
|username123|abcdefgh|
Then Click on login
Then close


