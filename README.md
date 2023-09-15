# UserManagement-Spring-Boot
Making a User Management system with java-Spring-Boot 

#### User is having following properties
   - A User in our system will have these following properties
* UserId
* userName
* userAddress
* phoneNo

  #### our project is having following endpoints
   * addUser 
   * getUser/{id}
   * getAllUser
   * updateUserInfo
   * deleteUser

## Frameworks and languages used
* Spring
* java
* Postman-- for testing the APIs


## Data Flow
 * Controller
   ```
       - Controller hold all the endponts with method associated with them, when client query any api they HTTP dispatch directs
          that query to controller. It hold only endpoints.
   ```
* Services
  ```
      - It has actual logic(business logic) for a particular endpoints. 
          It also has a Repo class which hold the datasource for project.
  ```   
 * Repository
   ```
        - It has data source and all the manipulation on data is defined here only.
   ```
 * Model
    ```
      - It has the schema of our Entities which are involved in project.
      - like in this project we have User as Entity.
   ```
 ## Data Structure
 ```
   * Here we are using List(ArrayList) datastructure.
```
