
import javax.swing.JOptionPane;

public class Nota {
        
    static double score1, score2;
    

    public void get_score(){
        //registra notas do aluno
        String prompt;
        
        prompt = JOptionPane.showInputDialog("Digite sua primeira nota:");
        score1 = Double.parseDouble(prompt);

        prompt = JOptionPane.showInputDialog("Digite sua segunda nota:");
        score2 = Double.parseDouble(prompt);
    }
    
    
    public double get_grades(){
        //calcula a soma e a media 
        double some = score1 + score2;
        double mean = some/2;

        return mean;
    }
    
    
    public void show_result(double mean){
        //mostra resultado do aluno
        if (mean >= 7){
            JOptionPane.showMessageDialog(null,"Você foi aprovado.");
        } else {
            JOptionPane.showMessageDialog(null,"Você foi reprovado.");
        }
    }

    
    public static void main(String[] args) {
        Nota nota = new Nota();
        
        nota.get_score();
        double mean = nota.get_grades();
        
        nota.show_result(mean);
        System.exit(0);
    }
}