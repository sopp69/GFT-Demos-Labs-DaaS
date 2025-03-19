# Documentation: `RunApp.java`

## Overview
The `RunApp` class is a Java program that demonstrates the usage of various utility classes and models, such as `SSH`, `Encrypt`, `Address`, `City`, `Province`, and `ConvertTo`. It performs operations like creating an address object, printing its details, converting data, and managing SSH connections and encryption.

---

## File Metadata
- **File Name**: `RunApp.java`

---

## Class: `RunApp`

### Purpose
The `RunApp` class serves as the entry point for the application. It contains the `main` method, which orchestrates the execution of various operations, including:
- Address creation and retrieval of its details.
- File conversion using the `ConvertTo` utility.
- SSH connection management.
- Encryption operations.

---

### Key Components

#### Static Fields
| Field Name | Type   | Description                                      |
|------------|--------|--------------------------------------------------|
| `ss`       | `SSH`  | Represents an SSH connection utility.            |
| `en`       | `Encrypt` | Represents an encryption utility.              |

#### Main Method
The `main` method is the entry point of the program. It performs the following operations:

1. **Address Creation**:
   - Creates an `Address` object with a street address, a `City` object, and a `Province` object.
   - Prints the address and city name to the console.

2. **File Conversion**:
   - Uses the `ConvertTo` utility to perform a file conversion operation via the `stringFromFile` method.

3. **SSH Connection and Encryption**:
   - Attempts to connect to an SSH server using the `conectar` method of the `SSH` class.
   - Performs encryption using the `getAES` method of the `Encrypt` class with a sample password.
   - Disconnects the SSH connection using the `desconectar` method.

---

## Insights

### Dependencies
The program relies on the following external classes and packages:
- **`com.gft.connectors.SSH`**: Manages SSH connections.
- **`com.gft.models.Address`**: Represents an address with associated city and province details.
- **`com.gft.models.City`**: Represents a city with an ID and name.
- **`com.gft.models.Province`**: Represents a province with an ID and name.
- **`com.gft.security.Encrypt`**: Provides encryption functionalities.
- **`com.gft.utils.ConvertTo`**: Contains utility methods for data conversion.

### Observations
1. **Hardcoded Logic**:
   - The condition `if(1 == 1)` is always true, making it redundant. This could be replaced with meaningful logic or removed entirely.

2. **Uninitialized Static Fields**:
   - The static fields `ss` and `en` are used without proper initialization, which may lead to `NullPointerException` during runtime.

3. **Redundant Encryption Call**:
   - The `getAES` method of the `Encrypt` class is called twice with the same password. This could be optimized.

4. **Error Handling**:
   - The program lacks error handling for operations like SSH connection, encryption, and file conversion. This could lead to runtime exceptions.

5. **Resource Management**:
   - The `desconectar` method is called on the `SSH` object, but the `conectar` method is invoked conditionally. This could result in an attempt to disconnect an uninitialized or inactive connection.

### Recommendations
- Initialize the `ss` and `en` objects before use.
- Replace the hardcoded condition `if(1 == 1)` with meaningful logic or remove it.
- Add error handling for critical operations like SSH connection and encryption.
- Optimize redundant method calls to improve performance.
- Ensure proper resource management to avoid potential issues with uninitialized or inactive connections.
