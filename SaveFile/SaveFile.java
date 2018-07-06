package SaveLoad.SaveFile;

import SaveLoad.SaveLoad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {

    private String textToFile;

    public void save(File file) {
        try {
            saveFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    private void saveFile(File file) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(textToFile);
        writer.close();
    }

    public void setTextToFile(String textToFile) {
        this.textToFile = textToFile;
    }
}


