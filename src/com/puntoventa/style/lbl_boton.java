package com.puntoventa.style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lbl_boton {
    
    public static void applyButtonStyle(JLabel label) {
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        label.setForeground(Color.BLACK);
        label.setBackground(Color.LIGHT_GRAY);
        label.setOpaque(true); // Necesario para que el fondo se muestre
        
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(Color.GRAY);
                label.setForeground(Color.WHITE);
                label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Cambia el cursor a una mano
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(Color.LIGHT_GRAY);
                label.setForeground(Color.BLACK);
                label.setCursor(Cursor.getDefaultCursor()); // Restaura el cursor al predeterminado
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                label.setBackground(Color.DARK_GRAY);
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                label.setBackground(Color.GRAY);
            }
        });
    }
}
