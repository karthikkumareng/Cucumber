Feature: Anb System eTrack+ Stage Login functionality
  
  Scenario Outline: Login into Anb System eTrack+ Login functionality
   Given launch the Anb System eTrack+ login page
   When User verify the "<Username>" and "<Password>" functionality
    And clicking the Login Button
   Then verify the user login scenarios the page
   
 Examples:
  |Username|Password|
   |trump|Shock@12345|
   | |Shock@12345|
   |trump| |
   |Test|Shock@12345|
   |trump|Test@12345|
