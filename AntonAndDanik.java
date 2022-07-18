import java.util.Scanner;
public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int G = input.nextInt();
        int aCount = 0;
        int dCount = 0;

        String s;

        s = input.next();

        for (int i = 0 ; i < G ; i++){
            if (s.charAt(i) == 'A'){
                aCount++;
            } else if (s.charAt(i) == 'D'){
                dCount++;
            }
        }

        if(aCount == dCount){
            System.out.println("Friendship");
        } else if (aCount > dCount){
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}
