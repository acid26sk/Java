package HW_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        minMaxArray();
        System.out.println(checkBalance());
        shiftArray();
    }

    public static void invertArray() {
        int[] arr1={1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i=0; i<arr1.length; i++){
            if (arr1[i]==1) {
                arr1[i]=0;
            } else arr1[i]=1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void fillArray() {
        int[] arr2 = new int[8];
        int k=0;
        for (int i = 0; i < arr2.length; i++,k=k+3){
            arr2[i]=k;
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void changeArray() {
        int[] arr3={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arr3.length; i++){
            if (arr3[i]<6)
                arr3[i]=arr3[i]*2;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void fillDiagonal() {
        int size = 9; // length of array

        int[][] arr4 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i == size - 1 - j))
                    arr4[i][j] = 1;
            }
        }
        for(int[] datum:arr4){
            for (int i:datum){
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }

    public static void minMaxArray() {
        int [] arr5 = {33, 9, 119, 4};
        int max = arr5[0];
        int min = arr5[0];
        for(int i = 0; i != arr5.length; i ++){
            if(arr5[i] > max){
                max = arr5[i];
            }
            if(arr5[i] < min){
                min = arr5[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static boolean checkBalance() {
        int[] arr6={1,3,6,5,3,1};
        int leftSum = 0;
        for (int i = 0; i < arr6.length; i++) {
            leftSum += arr6[i];
            int rightSum = 0;
            for (int j = 0; j < arr6.length; j++) {
                rightSum += (j > i) ? arr6[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    public static void shiftArray() {
        int[] arr7={2,5,8,12,6};
        int value=3;
        int last;
        last = arr7.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = arr7[last];

            for (int j = 0; j < last; j++) {
                arr7[last - j] = arr7[last - j - 1];
            }

            arr7[0] = temp;
        }
        System.out.println(Arrays.toString(arr7));
    }
}