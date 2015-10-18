package ui;

import javax.swing.*;

public class DialogTest {

    public static void main(String[] args) {
        GeneralDialog jd = new SchrittUI(new JFrame(), "99", new String[] {"11 Persistenzaufgabe lösen",}, "Neu", "noch nicht");
        GeneralDialog jt = new VorhabenUI(new JFrame(), "99", new String[] {"11 Persistenzaufgabe lösen",}, "7", "0", "neu");
    }
}
