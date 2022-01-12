package Assignment_3;

public class Floor {

    private int floorNumber;
    private int floorBonus;
    private int floorDes;

    //constructors
    public Floor(int f_no){
        this.floorNumber = f_no;
        this.floorBonus = 1;
        this.floorDes = f_no;
    }

//    public Floor(int f_no, Ladder l_type){
//        this.f_no = f_no;
//        this.l_type = l_type;
//        this.s_type = null;
//    }
//
//    public Floor(int f_no){
//        this.f_no = f_no;
//        this.l_type = null;
//        this.s_type = null;
//    }

    //getters and setters


    public int getFloorNumber(){
        return floorNumber;
    }

    public int getFloorBonus(){
        return floorBonus;
    }

    public int getFloorDes(){
        return floorDes;
    }

    public void setFloorNumber(int floorNumber){
        this.floorNumber = floorNumber;
    }

    public void setFloorBonus(int floorBonus){
        this.floorBonus = floorBonus;
    }

    public void setFloorDes(int floorDes){
        this.floorDes = floorDes;
    }

    @Override
    public String toString(){
        return "an Empty Floor";
    }

}
