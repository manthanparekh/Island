package Island;

public class Exuma extends Island {
    public void Display() {
        System.out.println("This is the island of " + name + " and has area of " + area + " sqr miles");
    }
    @Override
    public void Capital() {
        System.out.println("Welcome to Georgetown!");
    }
}
