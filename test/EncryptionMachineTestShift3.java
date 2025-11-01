import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EncryptionMachineTestShift3 {

    // Test the lower boundary
    @Test
    void encryptLetterAReturnsD() {
        // Act
        char encryptedLetter = EncryptionMachine.encryptLetter('a');

        // Assert
        Assertions.assertEquals('d', encryptedLetter);
    }

    // Test the upper boundary and ensure wrap-around
    @Test
    void encryptLetterZReturnsC() {
        // Act
        char encryptedLetter = EncryptionMachine.encryptLetter('z');

        // Assert
        Assertions.assertEquals('c', encryptedLetter);
    }

    // Test a word with characters at the beginging, middle, and end boundaries to ensure wrap-around
    @Test
    void encryptWordAxleReturnsDaoh() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("axle");

        // Assert
        Assertions.assertEquals("daoh", encryptedWord);
    }

    // Test single character in encryptWord fuction at start of boundary
    @Test
    void encryptWordWithSingleCharacterAReturnsD() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("a");

        // Assert
        Assertions.assertEquals("d", encryptedWord);
    }

    // Test single character in encryptWord fuction at end of boundary
    @Test
    void encryptWordWithSingleCharacterZReturnsC() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("z");

        // Assert
        Assertions.assertEquals("c", encryptedWord);
    }
}