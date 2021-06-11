# exercise-API-CRUD-clients

### You will have to deliver a Spring Boot 2.4.x project containing a full CRUD of REST web services to access a client resource containing the five basic operations:


* #### Feature paged search

* #### Resource search by id

* #### Insert new resource

* #### Update resource

* #### Delete resource

### The project must have a test environment configured by accessing the H2 database, it must use Maven as a dependency manager, and Java 11 as a language.

### A client has a name, CPF, income, date of birth, and number of children. The Client entity specification is shown below (you must strictly follow the class names and attributes shown in the diagram):

![UML Diagram](https://i.imgur.com/CYsQid0.png)

### Your project should seed at least 10 clients with SIGNIFICANT data (not to use non-meaning data like “Name 1”, “Name 2”, etc.).

### Attention: remember that by default JPA transforms attribute names in camelCase to snake_case, as was the case with DSCatalog's imgUrl field, which in the database had the name img_Url. So the birthDate field above will be created in the database as birth_Date, so your SQL script should follow this pattern.



All requests should work correctly:


 * #### Paged customer search
 
  GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

 * #### Customer search by id
 
GET /clients/1

 * #### Insertion of new customer
 
POST /clients
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}


 * #### Customer update
PUT /clients/1
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}


 * #### Customer deletion
DELETE /clients/1

