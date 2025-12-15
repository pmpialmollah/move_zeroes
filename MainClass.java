package move_zeroes;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        
        int[] nums = {1, 0, 4, 0, 0, 5};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] array){
        int lastNoneZeroDigit = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] != 0) {
                array[lastNoneZeroDigit] = array[i];
                lastNoneZeroDigit++;
            }
        }
        for (int i=lastNoneZeroDigit; i<array.length; i++){
            array[i] = 0;
        }
        return array;
    }
}
