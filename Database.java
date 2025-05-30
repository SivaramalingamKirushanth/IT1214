import java.util.*;
public class Database{
  //  ArrayList<Customer> customers=new ArrayList<>();
  //  ArrayList<Item> items=new ArrayList<>();
  

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
      			switch(option){
      				case 1:
      					System.out.print("Please enter Item Name           :");
      					String name = scan.nextLine();
      					
      					System.out.print("Please enter Description         :");
      					String description = scan.nextLine();
      					
      					System.out.print("Please enter Unit Price          :");
      					int Price = Integer.parseInt(scan.nextLine());
      					
      					System.out.print("Please enter Quantity Available  :");
      					int Quantity = Integer.parseInt(scan.nextLine());
      					
      					Item item = new Item(name, description, Price, Quantity);
      					db.addItem(item);
      					break;
      					
      				case 2:
      					System.out.print("Please enter Item Name to remove");
      					String name = scan.nextLine();
      					db.removeItem(name);
      					break;

              case 3:
      					//Add method here
      					break;

              case 4:
      					//Add method here
      					break;
                
      				case 5:
      					//Add method here
      					break;

              case 6:
      					//Add method here
      					break;

              case 7:
                //Add method here
      					break;
                
      				case 0:
      					system = 0;
      					break;
      			}
        }while(option!=0);

    }
}
