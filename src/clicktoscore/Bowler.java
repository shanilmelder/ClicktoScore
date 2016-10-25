package clicktoscore;


public class Bowler extends Player {
    
    private static double bowlavg;
    private static double bo_strikerate;
    private static double economy;
    private static int mostwicket;
    private static int mostwicketruns;

    public Bowler(double bowlavg, double bo_strikerate, double economy, int mostwicket, int mostwicketruns) {
        this.bowlavg = bowlavg;
        this.bo_strikerate = bo_strikerate;
        this.economy = economy;
        this.mostwicket = mostwicket;
        this.mostwicketruns = mostwicketruns;
    }

    

    /**
     * @return the bowlavg
     */
    public double getBowlavg() {
        return bowlavg;
    }

    /**
     * @param bowlavg the bowlavg to set
     */
    public void setBowlavg(double bowlavg) {
        this.bowlavg = bowlavg;
    }

    /**
     * @return the bo_strikerate
     */
    public double getBo_strikerate() {
        return bo_strikerate;
    }

    /**
     * @param bo_strikerate the bo_strikerate to set
     */
    public void setBo_strikerate(double bo_strikerate) {
        this.bo_strikerate = bo_strikerate;
    }

    /**
     * @return the economy
     */
    public double getEconomy() {
        return economy;
    }

    /**
     * @param economy the economy to set
     */
    public void setEconomy(double economy) {
        this.economy = economy;
    }

    /**
     * @return the mostwicket
     */
    public int getMostwicket() {
        return mostwicket;
    }

    /**
     * @param mostwicket the mostwicket to set
     */
    public void setMostwicket(int mostwicket) {
        this.mostwicket = mostwicket;
    }

    /**
     * @return the mostwicketruns
     */
    public int getMostwicketruns() {
        return mostwicketruns;
    }

    /**
     * @param mostwicketruns the mostwicketruns to set
     */
    public void setMostwicketruns(int mostwicketruns) {
        this.mostwicketruns = mostwicketruns;
    }

    

}