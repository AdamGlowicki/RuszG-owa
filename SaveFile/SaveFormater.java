package SaveLoad.SaveFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.Formatter;

public class SaveFormater {
    public void save() {

    }

    public void prepareToSave(File file) throws Exception {
        BufferedWriter bw = new BufferedWriter(new PrintWriter(file));

    }
}
