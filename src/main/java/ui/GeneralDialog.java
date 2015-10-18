package ui;

import javax.swing.*;
import javax.swing.JComboBox;

public abstract class GeneralDialog extends DialogBuilder {

    final protected JTextField id, title, remainderHours, setHours, status, endDate;
    final protected JComboBox<String> partOf;
    final protected JTextArea description;
    final protected JPanel buttonPanel;

    public GeneralDialog (JFrame parent, String title) {
        super(parent, title);
        id = factoryField("ID");
        this.title = factoryField("Titel");
        description = factoryArea("Beschreibung");
        partOf = factoryComboBox("Teil von Vorhaben");
        remainderHours = factoryField("Reststunden");
        setHours = factoryField("Ist-Stunden");
        status = factoryField("Status");
        endDate = factoryField("End-Datum");
        buttonPanel = factoryButtonPanel("Erfassen", "Ändern");
        jd.pack();
        jd.setVisible(true);
    }
}
