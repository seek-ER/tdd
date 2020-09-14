import java.util.Arrays;
import java.util.List;

public class Mommifier {
    private final static double VOWEL_PERCENT = 0.3;
    private final static String ADD_CONSTANT = "mommy";
    int sum = 0;
    StringBuilder result = new StringBuilder();

    public String convert(String inputString) {
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");
        String[] inputStringArray = inputString.split("");

        if (inputString.length()>0){
            sum = getVowelCountInString(inputStringArray,vowelList,sum);
            boolean flag = judgeVowelPercentInString(sum,inputStringArray);
            if (flag){
                addMommy(inputStringArray, vowelList, result);
                return result.toString();
            }else {
                return inputString;
            }
        }else {
            return null;
        }
    }

    private boolean isVowel(List<String> vowelList, String c){
        return vowelList.contains(c);
    }

    private int getVowelCountInString(String[] inputStringArray, List<String> vowelList, int sum){
        for (String inputChar : inputStringArray) {
            if (isVowel(vowelList,inputChar)){
                sum += 1;
            }
        }
        return sum;
    }

    private boolean judgeVowelPercentInString(int sum,String[] inputStringArray ){
        return (float)sum/(float) inputStringArray.length >= VOWEL_PERCENT;
    }

    private void addMommy(String[] inputStringArray, List<String> vowelList, StringBuilder result){
        for (int i = 0; i < inputStringArray.length-1; i++) {
            if (isVowel(vowelList,inputStringArray[i])){
                if (!isVowel(vowelList,inputStringArray[i+1])){
                    result.append(inputStringArray[i]).append(ADD_CONSTANT);
                }else {
                    result.append(inputStringArray[i]);
                }
            }else {
                result.append(inputStringArray[i]);
            }
        }

        if (isVowel(vowelList,inputStringArray[inputStringArray.length-1])){
            result.append(inputStringArray[inputStringArray.length-1]).append(ADD_CONSTANT);
        }else {
            result.append(inputStringArray[inputStringArray.length-1]);
        }
    }
}
