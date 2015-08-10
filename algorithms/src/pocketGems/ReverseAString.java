package pocketGems;

public class ReverseAString {
    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        String word = "reverse a string";
        reverseAString.reverse1(word.toCharArray());
    }

    private void reverse(String word) {
        char[] charWord = word.toCharArray();
        int start =0;
        int end = word.length()-1;
//        int length = word.length()-1;
        while(start <= end){
            char temp = charWord[end];
            charWord[end] = charWord[start];
            charWord[start] = temp;
            end--;
            start++;
        }
        System.out.println(new String(charWord));
    }

    private void reverse1(char[] word){
        int start = 0;
        int end = 0;
        int length = word.length;
        swap(word,start,length-1);
        while(end < length) {
            if (word[end] != ' ') {
                start = end;
                while (end < length && word[end] != ' ') {
                    end++;
                }
                end--;
                swap(word, start,end);
            }
                end++;
        }
        System.out.println(new String(word));

    }

    private void swap(char[] word, int start, int end) {
        while(start < end){
            System.out.println("start" +start);
            System.out.println("end" +end);
            char temp = word[end];
            word[end] = word[start];
            word[start] = temp;
            end--;
            start++;

        }
    }
}
