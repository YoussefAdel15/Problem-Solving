import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int solve = 0;

        for( int i = 0 ; i < p ;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if (a+b+c>=2){
                solve++;
            }
        }

        System.out.println(solve);
    }
}
