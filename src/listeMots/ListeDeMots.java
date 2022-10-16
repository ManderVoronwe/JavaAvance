package listeMots;

import java.io.Serializable;
import java.io.*;

public class ListeDeMots implements Serializable {
    private String ListeDeMots;
    private String Mot;

    // constructor
    public ListeDeMots(String ListeDeMots) {
        this.ListeDeMots = ListeDeMots;
        this.Mot = "";
    }

    // getters
    public String getMot() {
        return Mot;
    }

    public String getListeDeMots() {
        return ListeDeMots;
    }

    // setters
    public void setMot(String Mot) {
        this.Mot = Mot;
    }

    public void setListeDeMots(String ListeDeMots) {
        this.ListeDeMots = ListeDeMots;
    }

    public int countLines() {
        int lines = 0;
        try {
            BufferedReader fichier = new BufferedReader(new FileReader(this.ListeDeMots));
            while ((fichier.readLine()) != null) {
                lines++;
            }
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void chooseWord() {
        int total_lines = countLines();
        int random = (int) (Math.random() * total_lines);
        try {
            BufferedReader fichier = new BufferedReader(new FileReader(this.ListeDeMots));
            for (int i = 0; i < random; i++) {
                fichier.readLine();
            }
            this.Mot = fichier.readLine();
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
