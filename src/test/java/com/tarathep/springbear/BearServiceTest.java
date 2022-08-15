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
    Bear bear;

    @InjectMocks
    BearService bearService;

    @Test
    public void testItShoudReturnHelloFromBear(){
        when(bear.roar()).thenReturn("Grrrrr!");

        String actual = bearService.say();
        assertEquals("Grrrrr!", actual);

        verify(bear,times(1)).roar();
    }
}
