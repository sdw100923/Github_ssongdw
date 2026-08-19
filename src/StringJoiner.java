public class StringJoiner {
    public static String join(String separator, String... words){
        if (words.length == 0) return "";
        if (words.length == 1) return words[0];

        String result = "";
        int i;
        for (i =0; i< words.length;i++){
            result += (words[i] + separator);
        }
        result += words[i];
        return  result;
    }
}
