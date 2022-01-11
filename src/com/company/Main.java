package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {

     AutoBase autoBase1 = new AutoBase();

        autoBase1.setName("Mercedes");
        autoBase1.setDrive("");
        autoBase1.setState(String.valueOf(Enum2.BASE));
        AutoBase  autoBase2 = new AutoBase();
        autoBase2.setId(2);
        autoBase2.setName("Toyota");
        autoBase2.setDrive("");
        autoBase2.setState(String.valueOf(Enum2.BASE));
        AutoBase autoBase3 = new AutoBase();
        autoBase3.setId(3);
        autoBase3.setName("DAF XT");
        autoBase3.setDrive("Sultan");
        autoBase3.setState(String.valueOf(Enum2.BASE));
        AutoBase[] cars = {new AutoBase(1, autoBase1.getName(), autoBase1.getDrive(), autoBase1.getState()),
                new AutoBase(2, autoBase2.getName(), autoBase2.getDrive(), autoBase2.getState()),
                new AutoBase(3, autoBase3.getName(), autoBase3.getDrive(), autoBase3.getState()),};
        String heart = GSON.toJson(cars);
        summer(heart);




        System.out.println("-----------------Truks----------------------");
        System.out.println("# | Bus          | Driver          |State   ");
        System.out.println("--+--------------+-----------------+--------");
        System.out.print(autoBase1.getId() + " |");
        System.out.print(autoBase1.getName() + "\t\t |");
        System.out.println("\t\t\t\t   |" + autoBase1.getState());
        System.out.println(autoBase2.getId() + " |" + autoBase2.getName() + "\t\t | \t\t\t\t   |" + autoBase2.getState());
        System.out.println(autoBase3.getId() + " |" + autoBase3.getName() + "\t\t | \t\t\t\t   |" + autoBase3.getState());
        System.out.println("-------------------------------------------\n");
        Scanner sum = new Scanner(System.in);
        Scanner san = new Scanner(System.in);

        System.out.print("Chooice truck: ");
        int a = sum.nextInt();
        int v = san.nextInt(4);
        System.out.println("------------------Truks-info-------------------");
        if (a == autoBase1.getId()) {
            System.out.println("N       : " + a + "\nBus     : " + autoBase1.getName() + "\nDriver  : " + "\nBusState: " + autoBase1.getState() + "\n");
            System.out.println("Press 1 to change Driver\nPress 2 to send t ote Route\nPress 3 to send to the Repair ");
            System.out.print("Write here: ");
        } else if (a == autoBase2.getId()) {
            System.out.println("N       : " + a + "\nBus     : " + autoBase2.getName() + "\nDriver  :  \nBusState: " + autoBase2.getState() + "\n");
            System.out.println("Press 1 to change Driver\nPress 2 to send t ote Route\nPress 3 to send to the Repair ");
            System.out.print("Write here ");
        } else if (a == autoBase3.getId()) {
            System.out.println("N       : " + a + "\nBus     : " + autoBase3.getName() + "\nDriver  :  \nBusState: " +
                    autoBase3.getState() + "\n");
            System.out.println("Press 1 to change Driver\nPress 2 to send t ote Route\nPress 3 to send to the Repair ");
            System.out.print("Write here: ");
        } else {
            System.out.println("go stil !!!");
        }
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        Object rц = Enum2.BASE;
        Object rц1 = Enum2.BASE;
        Object rц2 = Enum2.BASE;
        Object r = Enum2.BASE;
        Object r1 = Enum2.BASE;
        Object r2 = Enum2.BASE;
        String q = "";
        String w = "";
        String e = "";
        String q1 = "      ";
        String w1 = "      ";
        String e1 = "      ";

        switch (s) {
            case 1:
                System.out.println("----------------------------------");
                System.out.println("      Driver changed succesfuly");
                System.out.println("----------------------------------\n");

                System.out.println("# | id   | Driver      | Bus");
                System.out.println("--+------+-------------+------");

                if (a == autoBase1.getId()) {
                    q = autoBase1.getName();
                } else if (a == autoBase2.getId()) {
                    w = autoBase2.getName();
                } else if (a == autoBase3.getId()) {
                    e = autoBase3.getName();
                }
                if (a == autoBase1.getId()) {
                    q1 = autoBase1.getDrive();
                } else if (a == autoBase2.getId()) {
                    w1 = autoBase2.getDrive();
                } else if (a == autoBase3.getId()) {
                    e1 = autoBase3.getDrive();
                }
                System.out.println(" 1| dr-1 |" + autoBase1.getDrive() + "\t   |" + q);
                System.out.println(" 2| dr-2 |" + autoBase2.getDrive() + "\t   |" + w);
                System.out.println(" 3| dr-3 |" + autoBase3.getDrive() + "\t   |" + e + "\n");
                System.out.println("-----------------Truks----------------------");
                System.out.println("# | Bus          | Driver          |State   ");
                System.out.println("--+--------------+-----------------+--------");
                System.out.println(autoBase1.getId() + " |" + autoBase1.getName() + "\t\t | " + q1 + "\t\t   |" + autoBase1.getState());
                System.out.println(autoBase2.getId() + " |" + autoBase2.getName() + "\t\t | " + w1 + "\t\t   |" + autoBase2.getState());
                System.out.println(autoBase3.getId() + " |" + autoBase3.getName() + "\t\t | " + e1 + "\t\t   |" + autoBase3.getState());
                System.out.println("-------------------------------------------\n");
                break;
            case 2:
                if (a == autoBase1.getId()) {
                    r = Enum2.ROUTE;
                } else if (a == autoBase2.getId()) {
                    r1 = Enum2.ROUTE;
                } else if (a == autoBase3.getId()) {
                    r2 = Enum2.ROUTE;
                }
                System.out.println(" 1| dr-1 |" + autoBase1.getDrive() + "\t   |" + q);
                System.out.println(" 2| dr-2 |" + autoBase2.getDrive() + "\t   |" + w);
                System.out.println(" 3| dr-3 |" + autoBase3.getDrive() + "\t   |" + e + "\n");
                System.out.println("-----------------Truks----------------------");
                System.out.println("# | Bus          | Driver          |State   ");
                System.out.println("--+--------------+-----------------+--------");
                System.out.println(autoBase1.getId() + " |" + autoBase1.getName() + "\t\t | " + q1 + "\t\t   |" + r);
                System.out.println(autoBase2.getId() + " |" + autoBase2.getName() + "\t\t | " + w1 + "\t\t   |" + r1);
                System.out.println(autoBase3.getId() + " |" + autoBase3.getName() + "\t\t | " + e1 + "\t\t   |" + r2);
                System.out.println("-------------------------------------------\n");
            case 3:
                if (a == autoBase1.getId()) {
                    rц = Enum2.REPAIR;
                } else if (a == autoBase2.getId()) {
                    rц1 = Enum2.REPAIR;
                } else if (a == autoBase3.getId()) {
                    rц2 = Enum2.REPAIR;
                }
                System.out.println(" 1| dr-1 |" + autoBase1.getDrive() + "\t   |" + q);
                System.out.println(" 2| dr-2 |" + autoBase2.getDrive() + "\t   |" + w);
                System.out.println(" 3| dr-3 |" + autoBase3.getDrive() + "\t   |" + e + "\n");
                System.out.println("-----------------Truks----------------------");
                System.out.println("# | Bus          | Driver          |State   ");
                System.out.println("--+--------------+-----------------+--------");
                System.out.println(autoBase1.getId() + " |" + autoBase1.getName() + "\t\t | " + q1 + "\t\t   |" + rц);
                System.out.println(autoBase2.getId() + " |" + autoBase2.getName() + "\t\t | " + w1 + "\t\t   |" + rц1);
                System.out.println(autoBase3.getId() + " |" + autoBase3.getName() + "\t\t | " + e1 + "\t\t   |" + rц2);
                System.out.println("-------------------------------------------\n");
            default:
                break;
        }

    }
    private static void summer(String hello){
        Path writer = Paths.get("salam");

        try {
            Files.writeString(writer,hello, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            e.getStackTrace();
        }
    }


}




