Feature: Application Login


Scenario: Home page default login
Given User is on NETBanking landing page
When User login into applicaiton with username and password
Then Homepage is populated
And Cards are displayed

