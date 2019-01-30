#Author: joel.jose@flytxt.com
#Summary : Test Cases of User Profile


@NX-UserProfile
Feature: User Profile test cases with Top bar display of user
  I want to use this template for my feature file

@NX-6038
@initBrowser @closeBrowser
Scenario: Verify whether drop down list is displayed on clicking the user name
Given login
Then click username on topbar
Then verify dropdown

@NX-6039
@initBrowser
Scenario: Verify  pop-up is displayed on clicking change password option
Given neon is loaded
Then login with selenium user
Then navigate to precision marketer
Then click username on topbar
Then click change password
Then click cancel in change password

@NX-6040
@initBrowser @closeBrowser
Scenario: Verify the functionality of Change password option
Then login with selenium user
Then navigate to precision marketer
Then click username on topbar
Then click change password
Then change password "flytxt1" from "fly.12"
Then logout
Then login with "selenium.flytxt@gmail.com" and "flytxt1"
Then click username on topbar
Then click change password
Then change password "fly.12" from "flytxt1"

Then logout
Then login with "selenium.flytxt@gmail.com" and "fly.12"

@NX-6041
@initBrowser @closeBrowser
Scenario: Verify  error message shown if  new password and confirm password doesnâ€™t match
Given neon is loaded
Then login with "selenium.flytxt@gmail.com" and "fly.12"
Then click username on topbar
Then click change password
Then change password "Newflytxt1" from "wrongPassword"
Then verify wrong password toast