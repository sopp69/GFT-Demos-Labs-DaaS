# Documentation: `User` Class

## Overview
The `User` class is a data structure that represents a user entity with attributes such as name, surname, birthday, gender, identification, and address. It is part of the `com.gft.models` package and utilizes the Lombok library to reduce boilerplate code for getters, setters, and constructors.

## Class Details

### Package
`com.gft.models`

### Imports
- `java.util.Date`: Used to represent the user's birthday.
- `lombok.Getter`: Automatically generates getter methods for all fields.
- `lombok.Setter`: Automatically generates setter methods for all fields.
- `lombok.NoArgsConstructor`: Automatically generates a no-argument constructor.

### Annotations
- `@Getter`: Generates getter methods for all fields.
- `@Setter`: Generates setter methods for all fields.
- `@NoArgsConstructor`: Generates a no-argument constructor.

### Fields
| Field Name   | Type              | Description                          |
|--------------|-------------------|--------------------------------------|
| `names`      | `String`          | The first name(s) of the user.       |
| `surnames`   | `String`          | The surname(s) of the user.          |
| `birthday`   | `Date`            | The user's date of birth.            |
| `gender`     | `String`          | The gender of the user.              |
| `id`         | `Identification`  | The user's identification details.   |
| `address`    | `Address`         | The user's address details.          |

### Constructors
| Constructor Signature                                                                 | Description                                                                 |
|--------------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| `User()`                                                                             | Default no-argument constructor.                                           |
| `User(String names, String surnames, Date birthday, String gender, Identification id, Address address)` | Parameterized constructor to initialize all fields.                        |

### Methods
| Method Name         | Return Type       | Description                          |
|---------------------|-------------------|--------------------------------------|
| `getNames()`        | `String`          | Retrieves the user's first name(s).  |
| `setNames(String)`  | `void`            | Sets the user's first name(s).       |
| `getSurnames()`     | `String`          | Retrieves the user's surname(s).     |
| `setSurnames(String)`| `void`           | Sets the user's surname(s).          |
| `getBirthday()`     | `Date`            | Retrieves the user's date of birth.  |
| `setBirthday(Date)` | `void`            | Sets the user's date of birth.       |
| `getGender()`       | `String`          | Retrieves the user's gender.         |
| `setGender(String)` | `void`            | Sets the user's gender.              |
| `getId()`           | `Identification`  | Retrieves the user's identification. |
| `setId(Identification)`| `void`         | Sets the user's identification.      |
| `getAddress()`      | `Address`         | Retrieves the user's address.        |
| `setAddress(Address)`| `void`           | Sets the user's address.             |

## Insights
1. **Lombok Usage**: The class uses Lombok annotations (`@Getter`, `@Setter`, `@NoArgsConstructor`) to reduce boilerplate code. This simplifies the codebase and improves maintainability.
2. **Encapsulation**: The class adheres to the principle of encapsulation by making fields private and providing public getter and setter methods.
3. **Dependencies**: The class depends on two other classes, `Identification` and `Address`, which are not defined in this snippet. These classes likely represent additional details about the user.
4. **Constructors**: While Lombok provides a no-argument constructor, the class also explicitly defines a parameterized constructor for initializing all fields, offering flexibility in object creation.
5. **Data Structure**: This class is purely a data structure with no business logic. It is designed to store and retrieve user-related information.
