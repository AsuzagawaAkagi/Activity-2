import java.util.Scanner;
    public class Candy_Machine {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int itemsToBuy;
            int totalCost = 0;

            System.out.println(" Products              Cost");
            System.out.println("[1] Milkita                13");
            System.out.println("[2]  Toblerone         44");
            System.out.println("[3]  Yakee          12");
            System.out.println("[4]  Champi           13");
            System.out.println("[5]  Kisses         52");
            System.out.println("[6]  Fres                47");
            System.out.println("[7]  Dairy Milk        28");
            System.out.println("[8]  Mentos               19");
            System.out.println("[9]  Chubby           28");
            System.out.println("[10] KitKat  22");
            System.out.println();

            System.out.print("How many items do you want to buy?: ");
            itemsToBuy = sc.nextInt();

            int[] itemsBought = new int[itemsToBuy];

            System.out.println("Enter product number: ");
            for(int i = 0; i < itemsToBuy; i++) {
                itemsBought[i] =  sc.nextInt();
            }

            // Display items bought
            System.out.println();
            System.out.println("Items bought: ");
            for(int i = 0; i < itemsToBuy; i++) {
                if(itemsBought[i] == 1) {
                    System.out.println("Milkita          13");
                } else if (itemsBought[i] == 2) {
                    System.out.println("Toblerone    44");
                } else if (itemsBought[i] == 3) {
                    System.out.println("Yakee      12");
                } else if (itemsBought[i] == 4) {
                    System.out.println("Champi      13");
                } else if (itemsBought[i] == 5) {
                    System.out.println("Kisses      52");
                } else if (itemsBought[i] == 6) {
                    System.out.println("Fres           47");
                } else if (itemsBought[i] == 7) {
                    System.out.println("Dairy Milk   28");
                } else if (itemsBought[i] == 8) {
                    System.out.println("Mentos         19");
                } else if (itemsBought[i] == 9) {
                    System.out.println("Chubby       28");
                } else if (itemsBought[i] == 10) {
                    System.out.println("KitKat 22");
                }
            }
            System.out.println();

            System.out.print("Total cost: ");
            for(int i = 0; i < itemsToBuy; i++) {
                if(itemsBought[i] == 1) {
                    totalCost += 13;
                } else if (itemsBought[i] == 2) {
                    totalCost += 44;
                } else if (itemsBought[i] == 3) {
                    totalCost += 12;
                } else if (itemsBought[i] == 4) {
                    totalCost += 13;
                } else if (itemsBought[i] == 5) {
                    totalCost += 52;
                } else if (itemsBought[i] == 6) {
                    totalCost += 47;
                } else if (itemsBought[i] == 7) {
                    totalCost += 28;
                } else if (itemsBought[i] == 8 ) {
                    totalCost += 19;
                } else if (itemsBought[i] == 9) {
                    totalCost += 28;
                } else if (itemsBought[i] == 10) {
                    totalCost += 22;
                }
            }
            System.out.print(totalCost);

        }
    }
