package edu.wpi.teamname;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

  double bonus() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    ArrayList<Client> list = obtainClients();

    int numClients = list.size();

    return numClients * 10000;
  }

  protected ArrayList<Client> obtainClients() // IMPORTANTE WE CAN'T USE THIS!!!
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    Method getClientMethod = Employee.class.getDeclaredMethod("getClients");
    getClientMethod.setAccessible(true);
    ArrayList<Client> list = (ArrayList<Client>) getClientMethod.invoke(this);

    return list;
  }
}
