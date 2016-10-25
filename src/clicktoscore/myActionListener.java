
package clicktoscore;

import static clicktoscore.Main.runs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


class myActionListener implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        Match match1=new Match();
        Database db=new Database();
        if(match1.getFlag().equals(false)){
        if(Main.runs>match1.getTeam2score()){
             JOptionPane.showMessageDialog(null,"Match Over","Information:",JOptionPane.INFORMATION_MESSAGE);
             match1.setTeam1score(toString().valueOf(runs));
             match1.setResult(match1.getTeam1name());
             db.insertmatch();
         }
        }
    }
    
}
