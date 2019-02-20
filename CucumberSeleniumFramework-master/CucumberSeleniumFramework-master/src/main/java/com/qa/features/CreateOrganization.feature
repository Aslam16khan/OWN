Feature: GPG CRM

Scenario: Create Organization
Given user opens browser
Then user is on login page
Then user logs onto system
Then Home page is displayed
And user clicks on Clients Tab
And user clicks on CreateOrganization link
And user clicks on the button "Yes"
And user clicks on the button "Yes"
And user enters "Great Admirer Busin" in textbox "Organization Name"
And user selects "Client" from dropdown "Organization Status"
And user selects "Mutual Fund" from dropdown "Organization Type"
And user checks "1" checkbox for Client Organization Sector
And user selects "MSA" from dropdown "Contract Type"
And user selects "GuidePoint Global" from dropdown "Guidepoint Subsidiary"
And user clicks on the Save button on Create Organization page
And user verifies the text "* Organization Name:"