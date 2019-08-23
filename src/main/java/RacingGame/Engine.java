package RacingGame;

public class Engine {
    public double cc;
    public float horsepower;
    public int gears;
    public int year;
    public double km;
    public int sizereservoir;
    public double aboutkm;
    public int cadence;
    public int speed;
    public int gear ;


    public Engine(int cc) {
        this.cc = 1.9;
    }
    public Engine(float h) {
        this.horsepower =190;
    }
    public Engine(int year,  int sizereservoir) {
        this.year =2012;
        this.sizereservoir =60;
    }
    public Engine(double km) {
        this.km = 200000;
    }
    public double Engine(double acsm) {
        this.aboutkm = acsm;
        return 0;
    }
    void changeCadence(int newValue) {
        cadence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed = speed + increment;
    }
    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

}





