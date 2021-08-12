Feature: Update the Incident

Scenario Outline: Updating the incident with Urgency and State


Given Load update_application url
And Enter the update_username <username>
And Enter the update_password <password>
And Click on update_login button
And Enter update_Incident in filter navigator and press enter
And Search for the existing incident <incidentNumber> and click on the incident
And Update the incidents with Urgency <urgencyValue> as High
And Update the incident with State <state> as In Progress
When Click on Update button
Then Verify the priority and state 

Examples:
|username|password|incidentNumber|urgencyValue|state|
|'admin'|'m3GkKEKU8atr'|'INC0011137'|'1 - High'|'In Progress'|

 
