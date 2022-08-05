/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Privado
 */
public class ConexionMYSQL 
{
    public static Connection getConnection() throws SQLException, ClassNotFoundException
    {
       Class.forName("com.mysql.jdbc.Driver"); 
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dwi_ejemplo1","root","");
    }
    public static void main(String arg[]) throws SQLException, ClassNotFoundException
    {
        ConexionMYSQL.getConnection();
        System.out.println("Exitoso");
    }
    
}
