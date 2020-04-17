package edu.wpi.teamname;

import java.util.ArrayList;

public class SalesManager extends Employee {

  private ArrayList<Employee> employees;

  public SalesManager(String employeeName, long salesID) {
    super(employeeName, salesID);
    this.employees = new ArrayList<>();
  }

  public SalesManager(String employeeName, long salesID, SalesManager manager) {
    super(employeeName, salesID, manager);
    this.employees = new ArrayList<>();
  }

  protected ArrayList<Employee> getEmployees() {
    return employees;
  }

  protected void addEmployee(Employee employee) {
    employees.add(employee);
  }

  double bonus() {
    int numClients = this.getNumClients();
    return numClients * 10000;
  }
}
