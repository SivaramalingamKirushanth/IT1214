class Car {
  String model; // Instance variable
  int speed;
  void display() {
    System.out.println("Model: " + model + ", Speed: "
    + speed);
  }
}

public class Main {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.model = "Toyota";
    myCar.speed = 120;
    myCar.display();
  }
}
