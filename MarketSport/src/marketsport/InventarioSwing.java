
package marketsport;

import javax.swing.*;
  


public class InventarioSwing {

    public void vender() {
        while (true) {
            String[] deportes = {
                "Basketball", "Futbol", "MMA", "Boxeo", "Voleybol",
                "Rugby", "Tennis", "Beisbol", "Balonmano", "Karate", "Salir"
            };

            int resp = JOptionPane.showOptionDialog(
                null,
                "Bienvenido a MarketSport\nElige el deporte:",
                "Tienda Deportes",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                deportes,
                deportes[0]
            );

            if (resp == 10 || resp == -1) break; // Salir o cerrar ventana

            switch (resp) {
                case 0 -> menuBasketball();
                case 1 -> menuFutbol();
                case 2 -> menuMMA();
                case 3 -> menuBoxeo();
                case 4 -> menuVoleybol();
                case 5 -> menuRugby();
                case 6 -> menuTennis();
                case 7 -> menuBeisbol();
                case 8 -> menuBalonmano();
                case 9 -> menuKarate();
            }
        }
    }

    // --- MENÚS POR DEPORTE (mismo fondo que tu consola) ---
    private void menuBasketball() {
        String[] opciones = {"Ropa", "Balones", "Volver"};
        int op = JOptionPane.showOptionDialog(null, "Menú Basketball", "Basketball",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (op == 0) menuRopaBasket();
        else if (op == 1) JOptionPane.showMessageDialog(null, "Mostrando balones...");
    }

    private void menuRopaBasket() {
        String[] opciones = {"Conjuntos", "Zapatillas", "Volver"};
        int op = JOptionPane.showOptionDialog(null, "Menú Ropa Basketball", "Ropa",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (op == 0) {
            String[] conjuntos = {
                "Conjunto blanco y negro",
                "Conjunto morado y blanco",
                "Conjunto naranjado y negro",
                "Conjunto amarillo y verde",
                "Conjunto negro"
            };
            JOptionPane.showInputDialog(null, "Selecciona un conjunto:", "Conjuntos",
                    JOptionPane.QUESTION_MESSAGE, null, conjuntos, conjuntos[0]);
        }
    }

    // --- RESTO DE MENÚS (igual que arriba, copia y adapta) ---
    private void menuFutbol() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Futbol...");
    }

    private void menuMMA() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de MMA...");
    }

    private void menuBoxeo() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Boxeo...");
    }

    private void menuVoleybol() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Voleybol...");
    }

    private void menuRugby() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Rugby...");
    }

    private void menuTennis() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Tennis...");
    }

    private void menuBeisbol() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Beisbol...");
    }

    private void menuBalonmano() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Balonmano...");
    }

    private void menuKarate() {
        JOptionPane.showMessageDialog(null, "Mostrando menú de Karate...");
    }
}

