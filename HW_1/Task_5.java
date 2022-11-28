package HW_1;

public class Task_5 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder world = new StringBuilder();
        StringBuilder backWorld = new StringBuilder();
        char symb = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)) == true) {
                symb = s.charAt(i);
                world.append(Character.toLowerCase(symb));
            }
        }

        backWorld.append(world);
        backWorld.reverse();
        boolean ans = true;

        for (int j = 0; j < world.length(); j++) {
            if (world.charAt(j) != backWorld.charAt(j)) {
                ans = false;
            }
        }

        return ans;
    }
}
