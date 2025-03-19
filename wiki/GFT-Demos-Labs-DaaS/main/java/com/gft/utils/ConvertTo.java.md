# Documentation: ConvertTo.java

## Overview
The `ConvertTo` class is part of the `com.gft.utils` package and provides functionality to read a JSON file, parse its contents, and extract specific information. The class is designed to process a JSON array from a file and print details about each JSON object within the array.

---

## Class: `ConvertTo`

### Purpose
The `ConvertTo` class is designed to handle file operations and JSON parsing. It reads a JSON file, processes its contents, and extracts specific fields from the JSON objects for further use or display.

---

### Method: `stringFromFile`

#### Description
The `stringFromFile` method reads a JSON file located in the `src/main/resources/com/gft/files/` directory, parses its contents into a `JSONArray`, and processes each JSON object within the array. It extracts and prints specific fields such as `File`, `Errors`, `Lines`, and `TotalFileSize`.

#### Key Operations
1. **File Reading**:
   - The method constructs the file path dynamically using `System.getProperty("user.dir")`.
   - Reads the file content using `Files.lines()` and joins the lines into a single string.

2. **JSON Parsing**:
   - Converts the file content into a `JSONArray`.
   - Iterates through each element in the array, treating it as a `JSONObject`.

3. **Data Extraction**:
   - Extracts specific fields (`File`, `Errors`, `Lines`, `TotalFileSize`) from each `JSONObject`.
   - Processes the `Errors` field to remove unwanted characters (e.g., brackets and quotes).

4. **Output**:
   - Prints the extracted data in a tabular format.

#### Parameters
This method does not accept any parameters.

#### Return Value
This method does not return any value (`void`).

#### Exception Handling
- Catches `IOException` during file reading and prints the stack trace.

---

### Dependencies
The `ConvertTo` class relies on the following external libraries:
- **Java NIO**:
  - `java.nio.file.Files`
  - `java.nio.file.Paths`
- **JSON Parsing**:
  - `org.json.JSONArray`
  - `org.json.JSONObject`

---

### Example Workflow
1. The method reads the file `results.json` from the specified directory.
2. Parses the file content into a `JSONArray`.
3. Iterates through each JSON object in the array and extracts the following fields:
   - `File`: Name of the file.
   - `Errors`: List of errors, formatted as a comma-separated string.
   - `Lines`: Number of lines in the file.
   - `TotalFileSize`: Total size of the file.
4. Prints the extracted data in a tabular format.

---

## Insights

### Strengths
- **Dynamic File Path**: The file path is constructed dynamically using `System.getProperty("user.dir")`, making the code portable across different environments.
- **JSON Parsing**: The use of `org.json` library simplifies JSON handling and provides robust methods for data extraction.
- **Error Handling**: The method includes basic exception handling for file reading operations.

### Limitations
- **Hardcoded File Path**: The file path is partially hardcoded, which may limit flexibility if the directory structure changes.
- **Error Handling**: The exception handling is limited to printing the stack trace, which may not be sufficient for production environments.
- **No Return Value**: The method does not return any processed data, making it less reusable for other parts of the application.

### Potential Enhancements
- **Improved Error Handling**: Implement logging instead of `e.printStackTrace()` for better debugging and monitoring.
- **Parameterization**: Allow the file path to be passed as a parameter to increase flexibility.
- **Data Validation**: Add validation to ensure the JSON file contains the expected structure before processing.

---

## File Metadata

| **Attribute**       | **Value**                          |
|----------------------|------------------------------------|
| **File Name**        | `ConvertTo.java`                  |
| **Package**          | `com.gft.utils`                   |
| **Dependencies**     | Java NIO, org.json                |
| **Primary Function** | File reading and JSON processing  |
