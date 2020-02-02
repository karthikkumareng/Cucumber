Feature: Anb System eTrack+ Stage
  
  Scenario: Login into Anb System eTrack+ 
   Given open the Anb System eTrack+ login page
   When User enter the username and password
   |Username|Password|
   |trump|Shock@12345|
   And clicking the Signin Button
   Then verify the user login successfully the page

 
 Scenario: Add Reference Configuration
 Given open the Reference Configuration page
   When User enter the requied details
      And clicking the Save Button
   Then verify the user Create Reference successfully 
 