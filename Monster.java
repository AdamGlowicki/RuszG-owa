package SaveLoad;

import java.io.Serializable;

public class Monster implements Serializable {
    private Integer power;
    private String typ;
    private String[] weapons;

    public Monster(Integer power, String typ, String[] weapons) {
        this.power = power;
        this.typ = typ;
        this.weapons = weapons;
    }

    public Integer getPower() {
        return power;
    }

    public String getTyp() {
        return typ;
    }

    public String getWeapon() {
        StringBuilder str = new StringBuilder();
        str.append("Weapon: ");
        for (String s:weapons){
            str.append(s);
            str.append(" ");
        }
        return str.toString();
    }


}
