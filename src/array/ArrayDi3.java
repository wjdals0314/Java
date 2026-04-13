package array;

public class ArrayDi3 {
    static void main() {

        int [][] arr=new int[][]{
                {1,2,3},
                {4,5,6 }
        };
        //0행 출력
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum]+" ");
            }
            System.out.println();
        }
    }
}
