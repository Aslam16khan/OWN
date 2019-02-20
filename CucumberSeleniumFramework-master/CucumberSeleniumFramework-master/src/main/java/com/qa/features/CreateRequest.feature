Feature: GPG CRM 
#@ALL
Scenario: Create Request

Given user opens browser
#Then user is on login page
Then user logs onto system
Then Home page is displayed
And user clicks on Request Tab
And user clicks on CreateRequest link
And user enters "ABC" in textbox "* Client/Internal Title"
And user enters "ABCDSSDFFFF" in textbox "Client Request Details"
And user enters "Abc" in textbox "Primary Client" and index "2"
And user selects "Survey Request" from dropdown "* Request Type"
And user selects "Business Services" from dropdown "* Sector"
And user selects "Business Support Services" from dropdown " Industry"
And user checks the checkbox "Scheduling Workflow"
And user clicks on the button "Save"
And user waits for "5000" milliseconds
And user clicks on the link "Request List"
And user closes the browser