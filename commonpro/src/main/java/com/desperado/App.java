package com.desperado;

import com.desperado.bean.Car;
import com.desperado.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Car car = (Car) applicationContext.getBean("Car");
//        System.out.print(car.toString());

        Person person = (Person) applicationContext.getBean("Person");
        System.out.println(person);
    }
}
