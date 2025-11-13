Feature: Login DemoQA website
#Background: 
#Given User is on the DemoQA page
@skip
Scenario: Verifying the DemoQA page
When User click on the Elements Section
Then User should be redirected to elements page

@skip
Scenario: Verifying the DemoQA text page
Given User is on the DemoQA text page
When User enters the Full Name,Email,Current Address,Permanent Address
And User Clicks on Submit button
Then User should able to see the entered details.
@skip
Scenario: Verifying the DemoQA checkbox page
Given User is on the DemoQA checkbox page
When User checks on Home checkbox
Then User should be able to see the correct message

@skip
Scenario: Verifying the DemoQA Radiobutton page
Given User is on the DemoQA Radiobutton page
When User selects on yes button
Then verify that selected value is displaying in the page
@skip
Scenario: Verifying the DemoQA Webtable page new functionality
Given User is on the DemoQA Webtable page
When  User is clicks on Add button
And User enters all the details and clicks on submit button
Then verify that the new row added in the webtable
@skip
Scenario: Verifying the DemoQA Webtable page edit functionality
Given User is on the DemoQA Webtable page
When  User clicks on edit button
And User change the firsname and age
Then verify that the updated details are displaying in the webtable
@skip
Scenario: Verifying the DemoQA Webtable page delete functionality
Given User is on the DemoQA Webtable page
When  User clicks on delete button
Then verify that the removed details are not displaying in the webtable

@skip
Scenario: Verifying the DemoQA Webtable page rows functionality
Given User is on the DemoQA Webtable page
When  User selects 10 rows in the dropdownlist.
Then User see the 10 records in the page.
@skip
Scenario: Verifying the DemoQA Webtable page Next functionality
Given User is on the DemoQA Webtable page
When User clicks on Next page 
Then User should able to see the next page
@skip
Scenario: Verifying the DemoQA Webtable page Previous functionality
Given User is on the DemoQA Webtable page
When User clicks on Previous page
Then User should able to see the Previous page
@skip
Scenario: Verifying the DemoQA Webtable Pagination functionality
Given User is on the DemoQA Webtable page
When User inputs page no
Then User should able to see the correct page
@skip
Scenario: Verifying the DemoQA Webtable Search functionality
Given User is on the DemoQA Webtable page
When User types in search box
Then User should able to see the correct row
@skip
Scenario: Verifying the DemoQA Webtable Search functionality
Given User is on the DemoQA Webtable page
When User types in search box
Then User should able to see the correct row
@skip
Scenario: Verifying the DemoQA button page
Given User is on the DemoQA button page
When User clicks on double click button
And User able to see the valid double click message
When User clicks on Right click button
And User able to see the valid Right click message
When User clicks on Click Me button
And User able to see the valid Click Me message

Scenario: Verifying the DemoQA links page
Given User is on the DemoQA links page
When User click on the Home and HomeoEJgv
Then User able to see both the links in new tab
When User click on Created 
Then User able to see the status code and status text

@skip
Scenario: Verifying the DemoQA brokenlinks page
Given User is on the DemoQA brokenlinks page
When User click on Valid link 
Then User able to see the webpage
@skip
Scenario: Verifying the DemoQA brokenlinks page
Given User is on the DemoQA brokenlinks page
When User click on Invalid link 
Then User able to see the error message





