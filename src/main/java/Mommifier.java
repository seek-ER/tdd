import java.util.Arrays;
import java.util.List;

public class Mommifier {
    public String convert(String inputString) {
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");
        String[] inputStringArray = inputString.split("");

        int sum = 0;
        StringBuilder result = new StringBuilder();

        if (inputString.length() == 1){
            if (vowelList.contains(inputString)){
                return inputString+"mommy";
            }
            return inputString;
        }else if(inputString.length() > 1){
            for (String c : inputStringArray){
                if (vowelList.contains(c)){
                    sum += 1;
                }
            }
            if ((float)sum/(float) inputStringArray.length >= 0.3){
                for (String c : inputStringArray){
                    if (vowelList.contains(c)){
                        result.append(c).append("mommy");
                    }else {
                        result.append(c);
                    }
                }
            }else {
                result = new StringBuilder(inputString);
            }
            return result.toString();
        }else {
            return null;
        }
    }
}
