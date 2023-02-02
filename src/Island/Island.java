package Island;

public class Island {
    String name;
    int area;
    public void Capital() {
        System.out.println("Welcome to New Providence!");
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
