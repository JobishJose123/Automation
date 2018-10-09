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
Then login with "selenium.flytxt@gmail.com" and "Flytxt.4"
Then navigate to precision marketer
Then click username on topbar
Then click change password
Then click cancel in change password

@NX-6040
@closeBrowser
Scenario: Verify the functionality of Change password option
Then click username on topbar
Then click change password
Then change password "flytxt1" from "Flytxt.4"
Then logout
Then login with "selenium.flytxt@gmail.com" and "flytxt1"
Then click username on topbar
Then click change password
Then change password "Flytxt.4" from "flytxt1"
Then click username on topbar
Then logout
Then login with "selenium.flytxt@gmail.com" and "Flytxt.4"

@NX-6041
@initBrowser @closeBrowser
Scenario: Verify  error message shown if  new password and confirm password doesnâ€™t match
Given neon is loaded
Then login with "selenium.flytxt@gmail.com" and "Flytxt.4"
Then click username on topbar
Then click change password
Then change password "Newflytxt1" from "wrongPassword"
Then verify wrong password toast