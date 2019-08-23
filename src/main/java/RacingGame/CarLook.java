package RacingGame;


public class CarLook {
    public String brand;
    public char model;
    public int doors;
    public char colourCode;
    public int length;


    public  CarLook(String br, char mdl) {
        this.brand = br;
        this.model = mdl;
    }
    public CarLook(int d , int l) {
        this.doors = d;
        this.length=l;
    }
    public CarLook(char c){
        this.colourCode=c;
    }

}
