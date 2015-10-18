package ui;

import javax.swing.*;

public class VorhabenUI extends GeneralDialog {

    public VorhabenUI (JFrame parent, String id, String[] partOf, String remainderHours, String setHours, String status) {
        super(parent, "Vorhaben erfassen / ändern");
        super.id.setText(id);
        super.id.setEditable(false);
        super.partOf.setModel(new JComboBox<>(partOf).getModel());
        super.partOf.setEditable(false);
        super.remainderHours.setText(remainderHours);
        super.remainderHours.setEditable(false);
        super.setHours.setText(setHours);
        super.setHours.setEditable(false);
        super.status.setText(status);
        super.status.setEditable(false);
        super.jd.pack();

    }
}
