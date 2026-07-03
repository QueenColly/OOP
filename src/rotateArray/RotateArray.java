package rotateArray;


import java.util.Arrays;

public class RotateArray {
    public static void main(String[]args){

    int[][] result = {{2, 3}, {5, 6}};
   System.out.println(Arrays.deepToString(getRotateArrays(result)));

}

    public static int[][] getRotateArrays(int[][] arrays){
        int news = arrays.length;
        int [][] join = new int [news][news];

            for(int index = 0; index < news; index++) {
                for (int count = 0; count < news; count++) {
                    join[count][news - index - 1] = arrays[index][count];
                }
            }
            return join;

    }
}
