package clicktoscore;


public class Batsman extends Player {
    
    private static double batavg;
    private static double strikerate;
    private static int bestscore;
    private static int bestscoreballs;
    private static int totalruns;

    
   

    /**
     * @return the batavg
     */
    public double getBatavg() {
        return batavg;
    }

    /**
     * @param batavg the batavg to set
     */
    public void setBatavg(double batavg) {
        this.batavg = batavg;
    }

    /**
     * @return the strikerate
     */
    public double getStrikerate() {
        return strikerate;
    }

    /**
     * @param strikerate the strikerate to set
     */
    public void setStrikerate(double strikerate) {
        this.strikerate = strikerate;
    }

    /**
     * @return the bestscore
     */
    public int getBestscore() {
        return bestscore;
    }

    /**
     * @param bestscore the bestscore to set
     */
    public void setBestscore(int bestscore) {
        this.bestscore = bestscore;
    }

    /**
     * @return the bestscoreballs
     */
    public int getBestscoreballs() {
        return bestscoreballs;
    }

    /**
     * @param bestscoreballs the bestscoreballs to set
     */
    public void setBestscoreballs(int bestscoreballs) {
        this.bestscoreballs = bestscoreballs;
    }

    /**
     * @return the totalruns
     */
    public int getTotalruns() {
        return totalruns;
    }

    /**
     * @param totalruns the totalruns to set
     */
    public void setTotalruns(int totalruns) {
        this.totalruns = totalruns;
    }

    
}
