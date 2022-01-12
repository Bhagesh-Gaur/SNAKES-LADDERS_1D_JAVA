package Assignment_3;

public class Cobra extends Snake{
    //constructor
    public Cobra(int f_no, int f_des){
        super(f_no, f_des);
        this.setFloorBonus(-4);
    }

    @Override
    public String toString(){
        return "a King Cobra Floor";
    }
}
