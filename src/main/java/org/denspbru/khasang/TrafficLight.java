package org.denspbru.khasang;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by denspbru on 01.08.16.
 */
public class TrafficLight {
    protected List<ILamp> _lamps;

    public TrafficLight(){
        _lamps = new ArrayList<ILamp>();

    }

    public void addLamp(ILamp _lamp)
    {
        _lamps.add(_lamp);
    }

    public String getColor(int p_sec_count)
    {
        if(_lamps.size() == 0)
            return "The traffic light is not defined";
        if(p_sec_count < 0)
            return "Wrong number of secounds.";

        int v_sum_second = 0, v_idx = 0;
        ILamp v_last_lamp = null;

        while (v_sum_second < p_sec_count)
        {

            v_last_lamp  = _lamps.get(v_idx);
            v_sum_second += v_last_lamp.getDelay();
            v_idx ++;
            if(v_idx == _lamps.size())
                v_idx = 0;

        }

        return v_last_lamp.getColor();


    }
}
