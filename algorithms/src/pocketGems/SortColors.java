package pocketGems;

public class SortColors {

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        int[] numbers = {0,1,2,3,4,0,1};
        int range = 5;
        sortColors.sort(numbers,range);

    }

    private void sort(int[] numbers, int range) {
        int[] countArray = {0,0,0,0,0};
        int[] sortArray = new int[numbers.length];
        for (int number : numbers) {
            countArray[number] += 1;
        }
//        for (int i=1;i<countArray.length;i++) {
//            countArray[i] = countArray[i] + countArray [i-1];
//        }
        int c = 0;
        for(int i=0;i<numbers.length;i++){
            if(countArray[c]>=0) {
                numbers[i] = c;
                countArray[c]--;
            }
            if(countArray[c] == 0){
                c++;
            }
        }

//        for(int number : numbers){
//            int index = countArray[number];
//            sortArray[index-1] = number;
//            countArray[number] -= 1;
//
//        }
        for(int number:numbers){
            System.out.println(number);
        }
    }



}
