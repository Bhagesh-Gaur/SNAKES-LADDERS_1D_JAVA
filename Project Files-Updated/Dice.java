package Assignment_3;

import java.util.Random;

public class Dice {
    private final int f_count;
    private int outcome;

    public void roller(){
        Random rand = new Random();
        int outcome = 1 + rand.nextInt(f_count);
        setoutcome(outcome);
    }

    public Dice(){
        f_count = 2;
        roller();
    }

    private void setoutcome(int o){
        if(o <= f_count){
            this.outcome = o;
        }
    }

    public int getoutcome(){
        return this.outcome;
    }

    public int getfacecount(){
        return this.f_count;
    }
}
