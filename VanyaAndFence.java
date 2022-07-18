
import java.util.Scanner;
public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int h = input.nextInt();
        int minW=0;

        int[] nh = new int[n];
        
        for (int i = 0; i < n; i++) {
            nh[i] = input.nextInt();
            if (nh[i]>h){
                minW= minW+2;
            }
            else{
                minW= minW+1;
            }
        }

        System.out.println(minW);

    }
    
}