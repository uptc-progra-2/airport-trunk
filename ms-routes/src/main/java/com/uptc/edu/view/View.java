package com.uptc.edu.view;

import javax.swing.JOptionPane;

public class View {
    public void showGraphicMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public String readGraphicString(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public int readGraphicInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
