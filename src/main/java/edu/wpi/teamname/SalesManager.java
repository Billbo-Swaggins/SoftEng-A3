package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesManager extends Employee {

  protected String employeeName;
  private ArrayList<Employee> employees;
  protected SalesManager manager;
  protected long salesID;

  public SalesManager(String employeeName, long salesID) {
    super();
    this.employeeName = employeeName;
    this.salesID = salesID;
    this.employees = new ArrayList<>();
  }

  protected String getEmployeeName() {
    return employeeName;
  }

  protected void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  protected ArrayList<Employee> getEmployees() {
    return employees;
  }

  protected void addEmployee(Employee employee) {
    employees.add(employee);
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
    return numClients * 10000;
  }
}
