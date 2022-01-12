package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    private Player p;
    private int score;
    private Dice dice;
    private ArrayList<Floor> floors;

    //constructor
    public Play(){
        this.dice = new Dice();
        this.floors = new ArrayList<Floor>();
        this.p = new Player();
        this.score = 0;

        for(int i = 0; i < 14; i++){
            if(i == 2){
                floors.add(new Elevator(i, 10));
            }
            else if(i == 5){
                floors.add(new Snake(i, 1));
            }
            else if(i == 8){
                floors.add(new Ladder(i, 12));
            }
            else if(i == 11){
                floors.add(new Cobra(i, 3));
            }
            else{
                floors.add(new Floor(i));
            }
        }
    }

    //Getters and Setters
    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public static void main(String[] args) {
        Play play = new Play();
        String identify = "";
        Scanner input = new Scanner(System.in);
        String res = "";
        System.out.println("Enter the player name and hit enter");
        String name = input.nextLine();
        while (name.equals("")){
            System.out.println("No name entered!! Please try again.");
            System.out.println("Enter the player name and hit enter");
            name = input.nextLine();
        }
        System.out.println("The game setup is ready");
        play.p = new Player(name);
//        int f = 0;
        Player me = play.getP();
        System.out.print("Hit enter to roll the dice");
        res = input.nextLine();
        play.getDice().roller();

        //cannot start until we get 1
        while (play.getDice().getoutcome() != 1) {
            System.out.println("Dice gave 2");
            System.out.println("Game cannot start until you get 1");
            System.out.print("Hit enter to roll the dice ");
            res = input.nextLine();
            play.getDice().roller();
        }
        if(play.getDice().getoutcome() == 1){
            System.out.println("Dice gave 1");
            System.out.println("Player position Floor-0");
            me.setFloor(play.getFloors().get(0));
            System.out.println(me.getPlayerName() + " has reached " + me.getFloor().toString());
            play.setScore(1);
            System.out.println("Total points " + play.getScore());
            //f = 1;
        }

        //game begins and we go till 13th floor
        while (me.getFloor().getFloorNumber() != 13) {
            System.out.print("Hit enter to roll the dice");
            res = input.nextLine();
            play.getDice().roller();
            System.out.println("Dice gave " + play.getDice().getoutcome());
            if (me.getFloor().getFloorNumber() + play.getDice().getoutcome() > 13) {
                System.out.println("Player can't move");
                continue;
            }
            me.setFloor(play.getFloors().get(me.getFloor().getFloorNumber() + play.getDice().getoutcome()));
            System.out.println("Player position Floor-" + me.getFloor().getFloorNumber());
            System.out.println(me.getPlayerName() + " has reached " + me.getFloor().toString());
            play.setScore(play.getScore() + me.getFloor().getFloorBonus());
            System.out.println("Total points " + play.getScore());
            while (!me.getFloor().toString().equals("an Empty Floor") && me.getFloor().getFloorNumber() != 13) {
                me.setFloor(play.getFloors().get(me.getFloor().getFloorDes()));
                System.out.println("Player position Floor-" + me.getFloor().getFloorNumber());
                System.out.println(me.getPlayerName() + " has reached " + me.getFloor().toString());
                play.setScore(play.getScore() + me.getFloor().getFloorBonus());
                System.out.println("Total points " + play.getScore());
            }
        }
        System.out.println("Game over");
        System.out.println(me.getPlayerName() + " accumulated " + play.getScore() + " points");
        System.out.println("---------------------------------------------------------------");
    }
}
