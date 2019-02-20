Feature: GPG CRM
@ALL
Scenario: Create Contract
Given user opens browser

Then user logs onto system 
Then Home page is displayed
And user clicks on the link "Client"
And user clicks on the link "Create Contract"
And user selects "8_8_18 Reg Org" from dropdown "* Client Organization"
And user enters "12/05/2018" in textbox "* Start Date/CreateContract"  
And user enters "30/11/2019" in textbox "* Real End Date/CreateContract"
And user enters "" in textbox "* Original End Date/CreateContract"
And user waits for "5000" milliseconds
And user selects "MSA" from dropdown "* Contract Type"
And user selects "Data" from dropdown "* Revenue Item"
And user enters "1" in textbox "* Contract Value/CreateContract"
#And user enters "1000" in textbox "* Annual Contract Value/CreateContract"
And user enters "4" in textbox "* Max Units/CreateContract"
And user enters "1" in textbox "* Incentive Units/CreateContract"
And user enters "1" in textbox "* Unit Overage Charge/CreateContract"
And user enters "2" in textbox "* Value Per Rollover Unit/CreateContract"
And user enters "2" in textbox "* Units Rolled Over from Previous Contract/CreateContract"
And user checks the checkbox "Active"
And user waits for "5000" milliseconds
And user clicks on the button "Create"
And user waits for "5000" milliseconds
And user closes the browser