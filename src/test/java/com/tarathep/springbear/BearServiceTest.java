package com.tarathep.springbear;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BearServiceTest {
    @Mock
    BearRepository bearRepository;

    @InjectMocks
    BearService bearService;

    @Test
    public void testItShoudReturnSayFromBearTypeA(){

        when(bearRepository.sound(100)).thenReturn("xxx!");

        String actual = bearService.say("A");
        assertEquals("xxx!", actual);

        verify(bearRepository,times(1)).sound(100);
    }

    @Test
    public void testItShoudReturnSayFromBearTypeB(){

        when(bearRepository.sound(101)).thenReturn("yyy!");

        String actual = bearService.say("B");
        assertEquals("yyy!", actual);

        verify(bearRepository,times(1)).sound(101);
    }

    @Test
    public void testItShoudReturnSayFromBearOtherTypes(){
        String actual = bearService.say("X");
        assertEquals("Ops!", actual);
    }
}
