package Assignment_3;

public class Snake extends Floor{
    //constructor
    public Snake(int f_no, int f_des){
        super(f_no);
        this.setFloorBonus(-2);
        this.setFloorDes(f_des);
    }

    @Override
    public String toString(){
        return "a Snake Floor";
    }

}
