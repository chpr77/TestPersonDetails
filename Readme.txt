# TestPersonDetails

This application is spring boot and maven, you can run application using following steps

1. Compile the application using  command mvn clean install
2. To run application : srping-boot:run

You can import application into STS and build and run as spring boot application



CREATE TABLE `person` (
  `PERSON_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(250) NULL DEFAULT NULL,
  `LAST_NAME` varchar(45) NULL DEFAULT NULL,
  
  PRIMARY KEY (`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `address` ( 
  `ADDRESS_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PERSON_ID` int(11) NOT NULL,
  `CITY` varchar(250) NULL DEFAULT NULL,
  `STATE` varchar(250) NULL DEFAULT NULL,
  `STREET` varchar(250) NULL DEFAULT NULL,
  `POSTAL_CODE` varchar(250) NULL DEFAULT NULL,
  
  PRIMARY KEY (`ADDRESS_ID`,`PERSON_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


//To get all persons
http://localhost:8080/allPersons
[
    {
        "personId": 10,
        "firstName": "Prabhakar",
        "lastName": "Ch"
    }
]


//It will cover save and update
http://localhost:8080/savePerson

{
        
         "personId": "12",
        "firstName": "Pramod",
        "lastName": "K"
    }

//To delete person
http://localhost:8080/delete/10


//It will cover save and update(POST)
http://localhost:8080/savePersonAddress
{
    "personIdentity":{"addressId":40,"personId":14},   
    "state": "AP",
    "street": "Arundalpet",
    "city": "Guntur",
    "postalCode": "522658"
}

/It will cover delete
http://localhost:8080/deletePersonAddress/40/14






