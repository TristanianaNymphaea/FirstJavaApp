package marketplace.user;

public class User {
  public long id;
  public String firstName;
  public String lastName;
  public double amountOfMoney;

  public User(long id, String firstName, String lastName, double amountOfMoney) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.amountOfMoney = amountOfMoney;
  }
}
