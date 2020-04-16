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
}
