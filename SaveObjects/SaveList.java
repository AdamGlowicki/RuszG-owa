package SaveLoad.SaveObjects;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveList {

    List<String> text = new ArrayList<>();


    public void write(File file) {
        try {
            writeObjects(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void writeText(File file) {
        try{
            writeFile(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void writeObjects(File file) throws Exception {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));

    }

    private void writeFile(File file) throws Exception {
        BufferedWriter bf = new BufferedWriter(new FileWriter(file));
        for (String s:text){
            bf.write(s);
            bf.newLine();
        }
        bf.close();
    }
    public void addToList(String  textToList) {
        text.add(textToList);

    }

    public void readList() {
        for (String s:text){
            System.out.println(s);
        }
    }
}
