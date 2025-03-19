# SSH.java Documentation

## Overview
The `SSH` class provides functionality to establish and manage SSH connections using the JSch library. It includes methods to connect to and disconnect from an SSH server. This class is designed to simplify the process of interacting with remote servers via SSH.

---

## Class Details

### Package
The class is part of the `com.gft.connectors` package.

### Dependencies
- **JSch Library**: The class uses the `com.jcraft.jsch` library to handle SSH connections.
  - Classes used:
    - `JSch`
    - `Session`
    - `JSchException`

---

## Fields

| Field Name       | Type         | Access Modifier | Description                                                                 |
|------------------|--------------|-----------------|-----------------------------------------------------------------------------|
| `USUARIO`        | `String`     | `private static final` | Represents the username for the SSH connection. Default value: `"falseUser"`. |
| `HOST`           | `String`     | `private static final` | Represents the host address for the SSH connection. Default value: `"0.0.0.0"`. |
| `session`        | `Session`    | `private static` | Holds the current SSH session object.                                       |

---

## Methods

### `conectar()`
- **Access Modifier**: `public static`
- **Description**: Establishes an SSH connection to the specified host using the provided username and password.
- **Logic**:
  1. Creates a new `JSch` instance.
  2. Initializes a `Session` object using the username, host, and port (`22`).
  3. Sets the password for the session.
  4. Configures the session to ignore strict host key checking (`StrictHostKeyChecking` set to `"no"`).
  5. Connects to the SSH server.
  6. Prints a success message if the connection is established.
  7. Handles exceptions by printing the cause and message of the error.
- **Exceptions**:
  - Captures all exceptions and prints their details to the error stream.

---

### `desconectar()`
- **Access Modifier**: `public static`
- **Description**: Disconnects the current SSH session if it is active.
- **Logic**:
  1. Checks if the `session` object is not null and is connected.
  2. Disconnects the session.
  3. Prints a success message indicating the session has been closed.

---

## Insights

1. **Hardcoded Credentials**: The username (`USUARIO`) and host (`HOST`) are hardcoded, which is not secure for production environments. Additionally, the password is directly set in the `conectar()` method. Consider externalizing these values using environment variables or configuration files.

2. **Error Handling**: The error handling mechanism prints the exception details to the console. For better debugging and logging, consider using a logging framework like Log4j or SLF4J.

3. **Session Management**: The class does not provide a mechanism to check the status of the session before attempting to connect or disconnect. Adding a method to check the session state could improve usability.

4. **StrictHostKeyChecking**: Disabling strict host key checking (`StrictHostKeyChecking` set to `"no"`) can expose the application to security risks. It is recommended to validate the host key in production environments.

5. **Thread Safety**: The `session` field is static, which may lead to concurrency issues if multiple threads attempt to use the `SSH` class simultaneously. Consider refactoring to make the class thread-safe.

6. **Port Configuration**: The SSH port (`22`) is hardcoded. Allowing dynamic configuration of the port would make the class more flexible.

---

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        // Establish SSH connection
        SSH.conectar();

        // Perform operations...

        // Disconnect SSH connection
        SSH.desconectar();
    }
}
```

---

## Potential Enhancements

| Enhancement                     | Description                                                                 |
|---------------------------------|-----------------------------------------------------------------------------|
| Externalize Configuration       | Use environment variables or configuration files for credentials and host details. |
| Add Logging                     | Integrate a logging framework for better error tracking and debugging.      |
| Validate Host Key               | Implement host key validation for improved security.                       |
| Thread Safety                   | Refactor the class to ensure thread-safe operations.                       |
| Dynamic Port Configuration      | Allow the SSH port to be configurable.                                     |
