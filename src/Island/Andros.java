package Island;

public class Andros  extends Island {

    public void Display() {
        System.out.println("This is the island of " + name + " and has area of " + area + " sqr miles");
    }
    @Override
    public void Capital() {
        System.out.println("Welcome to the Nicholls Town!");
    }
}

class Main {
    public static void main(String[] args) {
        Andros Andros_info = new Andros();

        Andros_info.name = "Andros";
        Andros_info.area = 300;

        Andros_info.Display();

        Andros_info.Capital();
    }
}

