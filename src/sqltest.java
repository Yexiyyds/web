
public class sqltest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("111111111111");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
