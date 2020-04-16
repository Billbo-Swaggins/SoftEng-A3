package edu.wpi.teamname;

import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

    SalesManager sam = new SalesManager("Sam", 3);
    SalesManager charlie = new SalesManager("Charlie", 4);
    SalesAssociate sven = new SalesAssociate("Sven", 7);
    SalesAssociate alex = new SalesAssociate("Alex", 20);

    Client jo = new Client("Jo", 32);
    Client riley = new Client("Riley", 473);
    Client peyton = new Client("Peyton", 555);
    Client avery = new Client("Avery", 654);
    Client taylor = new Client("Taylor", 840);
    Client remi = new Client("Remi", 912);

    // setting managers
    sven.setManager(charlie);
    charlie.addEmployee(sven);

    alex.setManager(sam);
    sam.addEmployee(alex);

    // setting clients
    sam.addClient(jo);
    jo.setSalesEmployee(sam);
    sam.addClient(riley);
    riley.setSalesEmployee(sam);

    charlie.addClient(avery);
    avery.setSalesEmployee(charlie);

    sven.addClient(peyton);
    peyton.setSalesEmployee(sven);

    alex.addClient(taylor);
    taylor.setSalesEmployee(alex);
    alex.addClient(remi);
    remi.setSalesEmployee(alex);

    printManager(sam);
    printManager(charlie);
    printAssociate(sven);
    printAssociate(alex);
    printClient(jo);
    printClient(riley);
    printClient(peyton);
    printClient(avery);
    printClient(taylor);
    printClient(remi);
  }

  private static void printManager(SalesManager manager)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
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
    for (int i = 0; i < manager.obtainClients().size(); i++) {
      Client temp = manager.obtainClients().get(i);
      System.out.print(String.format(" %s %d", temp.getClientName(), temp.getClientID()));
      if (i != manager.obtainClients().size() - 1) {
        System.out.print(", ");
      } else {
        System.out.print("\n");
      }
    }
  }

  private static void printAssociate(SalesAssociate associate)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    System.out.print(String.format("Sales Associate: %s. ", associate.getEmployeeName()));
    System.out.print(
        String.format("Sales Manager: %s. ", associate.getManager().getEmployeeName()));
    System.out.print("Clients:");
    for (int i = 0; i < associate.obtainClients().size(); i++) {
      Client temp = associate.obtainClients().get(i);
      System.out.print(String.format(" %s %d", temp.getClientName(), temp.getClientID()));
      if (i != associate.obtainClients().size() - 1) {
        System.out.print(", ");
      } else {
        System.out.print("\n");
      }
    }
  }

  private static void printClient(Client client) {
    Employee temp = client.getSalesEmployee();
    if (temp instanceof SalesManager) {
      System.out.print(
          String.format(
              "Client: %s. Sales Employee: %s\n",
              client.getClientName(), ((SalesManager) temp).getEmployeeName()));

    } else if (temp instanceof SalesAssociate) {
      System.out.print(
          String.format(
              "Client: %s. Sales Employee: %s\n",
              client.getClientName(), ((SalesAssociate) temp).getEmployeeName()));
    }
  }
}
