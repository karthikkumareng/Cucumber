
Feature: Anb System eTrack+ Stage Login functionality
   @tag1
  Scenario: Login into Anb System eTrack+ Login functionality(valid username,valid password)
   Given User on Anb System eTrack+ login page
    When User enter the valid username and password
   |Username|Password|
   |trump|Shock@12345|
    And click the sign Button
   Then verify the user login successfully
   
  @tag2
 Scenario: Login into Anb System eTrack+ Login functionality(null username,valid password)
   Given User on Anb System eTrack+ login page
    When User enter the null username and valid password
   |Username|Password|
   ||Shock@12345|
    And click the sign Button
   Then verify the user login credential is wrong
   
  @tag3
  Scenario: Login into Anb System eTrack+ Login functionality(valid username,null password)
   Given User on Anb System eTrack+ login page
    When User enter the valid username and null password
   |Username|Password|
   |trump||
    And click the sign Button
   Then verify the user login credential is wrong
   
    
   @tag4
   Scenario: Login into Anb System eTrack+ Login functionality(invalid username,valid password)
   Given User on Anb System eTrack+ login page
    When User enter the invalid username and valid password
   |Username|Password|
   |john|Shock@12345|
    And click the sign Button
   Then verify the user login credential is Invalid
   
   @tag5
   Scenario: Login into Anb System eTrack+ Login functionality(valid username,invalid password)
   Given User on Anb System eTrack+ login page
    When User enter the valid username and invalid password
   |Username|Password|
   |trump|123|
    And click the sign Button
   Then verify the user login credential is valid username and invalid password

   
    @tag6
   Scenario: Login into Anb System eTrack+ Login functionality(invalid username,invalid password)
   Given User on Anb System eTrack+ login page
    When User enter the invalid username and invalid password
   |Username|Password|
   |john|123|
    And click the sign Button
   Then verify the user login credential is Invalid
   
   
   
     @tag7
   Scenario: Login into Anb System eTrack+ Login functionality(null username,null password)
   Given User on Anb System eTrack+ login page
    When User enter the invalid username and invalid password
   |Username|Password|
   |||
   And click the sign Button
   Then verify the user login credential is wrong