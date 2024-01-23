public class ReverseWords {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumped over the lazy dog.";
        String reversedString = reverseWords(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }
    public static String reverseWords(String input){
        String[] words = input.split(" ");
        StringBuilder revstringBuilder = new StringBuilder();
        for(int i = words.length - 1; i>=0; i--){
            revstringBuilder.append(words[i]);
            if(i > 0){
                revstringBuilder.append(" ");
            }
        }
        return revstringBuilder.toString();
    }
}
