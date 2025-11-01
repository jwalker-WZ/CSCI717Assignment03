import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EncryptionMachineTestShift25 {

    @BeforeAll
    static void setupForClass() {
        EncryptionMachine.SHIFT = 25;
    }

    // Test the lower boundary
    @Test
    void encryptLetterAReturnsZ() {
        // Act
        char encryptedLetter = EncryptionMachine.encryptLetter('a');

        // Assert
        Assertions.assertEquals('z', encryptedLetter);
    }

    // Test the upper boundary and ensure wrap-around
    @Test
    void encryptLetterZReturnsY() {
        //Act
        char encryptedLetter = EncryptionMachine.encryptLetter('z');

        // Assert
        Assertions.assertEquals('y', encryptedLetter);
    }

    // Test a word with characters at the beginging, middle, and end boundaries to ensure wrap-around
    @Test
    void encryptWordAxleReturnsZWKD() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("axle");

        // Assert
        Assertions.assertEquals("zwkd", encryptedWord);
    }

    // Test single character in encryptWord fuction at start of boundary
    @Test
    void encryptWordWithSingleCharacterAReturnsZ() {
        // Act
        String encryptedWord = EncryptionMachine.encryptWord("a");

        // Assert
        Assertions.assertEquals("z", encryptedWord);
    }

    // Test single character in encryptWord fuction at end of boundary
    @Test
    void encryptWordWithSingleCharacterZReturnsY() {
        //Act
        String encryptedWord = EncryptionMachine.encryptWord("z");

        // Assert
        Assertions.assertEquals("y", encryptedWord);
    }
}
