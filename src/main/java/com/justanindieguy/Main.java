package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;
import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Person person = context.getBean(Person.class);
    Vehicle vehicle = context.getBean(Vehicle.class);
    System.out.println("Person bean from Context: " + person);
    System.out.println("Vehicle bean from Context: " + vehicle);
    System.out.println("Vehicle that person owns: " + person.getVehicle());
  }

}