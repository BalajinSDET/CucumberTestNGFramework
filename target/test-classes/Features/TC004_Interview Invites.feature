@SmokeTest
Feature: This is the Job Seeker interview invites verification scenario
  I want to sign in as Job Seeker of Ihp application and verified the interview invites

  Scenario Outline: Verify that Job Seeker Interview Invites functionality of the application
    Given User is enter the Ihp website URL
    When The user should able to click on the Login as Job Seeker button in the HomePage
    Then User should navigated to the sign in page
    And The user enter their Email Id as "<email>" and Password as "<password>"
    When User clicks on the sign in button
    And User should navigated to the KYC Verification
    And User clicks the email verification radio button and then user clicks the submit button
    Then User navigates to the dashboard page of the Ihp project successfully
    And User clicks the Interview invites on dashboard page
    Then User should navigated to the Interview invites page
    And User verified the invited on date and clicks the view invites
    Then User should navigated to the schedule interview page and verify the interview location
    And User verified the date of interview and clicks the view invites then verified the user landed on job overview page


    Examples:
      | email                 | password |
      | lgstester50@gmail.com | Test123  |