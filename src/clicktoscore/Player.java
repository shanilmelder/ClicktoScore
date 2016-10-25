package clicktoscore;

import java.sql.PreparedStatement;
import java.util.ArrayList;


public class Player {
    
    private static String fullname;
    private static int age;
    private static int numberofmatches;
    private static String teamname;
    

    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the numberofmatches
     */
    public int getNumberofmatches() {
        return numberofmatches;
    }

    /**
     * @param numberofmatches the numberofmatches to set
     */
    public void setNumberofmatches(int numberofmatches) {
        this.numberofmatches = numberofmatches;
    }

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
    
    
}
