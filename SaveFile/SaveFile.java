package SaveLoad.SaveFile;

import SaveLoad.SaveLoad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private String text;

    public void save(File file) {
        try {
            saveFile(file);
        } catch(IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    private void saveFile(File file) throws Exception{
        this.text = text;
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write("Random string of charakter");
        writer.close();
    }

    private void addText(String text) {
       // String
    }
}
