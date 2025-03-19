# Documentation: `City` Data Structure

## Overview

The `City` class is a data structure that represents a city entity. It is part of the `com.gft.models` package and utilizes Lombok annotations to reduce boilerplate code for getter, setter, constructors, and other common methods.

---

## Class Details

### Package
- **Package Name**: `com.gft.models`

### Class Name
- **Class Name**: `City`

### Purpose
The `City` class is designed to encapsulate the details of a city, including its unique identifier, name, and associated province.

---

## Attributes

| Attribute Name | Type         | Description                          |
|----------------|--------------|--------------------------------------|
| `idCity`       | `String`     | Unique identifier for the city.      |
| `nameCity`     | `String`     | Name of the city.                    |
| `province`     | `Province`   | The province to which the city belongs. |

---

## Annotations

The class uses the following Lombok annotations:

| Annotation         | Purpose                                                                 |
|--------------------|-------------------------------------------------------------------------|
| `@Getter`          | Automatically generates getter methods for all fields.                 |
| `@Setter`          | Automatically generates setter methods for all fields.                 |
| `@AllArgsConstructor` | Generates a constructor with parameters for all fields.              |
| `@NoArgsConstructor`  | Generates a no-argument constructor.                                 |

---

## Dependencies

- **Lombok**: The class relies on Lombok annotations to simplify code by auto-generating boilerplate methods.
- **Province**: The `Province` class is referenced as a field, indicating a relationship between `City` and `Province`.

---

## Insights

1. **Encapsulation**: The use of private fields ensures encapsulation, while Lombok annotations provide easy access through generated getters and setters.
2. **Constructor Flexibility**: The presence of both `@AllArgsConstructor` and `@NoArgsConstructor` allows for flexible object creation, either with or without initial values.
3. **Relationship**: The `province` field suggests a hierarchical or compositional relationship between `City` and `Province`, which could be part of a larger domain model.
4. **Scalability**: The class is designed to be easily extendable, allowing for additional fields or methods to be added as needed.

---
