 package clicktoscore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Team {
    
    private static String teamname;
    private static String coachname;
    private static String captainname;
   
    

    /**
     * @return the teamname
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * @param teamname the teamname to set
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    /**
     * @return the coachname
     */
    public String getCoachname() {
        return coachname;
    }

    /**
     * @param coachname the coachname to set
     */
    public void setCoachname(String coachname) {
        this.coachname = coachname;
    }

    /**
     * @return the captainname
     */
    public String getCaptainname() {
        return captainname;
    }

    /**
     * @param captainname the captainname to set
     */
    public void setCaptainname(String captainname) {
        this.captainname = captainname;
    }

    
    
}