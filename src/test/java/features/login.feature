Feature: Login


Scenario: Validate login functionality with valid data
Given Launch the Url
Then Enter Username
Then Enter password
And Click on login
When homepage should open
Then close
Then again open browser