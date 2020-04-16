package edu.wpi.teamname;

public class Client {
  private int clientID;
  private String clientName;
  private Employee salesEmployee;

  public Client(String clientName, int clientID) {
    this.clientID = clientID;
    this.clientName = clientName;
  }

  public Employee getSalesEmployee() {
    return salesEmployee;
  }

  public void setSalesEmployee(Employee salesEmployee) {
    this.salesEmployee = salesEmployee;
  }

  protected int getClientID() {
    return clientID;
  }

  protected void setClientID(int clientID) {
    this.clientID = clientID;
  }

  protected String getClientName() {
    return clientName;
  }

  protected void setClientName(String clientName) {
    this.clientName = clientName;
  }

  double totalSales() {
    return 0;
  }
}
