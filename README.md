# Mobile Health Record Index Library (mhri)
## Intro

The current release of the library (i.e. `mhri`), contains all the operations that are needed from the side of the S-EHR application developer to initially interact with the library and finally with the Health Record Index. This library contains different operations that have to be invoked for implementing the necessary interactions with the HRI, regarding the S-EHR application. This library is a Java-based component that can be nested in any Android application. It offers a set of Java operations for sending requests to the HRI regarding the citizen’s information. It is a Java-based library and can be nested in android applications with version 4.3 or higher.  This library is offered in the context of  **InteropEHRate** project.

## Endpoints

The methods called by the `mhri` library are `createCitizen`, `removeData` and `updateCitizen`. 

### createCitizen
By using this method, a request is submitted to the HRI service. This method is used by the citizen’s S-EHR app in order to make a new entry to the HR Index which will include information related to the citizen’s S-EHR Cloud service. The request is performed to the following endpoint of the deployed HR Index service: 
- Endpoint: http://[URL]:8080/citizen/createCitizen
- Parameteres as headers: ***citizenUsername***, ***cloudUri***

The response includes the following:
- msg: A message containing the status of the request
- cloudUri: The cloud uri the citizen stores his/ her EHR
- citizenId: The unique ID of the citizen
- citizenUsername: The username used by the citizen
- hriAccessToken: An authentication token used to validate the citizen
- hriEmergencyToken: An authentication token used to validate the citizen
- status: The request status


```json
{
    "msg": "Citizen created",
    "data": [
        {
            "cloudUri": "$cloudUri",
            "citizenId": "$citizenId",
            "citizenUsername": "$citizenUsername"
        }
    ],
    "hriAccessToken": "hriAccessToken",
    "hriEmergencyToken": "hriEmergencyToken",
    "status": 200
}
```

### deleteCitizen
By using this method, a request is submitted to the HRI service. This method is used by the citizen’s S-EHR app in order to remove the citizen’s information from the HR Index. In the existing entry, the citizen username and cloud uri values are cleared and the fields remain empty. The request is performed to the following endpoint of the deployed HR Index service: 

- Endpoint: http://[URL]:8080/citizen/removeData
- Parameteres as headers: ***citizenId, hriAccessToken***

The response includes the following:
- msg: A message containing the status of the request
- cloudUri: The cloud uri the citizen stores his/ her EHR
- citizenId: The unique ID of the citizen
- citizenUsername: The username used by the citizen
- hriAuthToken: The JWT token used for the validation
- status: The request status

```json
{
    "msg": "Citizen deleted",
    "data": [
        {
            "cloudUri": "",
            "citizenId": "$citizenId",
            "citizenUsername": ""
        }
    ],
    "hriAuthToken": "$hriAccessToken",
    "status": 200
}
```

### updateCitizen
By using this method, a request is submitted to the above described service. This method is used by the citizen’s S-EHR app in order to update the values of an existing entry in HR Index with the new information regarding the citizen’s username and the cloud uri. The request is performed to the following endpoint of the deployed HR Index service: 

- Endpoint: http://[URL]:8080/citizen/updateCitizen
- Parameteres as headers: ***citizenUsername, cloudUri, hriAccessToken***

The response includes the following:
- msg: A message containing the status of the request
- cloudUri: The cloud uri the citizen stores his/ her EHR
- citizenId: The unique ID of the citizen
- citizenUsername: The username used by the citizen
- hriAuthToken: The JWT token used for the validation
- status: The request status

```json
{
    "msg": "Citizen updated",
    "data": [
        {
            "cloudUri": "$cloudUri",
            "citizenId": "$citizenId",
            "citizenUsername": "$citizenUsername"
        }
    ],
    "hriAuthToken": "$hriAccessToken",
    "status": 200
}
```

## Setup guide
To use mhri, the latest version of the library must be downloaded from the GitHub repository and then an object should be created and used inside the application.

The library's latest version is 0.1.2
