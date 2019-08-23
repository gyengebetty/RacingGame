package RacingGame;

public class Car {
    public static void main(String[]args){
        CarLook look=new CarLook(300 , 4);
        Engine engine=new Engine(2012,60);
        Engine engine2=engine;

        engine2.year=2001;
        engine2.km=30000;

        look.brand="Opel Vectra";
        look.length=300;
        look.colourCode='R';
        look.doors=4;

        engine.year=2012;
        engine.cc=1.9;
        engine.gears=6;
        engine.horsepower=190;
        engine.sizereservoir=60;
        engine.aboutkm=715;
        engine.changeCadence(50);
        engine.changeGear(3);
        engine.speedUp(4);

        System.out.println("My Racing car's is a :"+look.colourCode+ "  "+ engine.year+"  "+look.brand);
        System.out.println(look.colourCode);
        System.out.println("We can travel" +" "+ engine.aboutkm/engine.sizereservoir+ " "+ "km's distance"+  " consuming one liter of gas. ");
        System.out.println("cadence:"+engine.cadence+" speed:"+engine.speed+" gear:"+engine.gear);
System.out.println(engine.speed);





    }
}
