Feature: Testing categories in store

	Scenario: Create a New User 
	Given User is on Home Page
	hen User Navigate to LogIn Page
	When user fills "Email address textbox" with "testuser1@gmail.com"  
	And user clicks "create an account button"  
	And user enters the following details 
	Example:
	| First Name | Test | 
	| Last Name | User | 
	| Email | testuser1@gmail.com |
	| Password | Inquiry@1234 | 
	| Date | 17| | Month | 02| | Year | 1992 | 
	| First Name | Test | 
	| Last Name | User | 
	| Address | #123,Nagar |
	| City | Bangalore |
	| State | Karnataka |
	| Zip/Postalcode | 560061 |
	| Country | India |
	| Mobile Phone | 9988776655 |
	And user clicks "register button"
	Then message displayed Registration Successful
	

	Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Example:
	| Email |  Password |
	| testuser1@gmail.com | Inquiry@1234 | 
	Then Message displayed Login Successfully
    
   	Scenario: Add 1 product from Women category to basket
    	Given user is on Women category page "http://automationpractice.com/index.php?id_category=3&controller=category"
    	When user click on button Add To Cart "Faded Short Sleeve T-shirts"
    	Then product should be successfully added to shopping cart
    	And there should be 1 product in basket
	
    	Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
  
