import javax.swing.*;

public class EjercicioConCondicionales2 {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Defina el valor de número1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Defina el valor de número2"));

        if(numero1 > numero2){
        JOptionPane.showMessageDialog(null,"El número mayor es: " + numero1);
        }else if(numero1 < numero2){
            JOptionPane.showMessageDialog(null,"El número mayor es: " + numero2);
        }else{
            JOptionPane.showMessageDialog(null,"Los dos números son iguales");
        }
    }
}
