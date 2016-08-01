package org.denspbru.khasang;

/**
 * Created by denspbru on 01.08.16.
 */
public class Lamp implements ILamp {
    protected  String _color;
    protected int _delay;

    public Lamp(String p_color, int p_delay)
    {
        _color = p_color;
        _delay = p_delay;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String p_clr) {
        _color = p_clr;
    }

    public int getDelay(){
        return  _delay;
    }
    public void setDelay(int p_delay_sec){
        _delay = p_delay_sec;
    }

}
