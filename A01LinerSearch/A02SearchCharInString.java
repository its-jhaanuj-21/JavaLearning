
// Linear Search: Search Character in given String | return -> true / false

public class A02SearchCharInString {
    public static void main(String[] args) {
        String name = "Anuj Kumar Jha";
        char target = 'u';
        System.out.println(searchCharacter(name, target));

        String name2 = "PANKAJ TRIPATHI";
        char target2 = 'p';
        System.out.println(searchCharacter2(name2, target2));
    }

    static boolean searchCharacter(String str, char target) {
        // return false if the length of string is 0
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchCharacter2(String str, char target) {

        // ignoring case if there any:
        str = str.toLowerCase();
        target = Character.toLowerCase(target);

        if (str.length() == 0) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (c == target) {
                return true;
            }

        }
        return false;
    }

}
