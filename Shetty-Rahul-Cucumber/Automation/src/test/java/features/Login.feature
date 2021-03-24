Feature: Application Login

@RegTest
Scenario: Home page default login
Given User is on NETBanking landing page
When User login into application with "jin" and "1234"
Then Homepage is populated
And Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on NETBanking landing page
When User login into application with "john" and "4321"
Then Homepage is populated
And Cards displayed are "false"

@SmokeTest
Scenario: Home page default login
Given User is on NETBanking landing page
When User login into application with the following details
| jenny | abcd | john@abcd.com | Australia | 3245324 |
Then Homepage is populated
And Cards displayed are "false"

@SanityTest
Scenario Outline: Home page default login
Given User is on NETBanking landing page
When User login in to application with <Username> and <password>
Then Homepage is populated
And Cards displayed are "false"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |