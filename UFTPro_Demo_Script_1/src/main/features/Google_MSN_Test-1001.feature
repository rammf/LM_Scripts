#Auto generated Octane revision tag
@TID1001REV0.6.0
Feature:
Scenario: Verify MSN is searchable from Google
		Given I am in the Google web site
		And I search for MSN 
		When I view MSN page 
		Then the MSN logo is displayed
