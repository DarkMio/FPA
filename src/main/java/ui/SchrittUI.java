package ui;

import javax.swing.*;
import java.awt.*;

public class SchrittUI extends GeneralDialog {

    public SchrittUI(JFrame parent, String title, String id, String[] partOf, String status, String endDate) {
        super(parent, title);
        buttonPanel.add(new JButton("Erledigen"));
    }


    @Override
    protected String getIdText() {
        return "99";
    }

    @Override
    protected String getTitleText() {
        return "";
    }

    @Override
    protected String getRemainderHoursText() {
        return "";
    }

    @Override
    protected String getSetHoursText() {
        return "";
    }

    @Override
    protected String getStatusText() {
        return "Neu";
    }

    @Override
    protected String getEndDateText() {
        return "noch nicht";
    }

    @Override
    protected String[] getPartOfText() {
        return new String[] {"11 Persistenzaufgabe lösen"};
    }

    @Override
    protected String getDescriptionText() {
        return "";
    }

    @Override
    protected boolean isIdEditable() {
        return false;
    }

    @Override
    protected boolean isTitleEditable() {
        return true;
    }

    @Override
    protected boolean isRemainderHoursEditable() {
        return true;
    }

    @Override
    protected boolean isSetHoursEditable() {
        return true;
    }

    @Override
    protected boolean isStatusTextEditable() {
        return false;
    }

    @Override
    protected boolean isEndDateEditable() {
        return false;
    }

    @Override
    protected boolean isPartOfEditable() {
        return false;
    }

    @Override
    protected boolean isDescriptionEditable() {
        return true;
    }
}
