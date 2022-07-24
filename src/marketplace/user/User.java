package marketplace.user;

public class User {
  public int id;
  public String firstName;
  public String lastName;
  public double amountOfMoney;

  public User(int id, String firstName, String lastName, double amountOfMoney) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.amountOfMoney = amountOfMoney;
  }
}
