/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava;

/**
 *
 * @author user
 */
public class LatihanJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Christianfrans christianfrans = new Christianfrans();
        System.out.println(christianfrans.first_attribute);
        System.out.println(christianfrans.second_attribute);
        System.out.println(christianfrans.third_attribute);
        christianfrans.printHello();
        christianfrans.sendHello();
        
        System.out.println("");
        
        //Polymorphism
        Operational op = new Operational();
        op.operation("Hello World");
        op.operation(1);
        op.operation(50, 10);
        
        System.out.println("");
        
        //Polymorphism Cat & Dog
        Animal x = new Cat();
        x.sound();
        
        Animal y = new Dog();
        y.sound();
        
        System.out.println("");
        
        //Abstraction
        Employee emp = new Employee();
        emp.sendEmail("cfm29@gmail.com", "Halo Guys");
        
        System.out.println("");
        
        Book book = new Book();
        book.setTitle("Marmut Merah Marun");
        book.setISBN("193728462");
        book.setPrice(75000);
        book.setYear("2014");
        
        System.out.println(book.getTitle());
        System.out.println(book.getISBN());
        System.out.println(book.getPrice());
        System.out.println(book.getYear());
    }
    
}
