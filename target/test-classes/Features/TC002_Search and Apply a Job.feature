@SmokeTest
Feature: This is the Search and apply job scenario
  I want apply a job posted by the job provider of Ihp application

  Background:
    Given User is enter the Ihp website URL
    When The user should able to click on the Login as Job Seeker button in the HomePage
    Then User should navigated to the sign in page
    And The user enter their Email Id as "lgstester50@gmail.com" and Password as "Test123"
    When User clicks on the sign in button
    And User should navigated to the KYC Verification
    And User clicks the email verification radio button and then user clicks the submit button
    Then User navigates to the dashboard page of the Ihp project successfully

  Scenario Outline: Verify that search and apply job scenario functionality of the application

    And User is clicks the search job tile from job seeker dashboard page
    Then User should navigated to the search job page
    And User search the job in the search job as "<job searched>"
    And User clicks the search icon
    And User clicks the apply button
    Then User should navigated to the Job Overview page
    And User clicks the apply button on the job overview page
    Then User should navigated to the search job page successfully

    Examples:
      | job searched   |
      | Manual Testing |
