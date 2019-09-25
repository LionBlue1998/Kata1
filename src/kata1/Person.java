/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author LionBlue98
 */
public class Person {
    private final String name;
    private final Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        long ms = new Date().getTime() - birthday.getTime();
        return toYears(ms);
    }

    private int toYears(long ms) {
        return ms / 
    }
    
    
    
    
}
