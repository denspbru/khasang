package org.denspbru.khasang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by denspbru on 01.08.16.
 */
public class TrafficLightMain {

    public static void main(String[] args) {
        String input = null;
        int number = 0;
        try {
            System.out.println("Enter number of seconds:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            number = Integer.parseInt(input);
            TrafficLight v_tl = new TrafficLight();

            v_tl.addLamp(new Lamp("GREEN",20));
            v_tl.addLamp(new Lamp("YELLOW",5));
            v_tl.addLamp(new Lamp("RED",10));

            System.out.format("The color is: %s\r\n", v_tl.getColor(number));

        } catch (NumberFormatException ex) {
            System.out.println("Not a number !");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
