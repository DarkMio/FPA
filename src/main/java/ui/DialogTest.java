package ui;

import javax.swing.*;

public class DialogTest {

    public static void main(String[] args) {
//      GeneralDialog jd = new GeneralDialog(new JFrame(), "Cooler text");
        GeneralDialog jd = new SchrittUI(new JFrame(), "Cooler text.",
                "99", new String[] {"11 Persistenzaufgabe lösen",}, "Neu", "noch nicht");
    }
}
