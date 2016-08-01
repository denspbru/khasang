package org.denspbru.khasang.test;

import org.denspbru.khasang.Lamp;
import org.denspbru.khasang.TrafficLight;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by denspbru on 01.08.16.
 */
public class TrafficLightTest {

    @Test
    public void TrafficLightTest(){
        TrafficLight v_tl = new TrafficLight();

        v_tl.addLamp(new Lamp("GREEN",20));
        v_tl.addLamp(new Lamp("YELLOW",5));
        v_tl.addLamp(new Lamp("RED",10));
        Assert.assertEquals(v_tl.getColor(5), "GREEN");
        Assert.assertEquals(v_tl.getColor(20), "GREEN");
        Assert.assertEquals(v_tl.getColor(21), "YELLOW");
        Assert.assertEquals(v_tl.getColor(25), "YELLOW");
        Assert.assertEquals(v_tl.getColor(26), "RED");
        Assert.assertEquals(v_tl.getColor(35), "RED");
        Assert.assertEquals(v_tl.getColor(36), "GREEN");

    }
}
