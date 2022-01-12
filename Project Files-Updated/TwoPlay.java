package Assignment_3;

import java.util.Scanner;

public class TwoPlay {
    static private Play p1;
    static private Play p2;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        p1 = new Play();
        p2 = new Play();
        String identify = "";
        String res = "";
        int in = 0;
        while(true){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Do you want to play in single player mode or dual player mode?");
            System.out.println("Enter 1 for single player mode");
            System.out.println("Enter 2 for dual player mode");
            System.out.print("Choice: ");
            in = input1.nextInt();
            if(in == 1 || in == 2){
                break;
            }
            System.out.println("Invalid Choice!!");
        }
        if(in == 1){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Enter the player 1 name and hit enter");
            String sname = input1.nextLine();
            while (sname.equals("")){
                System.out.println("No name entered!! Please try again.");
                System.out.println("Enter the player name and hit enter");
                sname = input1.nextLine();
            }
            p1.getP().setPlayerName(sname);
            while(true){
                System.out.println(p1.getP().getPlayerName() + "'s turn!");
                p1.turn();
                System.out.println();
                if(p1.getP().getFloor().getFloorNumber() == 13) {
                    System.out.println("Game Over!!!");
                    System.out.println(p1.getP().getPlayerName() + " Wins!");
                    System.out.println(p1.getP().getPlayerName() + " accumulated " + p1.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                    break;
                }
            }
            return;
        }





        System.out.println("Enter the player 1 name and hit enter");
        String name = input.nextLine();
        while (name.equals("")){
            System.out.println("No name entered!! Please try again.");
            System.out.println("Enter the player name and hit enter");
            name = input.nextLine();
        }
        p1.getP().setPlayerName(name);
        System.out.println("Enter the player 2 name and hit enter");
        name = input.nextLine();
        while (name.equals("")){
            System.out.println("No name entered!! Please try again.");
            System.out.println("Enter the player name and hit enter");
            name = input.nextLine();
        }
        p2.getP().setPlayerName(name);

        System.out.println("Let's Begin!!!");
        while(true){
            System.out.println(p1.getP().getPlayerName() + "'s turn!");
            p1.turn();
            System.out.println();

            System.out.println(p2.getP().getPlayerName() + "'s turn!");
            p2.turn();
            System.out.println();
            if(p1.getP().getFloor().getFloorNumber() == 13 && p2.getP().getFloor().getFloorNumber() == 13){
                System.out.println("Game Over!!!");
                if(p1.getScore() > p2.getScore()){
                    System.out.println(p1.getP().getPlayerName() + " Wins!");
                    System.out.println(p1.getP().getPlayerName() + " accumulated " + p1.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(p2.getP().getPlayerName() + " accumulated " + p2.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                }
                else if (p1.getScore() < p2.getScore()){
                    System.out.println(p2.getP().getPlayerName() + " Wins!");
                    System.out.println(p1.getP().getPlayerName() + " accumulated " + p1.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(p2.getP().getPlayerName() + " accumulated " + p2.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                }
                else if (p1.getScore() == p2.getScore()){
                    System.out.println(p1.getP().getPlayerName() + " & " +p2.getP().getPlayerName() + " are Tied!");
                    System.out.println(p1.getP().getPlayerName() + " accumulated " + p1.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println(p2.getP().getPlayerName() + " accumulated " + p2.getScore() + " points");
                    System.out.println("---------------------------------------------------------------");
                }
                break;
            }
            else if(p1.getP().getFloor().getFloorNumber() == 13){
                System.out.println("Game Over!!!");
                System.out.println(p1.getP().getPlayerName() + " Wins!");
                System.out.println(p1.getP().getPlayerName() + " accumulated " + p1.getScore() + " points");
                System.out.println("---------------------------------------------------------------");
                break;
            }
            else if(p2.getP().getFloor().getFloorNumber() == 13){
                System.out.println("Game Over!!!");
                System.out.println(p2.getP().getPlayerName() + " Wins!");
                System.out.println(p2.getP().getPlayerName() + " accumulated " + p2.getScore() + " points");
                System.out.println("---------------------------------------------------------------");
                break;
            }
        }
    }
}
