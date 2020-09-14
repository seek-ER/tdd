import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MommifierTest {
    @Test
    void should_return_itself_when_mommifier_given_is_non_a_vowel(){
        String inputString = "b";
        Mommifier modifier = new Mommifier();
        String result = modifier.convert(inputString);
        assertEquals(inputString,result);
    }

}
