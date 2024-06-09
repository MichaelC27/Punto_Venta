package com.puntoventa.style;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lbl_boton {

    // Definimos el color de fondo inicial como una constante
    private static final Color INITIAL_BACKGROUND_COLOR = new Color(54, 79, 78);
    private static final Color HOVER_BACKGROUND_COLOR = Color.GRAY;
    private static final Color PRESSED_BACKGROUND_COLOR = Color.DARK_GRAY;

    public static void applyButtonStyle(JLabel label) {
        // Establece propiedades iniciales de la etiqueta
        label.setFont(new Font("Calibri", Font.BOLD, 14));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        label.setForeground(Color.BLACK);
        label.setBackground(INITIAL_BACKGROUND_COLOR);
        label.setOpaque(true); // Necesario para que el fondo se muestre

        // Ajustar la posición del icono
        label.setIconTextGap(20); // Mueve el icono 10 píxeles a la izquierda
        label.setHorizontalTextPosition(SwingConstants.RIGHT); // Coloca el texto a la derecha del icono

        // Listener para eventos de ratón
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setBackground(HOVER_BACKGROUND_COLOR);
                label.setForeground(Color.WHITE);
                label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Cambia el cursor a una mano
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setBackground(INITIAL_BACKGROUND_COLOR);
                label.setForeground(Color.BLACK);
                label.setCursor(Cursor.getDefaultCursor()); // Restaura el cursor al predeterminado
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setBackground(PRESSED_BACKGROUND_COLOR);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setBackground(HOVER_BACKGROUND_COLOR);
            }
        });
    }
}
