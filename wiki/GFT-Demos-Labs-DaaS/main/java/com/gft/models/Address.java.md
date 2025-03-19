# Address.java

## Overview
The `Address` class is a data structure that represents an address entity. It is part of the `com.gft.models` package and utilizes the Lombok library to reduce boilerplate code by automatically generating getter, setter, and constructor methods.

## Class Details

### Package
`com.gft.models`

### Annotations
The class is annotated with the following Lombok annotations:
- `@Getter`: Automatically generates getter methods for all fields.
- `@Setter`: Automatically generates setter methods for all fields.
- `@AllArgsConstructor`: Generates a constructor with parameters for all fields.
- `@NoArgsConstructor`: Generates a no-argument constructor.

### Fields
| Field Name | Type   | Description                     |
|------------|--------|---------------------------------|
| `address`  | String | Represents the address details. |
| `city`     | City   | Represents the city associated with the address. |

### Dependencies
- **Lombok**: Used for generating boilerplate code such as getters, setters, and constructors.
- **City**: A custom class (not provided in this snippet) that represents a city entity.

## Insights
- The class is purely a data structure and does not contain any logic or behavior.
- The use of Lombok significantly reduces the amount of boilerplate code, making the class concise and easier to maintain.
- The `City` class is a dependency, and its structure or functionality will influence how the `Address` class is used.
- This class is likely part of a larger domain model, potentially used in applications dealing with geographical or user-related data.
