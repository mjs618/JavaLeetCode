package Practice;

class Freshjuice{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class EnumTest1 {


    public static void main(String[] args) {
        Freshjuice freshjuice = new Freshjuice();
        freshjuice.size = Freshjuice.FreshJuiceSize.SMALL;
        System.out.println(freshjuice.size );
    }
}
