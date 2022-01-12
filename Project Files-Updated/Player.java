package Assignment_3;

public class Player {

    private String playerName;
    private Floor floor;

    //constructor
    public Player(){
        this.playerName = "Player Name not given";
        this.floor = new Floor(0);
    }

    public Player(String playerName){
        this.playerName = playerName;
        this.floor = new Floor(0);
    }

    //getters and setters
    public String getPlayerName(){
        return playerName;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }

    public Floor getFloor(){
        return floor;
    }

    public void setFloor(Floor floor){
        this.floor = floor;
    }
}
