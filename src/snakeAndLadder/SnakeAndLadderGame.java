package snakeAndLadder;
import java.util.Scanner;
public class SnakeAndLadderGame {
    public static void main(String[] args){
        Scanner Sc= new Scanner(System.in);
        System.out.println("Input the names of the two players:");
        String player1=Sc.next();
        String player2=Sc.next();
        int player1position=0;
        int player2position=0;
        int count=0; // For counting number of turns
        int x;   // for getting random value



        while(player1position!=50&&player2position!=50)
        {   System.out.println();
            // Dice Computation Getting the Random Dice
            x = (int) Math.floor(Math.random()*(6 -1 +1) + 1);
            if((player1position+x)<=50)


                player1position=x+player1position; //position update for player 1
            System.out.println(player1+" throws "+x);

            System.out.println(player1+" reaches to cell "+player1position);




            switch(player1position)
            {   //for ladders
                case 3:System.out.println(player1+" reaches to base of a ladder ");   player1position=22;
                    System.out.println(player1+" climbs upto postion 22");
                    break;
                case 5:System.out.println(player1+" reaches to base of a ladder ");   player1position=25;
                    System.out.println(player1+" climbs upto postion 25");
                    break;
                case 11:System.out.println(player1+" reaches to base of a ladder ");  player1position=36;
                    System.out.println(player1+" climbs upto postion 36");
                    break;
                case 20:System.out.println(player1+" reaches to base of a ladder ");  player1position=48;
                    System.out.println(player1+" climbs upto postion 48");
                    break;
                //for snakes
                case 17:System.out.println(player1+" reaches to mouth of a snake ");  player1position=4;
                    System.out.println(player1+" goes down to 4");
                    break;
                case 19:System.out.println(player1+" reaches to mouth of a snake ");  player1position=7;
                    System.out.println(player1+" goes down postion 7");
                    break;
                case 33:System.out.println(player1+" reaches to mouth of a snake ");  player1position=9;
                    System.out.println(player1+" goes down postion 9");
                    break;
                case 47:System.out.println(player1+" reaches to mouth of a snake ");  player1position=1;
                    System.out.println(player1+" goes down postion 1");
                    break;
                default:break;
            }


            System.out.println();
            // random dice value
            x=(int) Math.floor(Math.random()*(6 - 1 +1) + 1);
            if((player2position+x)<=50)

                player2position=x+player2position;       //position update of playerB
            System.out.println(player2+" throws "+x);

            System.out.println(player2+" reaches to cell "+player2position);



            switch(player2position)
            {   //for ladders
                case 3:System.out.println(player2+" reaches to base of a ladder "); player2position=22;
                    System.out.println(player2+" climbs upto postion 22");
                    break;
                case 5:System.out.println(player2+" reaches to base of a ladder ");  player2position=25;
                    System.out.println(player2+" climbs upto postion 25");
                    break;
                case 11:System.out.println(player2+" reaches to base of a ladder "); player2position=36;
                    System.out.println(player2+" climbs upto postion 36");
                    break;
                case 20:System.out.println(player2+" reaches to base of a ladder "); player2position=48;
                    System.out.println(player2+" climbs upto postion 48");
                    break;
                //for snakes
                case 17:System.out.println(player2+" reaches to mouth of a snake "); player2position=4;
                    System.out.println(player2+" goes down to 4");
                    break;
                case 19:System.out.println(player2+" reaches to mouth of a snake "); player2position=7;
                    System.out.println(player2+" goes down to 7");
                    break;
                case 33:System.out.println(player2+" reaches to mouth of a snake "); player2position=9;
                    System.out.println(player2+" goes down to 9");
                    break;
                case 47:System.out.println(player2+" reaches to mouth of a snake "); player2position=1;
                    System.out.println(player2+" goes down to 1");
                    break;
                default:break;
            }
            count++;
        }

        System.out.println();

        System.out.println("Total number of dice throws made by each player is: "+count);

        if(player1position==50&&player2position==50)
        {
            System.out.println("It's a tie....");
        }

        else if(player1position==50)
        {
            System.out.println(player1+" is the winner...");
        }

        else
        {
            System.out.println(player2+" is the winner...");
        }

    }
}

