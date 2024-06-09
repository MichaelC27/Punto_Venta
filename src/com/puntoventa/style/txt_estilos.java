package com.puntoventa.style;

import javax.swing.*;
import java.awt.*;

public class txt_estilos {

    // Método para aplicar estilos a un JTextField con un diseño moderno
    public static void applyTextFieldStyle(JTextField textField) {
        
        // Fuente y color del texto
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        textField.setForeground(Color.BLACK);
        
        // Color de fondo y borde
        textField.setBackground(Color.WHITE);
        textField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                BorderFactory.createEmptyBorder(5, 10, 5, 10))); // Padding
        
        // Listener para manejar el enfoque
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(100, 100, 100), 1),
                        BorderFactory.createEmptyBorder(5, 10, 5, 10))); // Efecto de sombra al ganar el foco
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField.setBorder(BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                        BorderFactory.createEmptyBorder(5, 10, 5, 10))); // Restaura el borde cuando pierde el foco
            }
        });
    }
}
