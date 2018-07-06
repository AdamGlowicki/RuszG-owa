package SaveLoad;

import SaveLoad.SaveFile.LoadFile;
import SaveLoad.SaveFile.SaveFile;
import SaveLoad.SaveObjects.SaveList;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        SaveLoad sl = new SaveLoad();
//
//        Monster czlowiek = new Monster(300,"Warrior",new String[] {"Sword","Digger"});

//        SaveFile save = new SaveFile();
////        save.setTextToFile("Zobacymy czy cos sie zapisało \n" +
////                "dalsza linijka\n" +
////                "i jeszcze jedna");
//        save.save(new File("C:/Users/Adam/Documents/tekst.txt"));
//        LoadFile load = new LoadFile();
//        load.load(new File("C:/Users/Adam/Documents/tekst.txt"));
        SaveList sl = new SaveList();

        sl.addToList("Poszły konie po betonie");
        sl.addToList("Poszły konie po betonie");
        sl.addToList("" +
                "");
        sl.addToList("Poszły konie po betonie");

        sl.writeText(new File("C:/Users/Adam/Documents/tekst111.txt"));
        sl.readList();


    }
}
