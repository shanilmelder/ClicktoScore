package clicktoscore;
     
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Database {
    static final String driver="com.mysql.jdbc.Driver";
    static final String db="jdbc:mysql://localhost/clicktoscore";
    static final String user="root";
    static final String password="";
    public String teamname;
    Connection conn;
    PreparedStatement pstmt;
    String sql;
    Match match1=new Match();
    Player pl=new Player();
   
    
    public Database(){
      this.conn=null;
    }
    
    public Connection getconnection(){
        try{
          Class.forName(driver);
          System.out.println("Connecting to Database");
          conn=DriverManager.getConnection(db,user,password);
          return conn;
      }
      
      catch(ClassNotFoundException | SQLException e){
       e.printStackTrace();
       return null;
    }
       
    }
   
     public ArrayList selectplayers(String team){
          ArrayList result=new ArrayList();
        try{
          sql="SELECT fullname FROM player WHERE teamname=?";
          pstmt=getconnection().prepareStatement(sql);
          pstmt.setString(1,team);
          ResultSet rs=pstmt.executeQuery();
          while(rs.next()){
              result.add(rs.getString(1));
          }
        }
        catch(MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"A Match is Currently in Progress in The Selected Venue","Error:",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e){
       e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
    
    finally{
        try{
            pstmt.close();
            conn.close();
        }
        
        catch(Exception e){
          e.printStackTrace();
    }
    }
       //System.out.println(result.get(0)+" Selected");
       //System.out.println(result.get(1)+" Selected");
       return result;
}
     
     
    
    
    public void insertmatch(){
        try{
          
          System.out.println(match1.getVenue());
          sql="INSERT INTO `match`(matchnumber,venue,matchtype,format,team1name,team2name,date,toss,team1score,team2score,result) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
          pstmt=getconnection().prepareStatement(sql);
          pstmt.setString(1,match1.getId());
          pstmt.setString(2,match1.getVenue());
          pstmt.setString(3,match1.getMatchtype());
          pstmt.setString(4,match1.getFormat());
          pstmt.setString(5,match1.getTeam1name());
          pstmt.setString(6,match1.getTeam2name());
          pstmt.setString(7,match1.getMatchdate());
          pstmt.setString(8,match1.getToss());
          pstmt.setString(9,match1.getTeam1score());
          pstmt.setString(10,toString().valueOf(match1.getTeam2score()));
          pstmt.setString(11,match1.getResult());  
          
          int rs=pstmt.executeUpdate();
          System.out.println(rs+" Record Added");
          
        }
        catch(MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"A Match is Currently in Progress in The Selected Venue","Error:",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e){
       e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    finally{
        try{
            pstmt.close();
            conn.close();
        }
        
        catch(Exception e){
          e.printStackTrace();
    }
    }
    }
    
    public void insertplayer(){
        try{
          
          System.out.println(match1.getVenue());
          sql="INSERT INTO `player`(`fullname`, `age`, `numberofmatches`, `teamname`) VALUES (?,?,?,?)";
          pstmt=getconnection().prepareStatement(sql);
          pstmt.setString(1,pl.getFullname());
          pstmt.setInt(2,pl.getAge());
          pstmt.setInt(3,pl.getNumberofmatches());
          pstmt.setString(4,pl.getTeamname());
         
          
          int rs=pstmt.executeUpdate();
          System.out.println(rs+" Record Added");
          
        }
        catch(MySQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null,"A Match is Currently in Progress in The Selected Venue","Error:",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e){
       e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
    finally{
        try{
            pstmt.close();
            conn.close();
        }
        
        catch(Exception e){
          e.printStackTrace();
    }
    }
    }
      
}
                                                                                                                                                                                