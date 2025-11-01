import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EncryptionMachineTestShift100 {

    @BeforeAll
    static void setupForClass() {
        EncryptionMachine.SHIFT = 100;
    }

    // Test the lower boundary
    @Test
    void encryptLetterAReturnsW() {
        // Act
        char encryptedLetter = EncryptionMachine.encryptLetter('a');

        // Assert
        Assertions.assertEquals('w', encryptedLetter);
    }

    // Test the upper boundary and ensure wrap-around
    @Test
    void encryptLetterZReturnsV() {
        // Act
        char encryptedLetter = EncryptionMachine.encryptLetter('z');

        // Assert
        Assertions.assertEquals('v', encryptedLetter);
    }

    // Test a word with characters at the beginging, middle, and end boundaries to ensure wrap-around
    @Test
    void encryptWordAxleReturnsWTHA() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("axle");

        // Assert
        Assertions.assertEquals("wtha", encryptedWord);
    }

    // Test single character in encryptWord fuction at start of boundary
    @Test
    void encryptWordWithSingleCharacterAReturnsW() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("a");

        // Assert
        Assertions.assertEquals("w", encryptedWord);
    }

    // Test single character in encryptWord fuction at end of boundary
    @Test
    void encryptWordWithSingleCharacterZReturnsV() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("z");

        // Assert
        Assertions.assertEquals("v", encryptedWord);
    }
}
