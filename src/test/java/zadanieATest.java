import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.A.AlphabetNumbers;

public class zadanieATest {
    @Test
    public void testIsLetter() {
        assertTrue(AlphabetNumbers.isLetter('а'));
        assertTrue(AlphabetNumbers.isLetter('я'));
        assertTrue(AlphabetNumbers.isLetter('ё')); // Если добавить поддержку 'ё'
        assertFalse(AlphabetNumbers.isLetter('1')); // Не буква
        assertFalse(AlphabetNumbers.isLetter('.')); // Не буква
        assertTrue(AlphabetNumbers.isLetter('a'));
        assertTrue(AlphabetNumbers.isLetter('z'));
        assertFalse(AlphabetNumbers.isLetter(' ')); // Не буква
    }

    @Test
    public void testGetLetterPosition() {
        assertEquals(1, AlphabetNumbers.getLetterPosition('a'));
        assertEquals(26, AlphabetNumbers.getLetterPosition('z'));
        assertEquals(1, AlphabetNumbers.getLetterPosition('а'));
        assertEquals(33, AlphabetNumbers.getLetterPosition('я'));
        assertEquals(-1, AlphabetNumbers.getLetterPosition('1'));
        assertEquals(-1, AlphabetNumbers.getLetterPosition('.'));
    }
}
