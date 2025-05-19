import java.util.*;

class Item{
    String name;
    int price;
    Item(String name,int price){
        this.name=name;
        this.price=price;
    }
}

class Invoice{
    
    List <Item>  items=new ArrayList<Item>();
    
    void addItems(){

        items.add(new Item("Milk",1060));
        items.add(new Item("Soap",106));
        items.add(new Item("Pen",100));
        items.add(new Item("Paper",700));
        items.add(new Item("Bread",160));
    }

    
}

class ShopDemo{
    public static void main(String[] args){
        Invoice i=new Invoice();
        i.addItems();
        for(Item e: i.items){
            System.out.println("Item is "+e.name+" Price is "+e.price);
        }

        ArrayList al=new ArrayList();
        al.add("a");
        al.add("b");
        al.add(2);

        for(int j=0;j<al.size();j++){
            System.out.println(al.get(j));
        }

    }
}