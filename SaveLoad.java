package SaveLoad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLoad {

    public void save(Monster monster, String fileName) {
        try {
            saveMethod(monster,fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }

    public void load(Monster monster, String fileName) {

        try {
            loadMethod(monster, fileName);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void saveMethod(Monster monster, String fileName) throws Exception {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
        os.writeObject(monster);
        os.close();
    }

    private void loadMethod(Monster monster, String fileName) throws Exception {
        monster = null;
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(fileName));
        Monster read = (Monster) oi.readObject();

        System.out.println(read.getPower());
    }
}
