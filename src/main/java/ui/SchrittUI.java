package ui;

import javax.swing.*;
import java.awt.*;

public class SchrittUI extends GeneralDialog {

    public SchrittUI(JFrame parent, String id, String[] partOf, String status, String endDate) {
        super(parent, "Schritt erfassen / ändern");
        super.id.setText(id);
        super.id.setEditable(false);
        super.status.setText(status);
        super.status.setEditable(false);
        super.endDate.setText(endDate);
        super.endDate.setEditable(false);
        super.partOf.setModel(new JComboBox<>(partOf).getModel());
        super.partOf.setEditable(false);
        super.buttonPanel.add(new JButton("Erledigen"));
        super.jd.pack();
    }
}
