package Assignment_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
    private Player p;
    private int score;
    private Dice dice;
    private ArrayList<Floor> floors;
    private int sf = 0;

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

    public int getSf() {
        return sf;
    }

    public void setSf(int sf) {
        this.sf = sf;
    }

    public void turn() {
        Scanner input = new Scanner(System.in);
        String res = "";
        System.out.print("Hit enter to roll the dice");
        res = input.nextLine();
        this.getDice().roller();

        //cannot start until we get 1
        if(this.getSf() == 0 && this.getDice().getoutcome() != 1) {
            System.out.println("Dice gave 2");
            System.out.println("Game cannot start until you get 1");
//            System.out.print("Hit enter to roll the dice ");
//            res = input.nextLine();
//            this.getDice().roller();
        }
        else {
            if(this.getSf() == 0 && this.getDice().getoutcome() == 1) {
                System.out.println("Dice gave 1");
                System.out.println("Player position Floor-0");
                this.getP().setFloor(this.getFloors().get(0));
                System.out.println(this.getP().getPlayerName() + " has reached " + this.getP().getFloor().toString());
                this.setScore(1);
                System.out.println("Total points " + this.getScore());
                this.setSf(1);
            }
            else {
//                System.out.print("Hit enter to roll the dice");
//                res = input.nextLine();
                this.getDice().roller();
                System.out.println("Dice gave " + this.getDice().getoutcome());
                if (this.getP().getFloor().getFloorNumber() + this.getDice().getoutcome() > 13) {
                    System.out.println("Player can't move");
                    return;
                }
                this.getP().setFloor(this.getFloors().get(this.getP().getFloor().getFloorNumber() + this.getDice().getoutcome()));
                System.out.println("Player position Floor-" + this.getP().getFloor().getFloorNumber());
                System.out.println(this.getP().getPlayerName() + " has reached " + this.getP().getFloor().toString());
                this.setScore(this.getScore() + this.getP().getFloor().getFloorBonus());
                System.out.println("Total points " + this.getScore());
                if(!this.getP().getFloor().toString().equals("an Empty Floor") && this.getP().getFloor().getFloorNumber() != 13) {
                    this.getP().setFloor(this.getFloors().get(this.getP().getFloor().getFloorDes()));
                    System.out.println("Player position Floor-" + this.getP().getFloor().getFloorNumber());
                    System.out.println(this.getP().getPlayerName() + " has reached " + this.getP().getFloor().toString());
                    this.setScore(this.getScore() + this.getP().getFloor().getFloorBonus());
                    System.out.println("Total points " + this.getScore());
                }
            }
        }
    }
}
