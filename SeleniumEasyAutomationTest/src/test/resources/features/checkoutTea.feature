Feature: As a user I should be able to navigate to practiceselenium.com and order tea.

Scenario: Verify the tea order from the website practiceselenium.com
			Given the user navigate to We are passionate about tea
			When the user click on the Menue
			Then the user click on Check out for grean tea
			And the user fill out customer information
			Then the customer inputs payment information
			

	