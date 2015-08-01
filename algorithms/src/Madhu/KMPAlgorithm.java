public class KMPAlgorithm {

    public static void main(String[] args) {
        KMPAlgorithm kmpAlgorithm = new KMPAlgorithm();
        String pattern = "abcaby";
        String text = "abcabyadaaaa";
        int[] patternCode = kmpAlgorithm.buildPattern(pattern);
        if(kmpAlgorithm.search(text,patternCode, pattern)) {
            System.out.println("pattern found");
        } else{
            System.out.println("pattern not found");
        }
    }

    private boolean search(String text, int[] patterncode, String pattern) {
        int j = 0;
        int i = 0;
        while(i < text.length()) {
            while (i<text.length() && j < pattern.length() && pattern.charAt(j) == text.charAt(i)) {
                j++;
                i++;
                if( j == pattern.length()) {
                    return true;
                }
            }
            if (j - 1 >= 0) {
                j = patterncode[j - 1];
            } else {
                i++;
            }
        }
        return false;
    }

    private int[] buildPattern(String pattern) {
        int j = 0;
        int[] patternCode = new int[pattern.length()];
        patternCode[0] = 0;
        for(int i =1;i<pattern.length();i++){
            if(pattern.charAt(j) != pattern.charAt(i)){
                if(i < pattern.length() &&  j-1 > 0) {
                    j = patternCode[j-1];
                } else {
                    patternCode[i] = 0;
                   continue;
                }
            }
                patternCode[i] = j + 1;
                j++;
        }
        return patternCode;
    }

}
