public class Main {
    public static void main(String[] args) {

        int account = 574;
        int amountAdded = 980;
        int forBonus = 1000;

        int endBonus = (amountAdded / 100);

        {
            if (endBonus > 10) {
                System.out.println(endBonus);
            } else {
                System.out.println(0);
            }
        }

        System.out.println();

        if (amountAdded > 1000) {
            System.out.println(account + amountAdded + endBonus);
        } else {
            System.out.println(account + amountAdded);
        }
    }
}