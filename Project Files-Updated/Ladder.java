package Assignment_3;

public class Ladder extends Floor{
    //constructor
    public Ladder(int f_no, int f_des){
        super(f_no);
        this.setFloorBonus(2);
        this.setFloorDes(f_des);
    }

    @Override
    public String toString(){
        return "a Ladder Floor";
    }

}
