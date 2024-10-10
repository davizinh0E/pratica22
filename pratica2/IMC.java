
import javax.swing.JOptionPane;

public class IMC {

    static double imc, weight, height;

    public static void getData(){
        //registra informaçao de peso e altura do usuario
        String prompt;

        prompt = JOptionPane.showInputDialog("Informe sua massa(peso) em quilos: ");
        weight = Double.parseDouble(prompt);

        prompt = JOptionPane.showInputDialog("Informe sua altura em metros: ");
        height = Double.parseDouble(prompt);
    }


    public static void getIMC(){
        // calcula o imc do usuario
        imc = weight / (Math.pow(height, 2));

    }

    
    public static void showIMC(){
        // indica a situaçao do usuario
        if (imc < 20)
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso.");
        else if (imc >=20 && imc <25 )
            JOptionPane.showMessageDialog(null, "Você está com peso normal.");
        else if (imc >= 25 && imc <30)
            JOptionPane.showMessageDialog(null, "Você está em sobrepeso");
        else if (imc >=30 && imc <40)
            JOptionPane.showMessageDialog(null, "Você está obeso.");
        else
            JOptionPane.showMessageDialog(null, "Você tem obesidade mórbida");
    }


    public static void main(String[] args) {
        getData();
        getIMC();
        showIMC();
    
    }
}
