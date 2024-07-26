package Logic;

import Interfaz.*;

public class Principal {

    public static void main(String[] args) {
        InicioSesion_Pantalla iniSesion = new InicioSesion_Pantalla();
        iniSesion.setVisible(true);
        iniSesion.setLocationRelativeTo(null);
    }
}
