package org.techhub;
import java.util.*;

class Player implements Comparable<Player> {

    private int id;
    private String name;
    private int run;

    public Player() {}

    public Player(String name, int id, int run) {
        this.name = name;
        this.id = id;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    @Override
    public int compareTo(Player p) {
        return this.name.compareTo(p.name); // sorting by name
    }
}

public class CollectionsApplication {

    public static void main(String[] args) {

       
        List<Player> empList = new ArrayList<>();

        empList.add(new Player("ABC", 1, 10000));
        empList.add(new Player("MNO", 3, 20000));
        empList.add(new Player("XYZ", 2, 40000));
        empList.add(new Player("STV", 5, 4000));
        empList.add(new Player("ABCD", 4, 20000));

        System.out.println("Display data before sorting");

        for (Player p : empList) {
            System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
        }

        Collections.sort(empList);

        System.out.println("\nDisplay data after sorting");

        for (Player p : empList) {
            System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getRun());
        }
    }
}