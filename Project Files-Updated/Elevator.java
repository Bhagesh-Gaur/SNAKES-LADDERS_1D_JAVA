package Assignment_3;

public class Elevator extends Ladder{
    //constructor
    public Elevator(int f_no, int f_des){
        super(f_no, f_des);
        this.setFloorBonus(4);
    }

    @Override
    public String toString(){
        return "an Elevator Floor";
    }
}
