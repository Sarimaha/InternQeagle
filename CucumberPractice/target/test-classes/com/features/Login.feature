Feature: Login functionality of ServiceNow Application


Scenario Outline: Login for positive scenarios

Given Open the chromeBrowser
And Load application url 'https://dev113545.service-now.com/'
And Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'admin'|'m3GkKEKU8atr'|
