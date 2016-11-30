/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person.employee;

import business.person.Person;

/**
 *
 * @author raseswaridas
 */
public class Employee extends Person {
    
    private int id;
    private static int count = 0;
    
    public Employee (){
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }
    
}