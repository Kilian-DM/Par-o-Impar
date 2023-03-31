package numeroparimparobjeto;

import javax.swing.JOptionPane;

public class ParImpar {

    int resultado;
    int num;

    public ParImpar() {
        this.num = 0;
    }

    public ParImpar(int num) {
        this.num = num;
    }

    public void resultado() {
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + num + " es impar");
        }
    }
}
