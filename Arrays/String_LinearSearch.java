public class String_LinearSearch {

    static boolean Search(String str, char key) {
        if (str.length() == 0)
            return false;
        for (char c : str.toCharArray()) {
            if (c == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Anusha";
        char key = 'u';
        if (Search(str, key)) {
            System.out.println(key + " is present ");
        } else {
            System.out.println(key + " is not present");
        }
    }
}