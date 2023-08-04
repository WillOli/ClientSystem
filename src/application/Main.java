package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
//        Client cli = new Client("william", "william@gmail.com", sdf.parse("07/01/1989"));
//        System.out.println(cli);

        /*Final test*/
        System.out.println("Enter client data");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);



        System.out.println("Enter order data: ");
        System.out.println("status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            System.out.println("Enter #" + (i) + " item data");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);




        sc.close();






    }
}