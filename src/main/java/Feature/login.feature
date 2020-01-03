Feature: Free CRM Login Feature 
Scenario Outline: Free CRM Login Test

	Given User is already on login page 
	When User click on login button 
	And user is on login page 
	Then user enters "<username>" and "<password>" 
	And user is on home page 
	Then Close the browser 
	
	Examples:
		| username | password |
		| jayant.genpact@gmail.com | Shivam@1993 |
		| jayant.gupta93@ymail.com | Shivam@1993 |
 
 
 Feature: Free CRM SignUp Feature
 Scenario Outline : Free CRM SignUp test
 
 Given User is already on login page
 When user enters "<username>" and "<password>"
 Then user is on login page
 
 Examples:
 |Username|