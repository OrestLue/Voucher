
public class Main {

    public static void main(String[] args) {

        Voucher v = new Voucher();
        System.out.println(v.toString());

        v.resetValues("USA", 12, "TezTour", "Mark", 24, "Plane");
        System.out.println(v.toString());

        Voucher w = new Voucher();

        System.out.println(Voucher.printStaticQuantity());

    }
}
