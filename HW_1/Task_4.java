package HW_1;

public class Task_4 {
    public static void main(String[] args) {
        String s = "EPY2giL";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sentence = new StringBuilder();
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                sb.append(s.charAt(j));
            } else {
                if (sb.length() > 0) {
                    sb.reverse();
                    if (sentence.length() != 0) {
                        sentence.append(" ");
                    }
                    sentence = sentence.append(sb);

                    sb = new StringBuilder();
                }
            }
        }
        if (sb.length() > 0) {
            sb.reverse();
            if (sentence.length() != 0) {
                sentence.append(" ");
            }
            sentence = sentence.append(sb);
        }
        return sentence.toString();
    }
}


