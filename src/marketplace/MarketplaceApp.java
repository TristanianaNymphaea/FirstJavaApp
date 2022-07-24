package marketplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import marketplace.product.Product;
import marketplace.user.User;

public class MarketplaceApp {

  private static final String HELLO_MSG = "Welcome dear client! Please type your id";
  private static Product product1 = new Product(1, "Lipstick rose", 499.99);
  private static Product product2 = new Product(2, "Mascara", 749.99);
  private static Product product3 = new Product(3, "nailPolish", 299.99);
  private static User userIra = new User(23456, "Ira", "Mikhaskiv", 8500.00);
  private static User userOksana = new User(56789, "Oksana", "Suslik", 8900.00);
  private static User userOlena = new User(97654, "Olena", "Pytik", 9900.50);


  public static void main(String[] args) throws IOException {

    System.out.println(HELLO_MSG);
    BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

    String command = reader.readLine();

    User selectedUser = checkUser(Integer.parseInt(command));

    if(selectedUser != null){
      System.out.println("Hello " + selectedUser.firstName);
    }
  }

  public static User checkUser(int id) {
    switch (id) {
      case 23456:
        return userIra;
      case 56789:
        return userOksana;
      case 97654:
        return userOlena;
      default:
        return null;
    }
  }
}
