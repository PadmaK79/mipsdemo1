Feature: Salesforce Login Feature

Scenario Outline: Salesforce Login Test Scenario

Given Launch the browser and navigate to SF login page web
When User enters valid Login page details "<username>" "<password>"
When user clicks on Login button
Then user clicks remind me later
 

Examples:
| username | password |
| Padma.Kavitha@meritagehomes.com.qa | Kavimerit#12 |
