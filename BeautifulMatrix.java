import java.util.Scanner;
import java.lang.Math;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int OneR=0;
        int OneC=0;
        int Steps=0;
        for(int i = 0 ; i<arr.length; i++){
            for(int j =0 ; j <arr[0].length ; j++){
                arr[i][j]=input.nextInt();
                if(arr[i][j]==1){
                    OneR = i;
                    OneC = j;
                }
            }
        }
        if(OneR != 2 || OneC != 2){
            Steps = Math.abs((OneC-2))+Math.abs(+(OneR-2));
        }

        System.out.println(Steps);
    }
}
