public class GroceryShopTest {
    public static void main(String[] args) {
        System.out.println("begin main");
        GroceryShop GroceryShopcustomer1 = new Customerbalance(20, "Michael", 570);
        GroceryShop GroceryShopcustomer2 = new Customerbalance(42, "Samridh", 1408);
        GroceryShop GroceryShopcustomer3 = new Customerbalance(152, "Dawa", 892);

        GroceryShopcustomer1.printGroceryShop();
        GroceryShopcustomer2.printGroceryShop();
        GroceryShopcustomer3.printGroceryShop();

        GroceryShopcustomer1.amountspend(5);
        GroceryShopcustomer2.amountrefund(6);
        GroceryShopcustomer3.amountspend(8);

        GroceryShopcustomer1.printGroceryShop();
        GroceryShopcustomer2.printGroceryShop();
        GroceryShopcustomer3.printGroceryShop();


        System.out.println("end main..");
        }
    }
class GroceryShop
{
    private int CustomerNumber;
    private String CustomerName;
    private double CustomerCashinHand;
    GroceryShop(int CustomerNumber, String CustomerName, double CustomerCashinHand) {
        System.out.println("Constructor is setting the initial details...");
        this.CustomerNumber = CustomerNumber;
        this.CustomerName = CustomerName;
        this.CustomerCashinHand = CustomerCashinHand;
    }

    void printBankAccount() {
        System.out.println("Customer Number  : "+CustomerNumber);
        System.out.println("Customer Name  : "+CustomerName);
        System.out.println("Customer CashinHand : "+CustomerCashinHand);
        System.out.println("----------------------------");
    }
    void withdraw(double amountspend) {
        System.out.println("amountspend...."+amountspend);
        CustomerCashinHand = CustomerCashinHand - amountspend;
    }
    void deposit(double amountrefund) {
        System.out.println("amountspend...."+amountrefund);
        CustomerCashinHand = CustomerCashinHand + amountrefund;
    }

}