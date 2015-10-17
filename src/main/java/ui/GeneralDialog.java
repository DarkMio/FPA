package ui;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.lang.IllegalArgumentException;

public abstract class GeneralDialog {

    protected JDialog jd;
    protected JTextField id, title, remainderHours, setHours, status, endDate;
    protected JComboBox<String> partOf;
    protected JTextArea description;
    protected Container cont;
    protected JPanel buttonPanel;

    public GeneralDialog () {
        throw new InstantiationError("Can't be called with standard constructor");
    }

    public GeneralDialog (JFrame parent, String title) {
        jd = new JDialog(parent, title);
        buildUI();
        jd.pack();
        jd.setVisible(true);
    }

    protected void initialize() {}

    protected void buildUI() {
        cont = jd.getContentPane();
        cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
        addField("ID", id, getIdText(), isIdEditable());
        addField("Titel", title, getTitleText(), isTitleEditable());
        addArea("Beschreibung", description, getDescriptionText(), isDescriptionEditable());
        addComboBox("Teil von Vorhaben", partOf, getPartOfText(), isPartOfEditable());
        addField("Reststunden", remainderHours, getRemainderHoursText(), isRemainderHoursEditable());
        addField("Ist-Stunden", setHours, getSetHoursText(), isSetHoursEditable());
        addField("Status", status, getStatusText(), isStatusTextEditable());
        addField("End-Datum", endDate, getEndDateText(), isEndDateEditable());
        addButtonPanel("Erfassen", "Aendern");
    }

    private void addField(String labelText, JTextField field, String content, boolean isEnabled) {
        JLabel jl = new JLabel(labelText);
        field = new JTextField(content);
        field.setEditable(isEnabled);
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        field.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(field);
    }

    private void addArea(String labelText, JTextArea area, String content, boolean isEnabled) {
        JLabel jl = new JLabel(labelText);
        area = new JTextArea(5, 50);
        area.setEditable(isEnabled);
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        area.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(area);
    }

    private void addComboBox(String labelText, JComboBox<String> box, String[] options, boolean isEnabled) {
        if (labelText == null) throw new IllegalArgumentException("labelText cannot be null!");
        JLabel jl = new JLabel(labelText);
        partOf = new JComboBox<String>( new String[] {"1", "2", "3"});
        partOf.setEditable(isEnabled);
        jl.setAlignmentX(Component.LEFT_ALIGNMENT);
        partOf.setAlignmentX(Component.LEFT_ALIGNMENT);
        cont.add(jl);
        cont.add(partOf);
    }

    private void addButtonPanel(String firstButton, String secondButton) {
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(new JButton(firstButton));
        buttonPanel.add(new JButton(secondButton));
        cont.add(buttonPanel);
    }

    protected abstract String getIdText();
    protected abstract String getTitleText();
    protected abstract String getRemainderHoursText();
    protected abstract String getSetHoursText();
    protected abstract String getStatusText();
    protected abstract String getEndDateText();
    protected abstract String[] getPartOfText();
    protected abstract String getDescriptionText();

    protected abstract boolean isIdEditable();
    protected abstract boolean isTitleEditable();
    protected abstract boolean isRemainderHoursEditable();
    protected abstract boolean isSetHoursEditable();
    protected abstract boolean isStatusTextEditable();
    protected abstract boolean isEndDateEditable();
    protected abstract boolean isPartOfEditable();
    protected abstract boolean isDescriptionEditable();

}
