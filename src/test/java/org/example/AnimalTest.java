package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class AnimalTest {
           private AnimalTest ani;
           Animal an= new Animal("Sport","black");

    @Before
    public void setUp() throws Exception {
        ani= new AnimalTest();
    }

    @Test
    public void getName() {
        Assert.assertEquals("Sport", an.getName());
    }

    @Test
    public void getColour() {
        Assert.assertEquals("black", an.getColour());

    }

    @Test
    public void sound() {
        an.sound();
    }
}
