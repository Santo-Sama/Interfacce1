public class Triangolo implements Forma{

    private double base;
    private double altezza;

    Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea() {

        return (base*altezza)/2;
    }
}
