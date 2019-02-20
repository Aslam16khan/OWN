Feature: GPG CRM
#@ALL
Scenario: Create Client
Given user opens browser

Then user logs onto system 
Then Home page is displayed
And user clicks on the link "Clients"
And user clicks on the link "Create Client"
And user enters "testm@uegreatvf.dfsddsssssdsdsdasfasffasfas" in textbox "Email/CreateContract"  
And user clicks on the button "Proceed with Client Creation"
And user selects "Mr." from dropdown "Prefix"
And user enters "Awesome" in textbox "* First Name/CreateClient"  
And user enters "India" in textbox "* Last Name/CreateClient"
And user enters "Artist" in textbox "* Title/CreateClient"
And user selects "a a - (N/A)" from dropdown "* Sales Person"
And user selects "Client" from dropdown "* Client Status"
And user enters "Abc" in textbox "* Organization" and index "2"
And user selects "United States" from dropdown "* Country"
And user selects "United States : Anchorage (AKST)" from dropdown "* Time Zone"
And user selects "AK" from dropdown "State (Required for United States)"
And user clicks on the button "Create"
And user verifies the text "Ar" for label "Title"
And user closes the browser