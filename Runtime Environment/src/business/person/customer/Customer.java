/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person.customer;

import business.person.Person;

/**
 *
 * @author raseswaridas
 */
public class Customer extends Person {
    
    private int id;
    private static int count = 0;
    
    public Customer (){
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }
    
}