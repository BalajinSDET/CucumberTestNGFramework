@SmokeTest
Feature: Post a job scenario
Background:
  Given User is enter the Ihp website URL
  When The user should able to click on the Login as Job provider button in the HomePage
  Then User should navigated to the sign in page
  And The user enter their Email Id as "lgstester50@gmail.com " and Password as "Test123"
  When User clicks on the sign in button
  And User should navigated to the KYC Verification
  And User clicks the email verification radio button and then user clicks the submit button
  Then User navigates to the dashboard page of the Ihp project successfully

  Scenario Outline: Verify job provider is able to post a job

    And User clicks on post a job card in home page
    Then Verify job provider is redirected to post a job page
    And user enters the below details for post a job
    And user enter about the job in the about the job text field
    And user select value from the dropbox for working hour,job type,salary,minimum qualification,work schedule,experience
    And user choose value from the drop box for country,state and city
    And user clicks on submit button in post a job page
    Then verify job posted successfully pop up is visible

    Examples:
      | Job ID | Job Title      | Preferred skills      | Job Keywords  | Address                                   | Responsibilities                        |
      | LGS_QA | Manual Testing | Outbox thinking,excel | QA Analyst-L1 | Quinbay technologies,Peelamedu,coimbatore | Deliver bug free project,OutboxThinking |
