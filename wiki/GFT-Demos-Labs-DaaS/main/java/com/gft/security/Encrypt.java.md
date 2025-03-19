# Encrypt.java Documentation

## Overview

The `Encrypt` class provides utility methods for encrypting and decrypting data using the AES (Advanced Encryption Standard) algorithm in CBC (Cipher Block Chaining) mode with PKCS5 padding. It uses a combination of a secret key and a salt to derive a secure encryption key through the PBKDF2WithHmacSHA256 key derivation function.

This class is designed to handle encryption and decryption of strings, ensuring data confidentiality. It uses Base64 encoding to represent encrypted data as a string.

---

## Class Details

### Package
`com.gft.security`

### Dependencies
The class relies on the following Java libraries:
- `java.security.spec.KeySpec`
- `java.util.Base64`
- `javax.crypto.*`
- `java.security.*`
- `java.io.UnsupportedEncodingException`
- `java.util.Arrays`

---

## Methods

### `getAES(String data)`
Encrypts the input string using AES encryption.

#### Parameters
- `data` (String): The plaintext string to be encrypted.

#### Returns
- `String`: The encrypted string encoded in Base64.

#### Exceptions
- Throws a `RuntimeException` if any of the following exceptions occur:
  - `NoSuchAlgorithmException`
  - `InvalidKeyException`
  - `InvalidAlgorithmParameterException`
  - `InvalidKeySpecException`
  - `NoSuchPaddingException`
  - `UnsupportedEncodingException`
  - `BadPaddingException`
  - `IllegalBlockSizeException`

#### Process
1. Initializes a 16-byte IV (Initialization Vector) with zeros.
2. Derives a secret key using PBKDF2WithHmacSHA256 with the provided secret key and salt.
3. Configures the AES cipher in CBC mode with PKCS5 padding.
4. Encrypts the input data and encodes the result in Base64.

---

### `getAESDecrypt(String data)`
Decrypts the input string using AES decryption.

#### Parameters
- `data` (String): The Base64-encoded encrypted string to be decrypted.

#### Returns
- `String`: The decrypted plaintext string.

#### Exceptions
- Throws a `RuntimeException` if any of the following exceptions occur:
  - `NoSuchAlgorithmException`
  - `InvalidKeyException`
  - `InvalidAlgorithmParameterException`
  - `InvalidKeySpecException`
  - `NoSuchPaddingException`
  - `UnsupportedEncodingException`
  - `BadPaddingException`
  - `IllegalBlockSizeException`

#### Process
1. Initializes a 16-byte IV (Initialization Vector) with zeros.
2. Derives a secret key using PBKDF2WithHmacSHA256 with the provided secret key and salt.
3. Configures the AES cipher in CBC mode with PKCS5 padding.
4. Decodes the Base64-encoded input and decrypts the data.

---

## Constants

| Constant Name   | Value                          | Description                                      |
|------------------|--------------------------------|--------------------------------------------------|
| `secretKeyAES`  | `"xsdcrvftygbuiopmcceu8fhyb567"` | The secret key used for AES encryption.         |
| `saltAES`       | `"5kacbkU000"`                 | The salt used for key derivation.               |

---

## Insights

1. **Security Considerations**:
   - The IV is hardcoded as a zero-filled byte array, which reduces the security of the encryption. A unique, random IV should be generated for each encryption operation and stored alongside the ciphertext.
   - The secret key and salt are hardcoded, which is not secure for production use. These should be securely stored and retrieved, e.g., from a secure vault or environment variables.

2. **Key Derivation**:
   - The PBKDF2WithHmacSHA256 algorithm is used to derive a secure key from the secret key and salt. This ensures that the encryption key is strong and resistant to brute-force attacks.

3. **Error Handling**:
   - The methods wrap all exceptions in a `RuntimeException`, which may not provide sufficient granularity for debugging. Consider using custom exception handling for better error reporting.

4. **Encoding**:
   - Base64 encoding is used to make the encrypted data string-safe, which is useful for storage or transmission.

5. **Cipher Configuration**:
   - The class uses AES in CBC mode with PKCS5 padding, which is a standard and secure configuration for symmetric encryption.

6. **Performance**:
   - The key derivation function uses 65,536 iterations, which provides a good balance between security and performance.

---

## Usage Example

```java
public class Main {
    public static void main(String[] args) {
        String plaintext = "Hello, World!";
        
        // Encrypt the plaintext
        String encrypted = Encrypt.getAES(plaintext);
        System.out.println("Encrypted: " + encrypted);
        
        // Decrypt the ciphertext
        String decrypted = Encrypt.getAESDecrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
```

---

## Limitations
- The hardcoded IV and secret key reduce the overall security of the implementation.
- The class does not support dynamic IV generation or storage, which is a best practice for secure encryption.
