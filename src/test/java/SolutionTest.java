import org.example.Main;
import org.example.tools.WordsReverser;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", WordsReverser.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", WordsReverser.reverseWords("apple"));
        assertEquals("a b c d", WordsReverser.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", WordsReverser.reverseWords("double  spaced  words"));
    }
}
