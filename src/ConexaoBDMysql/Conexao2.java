package ConexaoBDMysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao2 {
	
	private static final String URL = "jdbc:mysql://localhost:3306/crud?user=root&password=asemha";
	

	public static Connection createConnectionToMySQL() throws
	Exception{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(URL);
				return connection;
	}


		public static void main(String[] args) throws Exception {
				
			Connection con = createConnectionToMySQL();
			
			if(con != null){
			
				System.out.println("Conexão obtida com sucesso! "  + con);
				
				con.close();
			}
		}
	}
