Online-banking

An online banking simulator using Object oriented programming and software design patterns. Technology Stack:- Spring Boot, Hibernate, MySQL, Thymeleaf, HTML, CSS and JQuery.

Download the package and import it as a maven project on eclipse.
Start a new MySQL instance on your local machine (Or you can sequentially execute all the SQL code in the sql_dump manually).
Use the SQL dump file in the sql_dump folder to initialize the database.
If you want to connect to a remote database instance change the connection parameters in application.properties file under "src/main/resources" and repeat do step 3.
Run the application as maven project with goal as spring-boot: run on eclipse IDE.
The application will start running on localhost:8080.
Login to the system using username: "user" password: "password" to login as a customer. To login as the admin use username: "admin" password:"password".