package edu.wpi.teamname;

public class Main {

  public static void main(String[] args) {

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

    sam.printManager(sam);
    charlie.printManager(charlie);
    sven.printAssociate(sven);
    alex.printAssociate(alex);
    jo.printClient();
    riley.printClient();
    peyton.printClient();
    avery.printClient();
    taylor.printClient();
    remi.printClient();
  }
}
