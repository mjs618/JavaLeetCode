package Practice;

class FreshJuice{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class EnumTest1 {


    public static void main(String[] args) {
        FreshJuice freshjuice = new FreshJuice();
        freshjuice.size = FreshJuice.FreshJuiceSize.SMALL;
        System.out.println(freshjuice.size );
    }
}
