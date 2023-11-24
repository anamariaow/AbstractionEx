public class Triangolo extends Forma {
    public Triangolo(double lunghezza, double larghezza) {
        super(lunghezza, larghezza);
    }

    @Override
    public void calcolaArea() {
        double area = getLunghezza() * getLarghezza() / 2;
        System.out.println("Area triangolo: " + area);
    }
}
