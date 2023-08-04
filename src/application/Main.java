package application;

import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        /*test 1*/
//        Product p = new Product("Tv", 1000.0);
//        OrderItem oi1 = new OrderItem(1, 1000.0, p);
//        System.out.println(oi1);

        /*test 2*/

        Client cli = new Client("william", "william@gmail.com", sdf.parse("07/01/1989"));

        System.out.println(cli);


        sc.close();






    }
}