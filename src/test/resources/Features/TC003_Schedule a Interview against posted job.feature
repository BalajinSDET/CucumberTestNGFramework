
@SmokeTest
Feature: Schedule interview scenario posted job flow
Background:
  Given User is enter the Ihp website URL
  When The user should able to click on the Login as Job provider button in the HomePage
  Then User should navigated to the sign in page
  And The user enter their Email Id as "lgstester50@gmail.com " and Password as "Test123"
  When User clicks on the sign in button
  And User should navigated to the KYC Verification
  And User clicks the email verification radio button and then user clicks the submit button
  Then User navigates to the dashboard page of the Ihp project successfully

  Scenario:Verify job provider is able to schedule an interview for job seeker through zoom interview option

    And User clicks on posted job tile in job provider dashboard
    And User verify and clicks the manage jobs
    And User clicks the view application
    And Job provider clicks on schedule interview button in profile overview page
    And Job provider schedule an interview for job seeker through "zoom" option
