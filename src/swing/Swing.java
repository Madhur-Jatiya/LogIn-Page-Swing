package swing;


public class Swing {   
    public static void main(String[] args) {
        try {
            new MysqlConnection().getConnection();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
        
        LogIn.main(args);
    }
    
}
