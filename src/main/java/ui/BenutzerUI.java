package ui;

import javax.swing.*;

public class BenutzerUI extends DialogBuilder {

    final private JTextField id, fullname, password;
    final private JComboBox<String> username;
    final private JPanel buttonPanel;

    public BenutzerUI (JFrame parent, String id) {
        super(parent, "Benutzer registrieren / ändern / löschen / anmelden");
        this.id = factoryField("ID");
        this.id.setText(id);
        this.id.setEditable(false);
        fullname = factoryField("Langname");
        username = factoryComboBox("Benutzername");
        username.setModel(new JComboBox<>(new String[] {"Mio", "Moto", "Pancakeninja"}).getModel());
        password = factoryField("Kennwort");
        buttonPanel = factoryButtonPanel();
        super.jd.pack();
        super.jd.setVisible(true);
    }
}
