package clicktoscore;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Match {
    
    private static String venue;
    private static String matchtype;
    private static String format;
    private static String team1name;
    private static String team2name;
    private static String team1score;
    private static int team2score;
    private static String result;
    private static String id;
    private static String matchdate;
    private static String toss;
    private static  Boolean flag=true;

    /**
     * @return the team2score
     */
    public int getTeam2score() {
        return team2score;
    }

    /**
     * @param aTeam2score the team2score to set
     */
    public void setTeam2score(int aTeam2score) {
        team2score = aTeam2score;
    }
  

   

    /**
     * @return the venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * @return the matchtype
     */
    public String getMatchtype() {
        return matchtype;
    }

    /**
     * @param matchtype the matchtype to set
     */
    public void setMatchtype(String matchtype) {
        this.matchtype = matchtype;
    }

    /**
     * @return the format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return the team1name
     */
    public String getTeam1name() {
        return team1name;
    }

    /**
     * @param team1name the team1name to set
     */
    public void setTeam1name(String team1name) {
        this.team1name = team1name;
    }

    /**
     * @return the team2name
     */
    public String getTeam2name() {
        return team2name;
    }

    /**
     * @param team2name the team2name to set
     */
    public void setTeam2name(String team2name) {
        this.team2name = team2name;
    }

    /**
     * @return the team1score
     */
    public String getTeam1score() {
        return team1score;
    }

    /**
     * @param team1score the team1score to set
     */
    public void setTeam1score(String team1score) {
        this.team1score = team1score;
    }

    
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the matchdate
     */
    public String getMatchdate() {
        return matchdate;
    }

    /**
     * @param matchdate the matchdate to set
     */
    public void setMatchdate(String matchdate) {
        this.matchdate = matchdate;
    }

    /**
     * @return the toss
     */
    public String getToss() {
        return toss;
    }

    /**
     * @param toss the toss to set
     */
    public void setToss(String toss) {
        this.toss = toss;
    }

    /**
     * @return the flag
     */
    public Boolean getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    
    }

   
    

