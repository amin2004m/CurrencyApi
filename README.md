**Currency API** is a Spring Boot application that retrieves and processes currency exchange rates using a structured and efficient architecture.


## Project Structure

- config: Contains configuration files, such as application-specific settings.
- controller: Handles API requests and responses.
- enumException: Centralized error codes and messages..
- exception: Defines centralized exception handling, including custom exceptions.
- model: Data models representing currency and exchange rate information.
- service: Business logic and operations for fetching currency data.
- resources: Configuration files, such as application.properties.

---

## Technologies Used
- Java 17+
- Spring Boot: Framework for building RESTful services.
- Lombok: To reduce boilerplate code.
- Spring Web: For REST API development.
- JAXB (for XML parsing)
- Central Bank XML Parser

### Get Currency Rates
- **Endpoint**: `/api/v1/currency`
- **Method**: `GET`
- **Response**: Returns the latest currency rates in JSON format.
