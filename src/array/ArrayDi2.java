package array;

public class ArrayDi2 {
    static void main() {

        int [][] arr=new int[2][3];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        //0행 출력
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum]+" ");
            }
            System.out.println();
        }
    }
}
