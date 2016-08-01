package org.denspbru.khasang;
/**
 * Created by denspbru on 01.08.16.
 */
public interface ILamp {

    String getColor();
    void setColor(String p_clr);

    int getDelay();
    void setDelay(int p_delay_sec);

}
