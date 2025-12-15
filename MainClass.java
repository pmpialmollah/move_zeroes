package move_zeroes;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] nums = {1, 0, 4, 0, 0, 5};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
    public static int[] moveZeroes(int[] array){
        for (int i=0; i<array.length; i++){
            if (array[i] == 0) {
                for (int j=i; j<array.length; j++){
                    if (array[j] != 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
