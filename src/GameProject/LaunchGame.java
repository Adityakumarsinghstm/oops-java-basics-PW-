package GameProject;

import java.util.Scanner;

class Guesser
{
    int guessNum;
     int guessingNumber()
    {
        System.out.println("Guesser! kindly guess the number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}



class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
     void collectNumFromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                System.out.println("sab ne sahi answer diya! sab winner hai bhai");
            }
            else if (numFromGuesser == numFromPlayer2)
            {
                System.out.println("Player1 and player2 jeet gaye!");
            }
            else if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player1 and player3 jeet gaye!");
            }
            else
            {
                System.out.println("Player1 won the game !");
            }

        } else if (numFromGuesser == numFromPlayer2)
        {
            if (numFromGuesser==numFromPlayer3)
            {
                System.out.println("player2 and player3 won the match !");
            }
            else
            {
                System.out.println("Player2 won the game !");
            }

        }
        else if (numFromGuesser== numFromPlayer3)
        {
            System.out.println("Player3 won the game !");
        }
        else
        {
            System.out.println("Sab ka sab galat hai. Aap game har gaye !!");
        }
    }


}
public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Started !!");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
