@Important
Feature: Create an account of Advantageonlineshopping
As an user you need to open Advantageonlineshopping home page and do the validations

@Smoke @Regression
Scenario: Validate User name field

Given user need to be on Advantageonlineshopping page
When user enters user "John" user name
Then user checks user "John" user name is present
Then close browser