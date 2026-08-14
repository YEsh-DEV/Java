class MyString {
    // Property
    String text;

    // Constructor to set the text
    MyString(String initialText) {
        text = initialText;
    }

    // 1. Find length
    int length() {
        return text.length();
    }

    // 2. String reverse
    String reverse() {
        String reversed = "";
        // Loop from the end of the string to the beginning
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }

    // 3. Replace a character
    String replace(char oldChar, char newChar) {
        return text.replace(oldChar, newChar); 
    }

    // 4. Upper case
    String toUpperCase() {
        return text.toUpperCase();
    }

    // 5. Lower case
    String toLowerCase() {
        return text.toLowerCase();
    }

    // 6. Splitting
    String[] split(String delimiter) {
        return text.split(delimiter);
    }
}

public class MyStringDemo {
    public static void main(String[] args) {
        // Create our custom string object
        MyString myStr = new MyString("Hello Java World");

        System.out.println("Original String: " + myStr.text);
        
        System.out.println("1. Length: " + myStr.length());
        
        System.out.println("2. Reverse: " + myStr.reverse());
        
        System.out.println("3. Replace 'o' with 'x': " + myStr.replace('o', 'x'));
        
        System.out.println("4. Upper Case: " + myStr.toUpperCase());
        
        System.out.println("5. Lower Case: " + myStr.toLowerCase());
        
        System.out.println("6. Split by space:");
        String[] words = myStr.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("   - " + words[i]);
        }
    }
}
