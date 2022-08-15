package com.tarathep.springbear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BearService {

    @Autowired
    private BearRepository bearRepository;

    public String say(String types){
        switch(types){
            case "A":return bearRepository.sound(100);
            case "B":return bearRepository.sound(101);
            default:return "Ops!";
        }
    }
}
