package array;

public class ArrayDi4 {
    static void main() {

        int [][] arr=new int[2][3];

        int i=1;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                arr[row][colum]=i++ ;
            }
        }
        //0행 출력
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum]+" ");
            }
            System.out.println();
        }
    }
}
