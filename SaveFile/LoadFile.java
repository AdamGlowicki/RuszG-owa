package SaveLoad.SaveFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LoadFile {

    public void load(File file) {
        try{
            loadFile(file);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void loadFile(File file) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}
