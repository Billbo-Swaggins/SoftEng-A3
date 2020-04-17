package edu.wpi.teamname;

public class SalesAssociate extends Employee {

  protected String employeeName;
  protected SalesManager manager;
  protected long salesID;

  public SalesAssociate(String employeeName, long salesID) {
    super();
    this.employeeName = employeeName;
    this.salesID = salesID;
  }

  protected String getEmployeeName() {
    return employeeName;
  }

  protected void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  protected SalesManager getManager() {
    return manager;
  }

  protected void setManager(SalesManager manager) {
    this.manager = manager;
  }

  protected long getSalesID() {
    return salesID;
  }

  protected void setSalesID(long salesID) {
    this.salesID = salesID;
  }

  double bonus() {
    int numClients = this.getNumClients();
    return numClients * 500;
  }
}
