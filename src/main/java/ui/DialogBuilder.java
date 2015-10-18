package ui;

import javax.swing.*;
import java.awt.*;

public class DialogBuilder {

    final protected JDialog jd;
    final protected Container jdContainer;

    public DialogBuilder() {
        throw new InstantiationError("Can't be called with standard constructor");
    }

    public DialogBuilder(JFrame parent, String title) {
        jd = new JDialog(parent, title);
        jdContainer = jd.getContentPane();
        jdContainer.setLayout(new BoxLayout(jdContainer, BoxLayout.Y_AXIS));
    }

    protected JTextField factoryField(String labelText) {
        JLabel jl = new JLabel(labelText);
        JTextField field = new JTextField();
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        field.setAlignmentX(Component.LEFT_ALIGNMENT);
        jdContainer.add(jl);
        jdContainer.add(field);
        return field;
    }

    protected JTextArea factoryArea(String labelText) {
        JLabel jl = new JLabel(labelText);
        JTextArea area = new JTextArea(5, 50);
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        area.setAlignmentX(Component.LEFT_ALIGNMENT);
        jdContainer.add(jl);
        jdContainer.add(area);
        return area;
    }

    protected JComboBox<String> factoryComboBox(String labelText) {
        if (labelText == null) throw new IllegalArgumentException("labelText cannot be null!");
        JLabel jl = new JLabel(labelText);
        JComboBox<String> box = new JComboBox<>( new String[3] );
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        box.setAlignmentX(Component.LEFT_ALIGNMENT);
        jdContainer.add(jl);
        jdContainer.add(box);
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
        jdContainer.add(buttonPanel);
        return buttonPanel;
    }

    protected JPanel factoryButtonPanel() {
        JPanel bp = new JPanel();
        bp.setLayout(new FlowLayout(FlowLayout.CENTER));
        bp.setAlignmentX(Component.LEFT_ALIGNMENT);
        bp.add(new JButton("Registrieren"));
        bp.add(new JButton("Ändern"));
        bp.add(new JButton("Löschen"));
        bp.add(new JButton("Anmelden"));
        bp.add(new JButton("Abmelden"));
        jdContainer.add(bp);
        return bp;
    }
}
