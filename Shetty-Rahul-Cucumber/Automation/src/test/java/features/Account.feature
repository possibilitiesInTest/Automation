Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on NETBanking landing page
When User login into application with "jin" and "1234"
Then Homepage is populated
And Cards displayed are "true"
