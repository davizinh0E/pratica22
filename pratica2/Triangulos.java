
import javax.swing.JOptionPane;

public class Triangulos {
    //indica qual tipo de triangulo foi informado
    int ladoA, ladoB, ladoC;
    String prompt;

    public void getDimensions(){
        //registra dimensoes de um triangulo
        prompt = JOptionPane.showInputDialog("Indique o valor do lado A:");
        ladoA = Integer.parseInt(prompt);

        prompt = JOptionPane.showInputDialog("Indique o valor do lado B:");
        ladoB = Integer.parseInt(prompt);

        prompt = JOptionPane.showInputDialog("Indique o valor do lado C:");
        ladoC = Integer.parseInt(prompt);
    }


    public void calcTriangle(){
        //calcula dimensoes de um triangulo
        if (ladoA == ladoB && ladoB == ladoC)
            JOptionPane.showMessageDialog(null,"Equilátero");
        else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
            JOptionPane.showMessageDialog(null,"Isósceles");
        else
            JOptionPane.showMessageDialog(null,"Escaleno");
    }


    public static void main(String[] args) {
       Triangulos triangulos = new Triangulos();
       
       triangulos.getDimensions();
       triangulos.calcTriangle();

       System.exit(0);
    }
}
