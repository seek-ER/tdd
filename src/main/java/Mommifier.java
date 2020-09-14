import java.util.Arrays;
import java.util.List;

public class Mommifier {
    public String convert(String inputString) {
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");
        if (vowelList.contains(inputString)){
            return inputString+"mommy";
        }
        return inputString;
    }
}
