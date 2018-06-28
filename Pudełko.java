package SaveLoad;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pudełko implements Serializable {

    private Integer width;
    private Integer hight;

    public void setWidth(Integer width){
        this.width = width;
    }
    public void setHight(Integer hight){
        this.hight = hight;
    }





}
