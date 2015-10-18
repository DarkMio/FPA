package ui;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.lang.IllegalArgumentException;

public abstract class GeneralDialog {

    final protected JDialog jd;
    final protected JTextField id, title, remainderHours, setHours, status, endDate;
    protected JComboBox<String> partOf;
    final protected JTextArea description;
    final protected Container cont;
    final protected JPanel buttonPanel;

    public GeneralDialog () {
        throw new InstantiationError("Can't be called with standard constructor");
    }

    public GeneralDialog (JFrame parent, String title) {
        jd = new JDialog(parent, title);
        cont = jd.getContentPane();
        cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
        cont.setMaximumSize(new Dimension(250, Short.MAX_VALUE));
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

    protected JTextField factoryField(String labelText) {
        JLabel jl = new JLabel(labelText);
        JTextField field = new JTextField();
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        field.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(field);
        return field;
    }

    protected JTextArea factoryArea(String labelText) {
        JLabel jl = new JLabel(labelText);
        JTextArea area = new JTextArea(5, 50);
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        area.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(area);
        return area;
    }

    protected JComboBox<String> factoryComboBox(String labelText) {
        if (labelText == null) throw new IllegalArgumentException("labelText cannot be null!");
        JLabel jl = new JLabel(labelText);
        JComboBox<String> box = new JComboBox<String>( new String[3] );
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(box);
        return box;
    }

    protected JPanel factoryButtonPanel(String firstButton, String secondButton) {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton one = new JButton(firstButton);
        JButton two = new JButton(secondButton);
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        buttonPanel.add(one);
        buttonPanel.add(two);
        cont.add(buttonPanel);
        return buttonPanel;
    }
}
