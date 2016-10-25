/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clicktoscore;

import javax.swing.JOptionPane;

/**
 *
 * @author Shanil
 */
public class InningsOver {
    public void end(int team2score){
        JOptionPane.showMessageDialog(null,"Innings Over","Information:",JOptionPane.INFORMATION_MESSAGE);
        Match match1=new Match();
            match1.setFlag(false);
            String t1=match1.getTeam1name();
            String t2=match1.getTeam2name();
            match1.setTeam1name(t2);
            match1.setTeam2name(t1);
            match1.setTeam2score(team2score);
            System.out.println(match1.getTeam2name());
            System.out.println(match1.getTeam2score());
            Team1MemberList.team1players.clear();
            Team2MemberList.team2players.clear();
            Team1MemberList bat=new Team1MemberList();
            Main mn=new Main();
            mn.setVisible(false);
            bat.setVisible(true);
           
    }
}
