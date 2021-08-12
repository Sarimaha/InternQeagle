Feature: Create New Incident

Scenario Outline: Creating new incident


Given Load application url
And Enter the username <username>
And Enter the password <password>
And Click on create_login button
And Enter Incident in filter navigator and press enter
And Click on Create new option and fill the manadatory fields
When Click Submit button
Then Verify the newly created incident

Examples:
|username|password|
|'admin'|'m3GkKEKU8atr'|