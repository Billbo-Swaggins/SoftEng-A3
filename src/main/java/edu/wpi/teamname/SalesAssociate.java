package edu.wpi.teamname;

public class SalesAssociate extends Employee {

  public SalesAssociate(String employeeName, long salesID) {
    super(employeeName, salesID);
  }

  public SalesAssociate(String employeeName, long salesID, SalesManager manager) {
    super(employeeName, salesID, manager);
  }

  double bonus() {
    int numClients = this.getNumClients();
    return numClients * 500;
  }
}
