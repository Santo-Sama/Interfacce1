public class Rettangolo implements Forma {

    private double base;
    private double altezza;

    Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }


    @Override
    public double calcolaArea() {

        return base*altezza;
    }
}
