public class Rettangolo extends Forma {
    public Rettangolo(double lunghezza, double larghezza) {
        super(lunghezza, larghezza);
    }
    @Override
    public void calcolaArea() {
        double area = getLarghezza() * getLunghezza();
        System.out.println("Area rettangolo: " + area);
    }
}