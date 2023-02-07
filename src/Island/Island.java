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
        Exuma Exuma_info = new Exuma();

        Exuma_info.name = "Exuma";
        Exuma_info.area= 150;
        Andros_info.name = "Andros";
        Andros_info.area = 300;

        Exuma_info.Display();
        Exuma_info.Capital();
        Andros_info.Display();
        Andros_info.Capital();
    }
}
