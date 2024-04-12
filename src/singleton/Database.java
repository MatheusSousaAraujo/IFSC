package singleton;

public class Database {
    private static Database bd;
    //private Database getConection;

    private Database() {
    }
    
    public void getConection(){   
        System.out.println("Banco de dados conectado");         
    };
    
    public static synchronized Database getInstace(){
        if (bd == null) {
            bd = new Database();
            bd.getConection();
        }
        
        return bd;
    }    
    
   
}