package edu.wpi.teamname;

import java.util.ArrayList;

public abstract class Employee {

  private ArrayList<Client> clientList;

  public Employee() {
    clientList = new ArrayList<>();
  }

  public boolean addClient(Client c) {
    for (int i = 0; i < clientList.size(); i++) {
      if (clientList.get(i).getClientID() > c.getClientID()) {
        clientList.add(i, c);
        return true;
      } else if (clientList.get(i).getClientID() == c.getClientID()) {
        return false;
      }
    }
    clientList.add(c);
    return true;
  }

  private ArrayList<Client> getClients() {
    return clientList;
  }

  int getNumClients() {
    return clientList.size();
  }

  void printManager(SalesManager manager) {
    System.out.print(String.format("Sales Manager: %s. ", manager.getEmployeeName()));
    System.out.print("Employees:");
    for (int i = 0; i < manager.getEmployees().size(); i++) {
      Employee temp = manager.getEmployees().get(i);
      if (temp instanceof SalesManager) {
        System.out.print(String.format(" %s", ((SalesManager) temp).getEmployeeName()));
      } else if (temp instanceof SalesAssociate) {
        System.out.print(String.format(" %s", ((SalesAssociate) temp).getEmployeeName()));
      }
    }
    System.out.print(". Clients:");
    for (int i = 0; i < manager.getNumClients(); i++) {
      Client temp = this.getClients().get(i);
      System.out.print(String.format(" %s %d", temp.getClientName(), temp.getClientID()));
      if (i != this.getNumClients() - 1) {
        System.out.print(", ");
      } else {
        System.out.print("\n");
      }
    }
  }

  void printAssociate(SalesAssociate associate) {
    System.out.print(String.format("Sales Associate: %s. ", associate.getEmployeeName()));
    System.out.print(
        String.format("Sales Manager: %s. ", associate.getManager().getEmployeeName()));
    System.out.print("Clients:");
    for (int i = 0; i < associate.getNumClients(); i++) {
      Client temp = this.getClients().get(i);
      System.out.print(String.format(" %s %d", temp.getClientName(), temp.getClientID()));
      if (i != associate.getNumClients() - 1) {
        System.out.print(", ");
      } else {
        System.out.print("\n");
      }
    }
  }
}
