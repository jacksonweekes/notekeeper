# notekeeper
A small application to demonstrate basic session management in the Play! framework and the use of some features of the framework, including the use of form objects, authenticators and the twirl templating system. Ebean is used for communicating with a relational database and it is configured to use the inbuilt test database. JUnit tests are included.

Requires sbt to run, simply open the root folder of the project from a prompt, and enter 'sbt run' to start the play server on port 9000, or 'sbt "run {port number}"' to start it on another port. The application can then be accessed through a web browser via localhost:{port number}
