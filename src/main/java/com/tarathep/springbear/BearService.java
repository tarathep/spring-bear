package com.tarathep.springbear;

import org.springframework.stereotype.Service;

@Service
public class BearService {
    private Bear bear;

    public BearService(){}
    
    public BearService(Bear bear){
        this.bear = bear;
    }

    public String say(){
        return this.bear.roar();
    }
}
