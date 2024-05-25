public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3,4);
        Triangolo triangolo = new Triangolo(4,5);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}