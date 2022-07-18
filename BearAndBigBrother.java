import java.util.Scanner;;
public class BearAndBigBrother {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LimakW = input.nextInt();
        int BobW= input.nextInt();
        int years=0;

        while(BobW>=LimakW){
            BobW = BobW*2;
            LimakW = LimakW*3;
            years++;
        }

        System.out.println(years);
    }
}