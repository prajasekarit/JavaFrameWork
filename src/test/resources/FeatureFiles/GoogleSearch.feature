Feature: GUMTREE GOOGLE Search	

Background:
Given Validate the Application

@functional
Scenario Outline: Validate the GUMTREE links in Google Search 

Given Initialize the <browser> browser
And Navigate to <url> Site
When Google.com is launched send the literal <searchterm> in Google text box and Enter the search button
Then Verify the links with the Literal <search_GUM_TREE> and confirm the number of links displayed is more than one
And verify that the title is getting is displayed
Then Close Browsers

Examples:
|browser	|url	|searchterm	|search_GUM_TREE	|
|chrome	|https://google.com	|Cars in London	|GUM TREE	|
|chrome-headless	|https://google.com	|Cars in London	|GUM TREE	|
