public class Main {
    public static void main(String[] args) {

        int account = 574;
        int amountadded = 1347;
        int forbonus = 1000;
        int bonus = 1;

        int endbonus = (amountadded / 100);
        System.out.println(amountadded / 100);

        if (amountadded > 1000) {
            System.out.println(account + amountadded + endbonus);
        } else {
            System.out.println(account + amountadded);
        }
    }
}