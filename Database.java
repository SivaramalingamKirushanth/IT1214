import java.util.*;
public class Database{
  //  ArrayList<Customer> customers=new ArrayList<>();
  //  ArrayList<Item> items=new ArrayList<>();
  //Change made by 62

    static void printMenue(){
        System.out.println("------ Inventory Management ------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. List all items");
        System.out.println("5. Add Customer");
        System.out.println("6. List all Customers");
        System.out.println("7. Search Item by Name");
        System.out.println("0. Exit");
        System.out.println("Choose an Option");   
    }

    public static select(int choice){
        Switch(choice){


        }
    }

    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int option;
        do{
            printMenue();
            option=sc.nextInt();
        }while(option!=0);

    }rhyruyu
}
