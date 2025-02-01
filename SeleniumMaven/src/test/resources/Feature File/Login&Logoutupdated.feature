Feature : Login& Logout feature
Scenario Outline : verify the login with multiple set of data
Given Go to login page
When enter valid <usrname> and <password>
And enter the login button
Then homepage should display

Examples :

