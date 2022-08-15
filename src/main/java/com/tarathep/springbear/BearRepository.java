package com.tarathep.springbear;

import org.springframework.stereotype.Repository;


@Repository
public class BearRepository {
    
    public String sound(int id){
        if (id == 100){
            return new Bear("Roar").getSound();
        }
        if (id == 101) {
            return new Bear("Growl").getSound();
        }
        return null;
    }
}
