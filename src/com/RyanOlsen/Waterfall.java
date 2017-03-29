package com.RyanOlsen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by olsen on 3/29/17.
 */
public class Waterfall extends JFrame{
    private JTextField projectName;
    private JButton submitProjectNameButton;
    private JCheckBox YesA;
    private JCheckBox NoA;
    private JCheckBox YesB;
    private JCheckBox NoB;
    private JCheckBox YesC;
    private JCheckBox NoC;
    private JCheckBox YesD;
    private JCheckBox NoD;
    private JCheckBox YesE;
    private JCheckBox NoE;
    private JCheckBox YesF;
    private JCheckBox NoF;
    private JPanel rootPanel;
    private JButton submitButton;

    protected Waterfall() {
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        int Count = 0;

        submitProjectNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String myProjectName = projectName.getText();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
