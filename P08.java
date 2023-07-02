//Election Ballot Counting
import java.util.*;

class P08
{
    public static void main(String[] args)
    {
        int ballot;
        int spoilt = 0;
        int C1 = 0;
        int C2 = 0;
        int C3 = 0;
        int C4 = 0;
        int C5 = 0;

        Scanner sc = new Scanner(System.in);

        for (int i=0; i<20; i++)
        {
            System.out.println("Enter the number on the ballot: ");
            ballot = sc.nextInt();

            switch(ballot)
            {
                case 1:
                    C1++;
                    break;
                case 2:
                    C2++;
                    break;
                case 3:
                    C3++;
                    break;
                case 4:
                    C4++;
                    break;
                case 5:
                    C5++;
                    break;
                default:
                    spoilt++;
        }
        }

        System.out.println("No. of votes won by candidate 1: " + C1);
        System.out.println("No. of votes won by candidate 2: " + C2);
        System.out.println("No. of votes won by candidate 3: " + C3);
        System.out.println("No. of votes won by candidate 4: " + C4);
        System.out.println("No. of votes won by candidate 5: " + C5);
        System.out.println("No. of spoilt ballots: " + spoilt);
    }
}