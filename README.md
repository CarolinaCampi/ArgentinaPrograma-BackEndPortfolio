# ArgentinaPrograma-BackEndPortfolio

This is the backend portion of my first professional portfolio developed for the course Argentina Programa #YoProgramo.

The project was generated with [SpringBoot](https://spring.io/) version 3.0.6.
It uses Java 20 and Maven as the build tool. Lombok annotations are employed as well.
For authentication, JWT

## Getting started 

First, clone the repo: `git clone https://github.com/CarolinaCampi/ArgentinaPrograma-BackEndPortfolio.git`

## Build

To create the .jar: `mvn clean` followed by `mvn package`.

To run the.jar: `java -jar .\target\backend-0.0.1-SNAPSHOT.jar`

## Architecture

The general architecture of the project follows the MVC architecture. This is reflected on the main folders: 
model: contains all the objects
controller: with the logic associated with the objects
repository: contains the implementation of JPA for each object
service: with the methods for each object

The authentication process is implemented using JWT and is partially contained in the config folder. 

## License

GNU General Public License v3.0

