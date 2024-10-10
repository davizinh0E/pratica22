import javax.swing.JOptionPane;

public class Media {
        
    static double score1, score2, score3;
    

    public static void get_score(){
        //registra notas do aluno
        String prompt;
        
        prompt = JOptionPane.showInputDialog("Digite sua primeira nota:");
        score1 = Double.parseDouble(prompt);

        prompt = JOptionPane.showInputDialog("Digite sua segunda nota:");
        score2 = Double.parseDouble(prompt);

        prompt = JOptionPane.showInputDialog("Digite sua terceira nota:");
        score3 = Double.parseDouble(prompt);

    }
    
    
    public static double get_grades(){
        //calcula a soma e a media 
        double some = score1 + score2 + score3;
        double mean = some/3;

        return mean;
    }
    
    
    public static void show_result(double mean){
        //mostra resultado do aluno
        if (mean >= 7)
            JOptionPane.showMessageDialog(null,"Você foi aprovado.");
        else if (mean >=3 && mean <7)
            JOptionPane.showMessageDialog(null,"Você deve refazer o exame.");
        else
            JOptionPane.showMessageDialog(null,"Você foi reprovado.");
    }

    
    public static void main(String[] args) {
        get_score();
        double mean = get_grades();
        
        show_result(mean);
        System.exit(0);
    }
}
