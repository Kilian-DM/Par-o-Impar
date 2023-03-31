package numeroparimparobjeto;

import javax.swing.JOptionPane;

public class NumeroParImparOBJETO {

    public static void main(String[] args) {
        int numero;
        String dato;
        dato = JOptionPane.showInputDialog(null, "Escriba un numero");
        numero = Integer.parseInt(dato);

        ParImpar numeroparimpar = new ParImpar(numero);
        numeroparimpar.resultado();
    }
}
