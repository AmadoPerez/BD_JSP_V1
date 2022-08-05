
package dao;

import beans.Alumno;
import conexion.ConexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Privado
 */
public class DAOAlumno 
{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Alumno alumno;
    
    public ArrayList mostrar() throws ClassNotFoundException 
    {
       ArrayList<Alumno>list=new ArrayList<>();
       String sql="SELECT * FROM alumnos";
       try
       {
           con=ConexionMYSQL.getConnection();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next())
           {
               alumno=new Alumno();
               alumno.setMatricula(rs.getString("Matricula"));
               alumno.setNombre(rs.getString("Nombre"));
               alumno.setApellidoP(rs.getString("ApellidoPaterno"));
               alumno.setApellidoM(rs.getString("ApellidoMaterno"));
               alumno.setDdi(rs.getInt("Ddi"));
               alumno.setDwi(rs.getInt("Dwi"));
               alumno.setEcbd(rs.getInt("Ecbd"));
               alumno.getProm();
               list.add(alumno);
           }
           rs.close();
           ps.close();
           con.close();
           
       }
       catch(SQLException e){}
       return list;
    }
    
    public boolean agregar(Alumno alumno) throws SQLException, ClassNotFoundException
    {
        String sql="INSERT INTO alumnos VALUE('"+
                    alumno.getMatricula()+"',"+
                    "'"+alumno.getNombre()+"',"+
                    "'"+alumno.getApellidoP()+"',"+
                    "'"+alumno.getApellidoM()+"',"+
                       +alumno.getDdi()+","+
                       +alumno.getDwi()+","+
                       +alumno.getEcbd()+")";
        try
        {
            con=ConexionMYSQL.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch(SQLException e){}
        return true;
    }
    
     public boolean editar (Alumno alumno, String old) throws ClassNotFoundException
    {
        String sql="UPDATE alumnos SET  "+
                    "Matricula       = '"+alumno.getMatricula()+"',"+
                    "Nombre          = '"+alumno.getNombre()   +"',"+
                    "ApellidoPaterno = '"+alumno.getApellidoP()+"',"+
                    "ApellidoMaterno = '"+alumno.getApellidoM()+"',"+
                    "Ddi  = " +alumno.getDdi()  +","+
                    "Dwi  = " +alumno.getDwi()  +","+
                    "Ecbd = "+alumno.getEcbd()  +
                    " WHERE alumnos.Matricula = '"+old+"';";
         try
        {
            con=ConexionMYSQL.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch(SQLException e){}
                     
        return true;
    }
      public boolean eliminar (String matricula) throws ClassNotFoundException
    {
     String sql= "DELETE FROM alumnos WHERE Matricula ='" + matricula + "'";
     
     try
     {
         con=ConexionMYSQL.getConnection();
         ps=con.prepareStatement(sql);
         ps.executeUpdate();
         ps.close();
         con.close();
     } catch (SQLException e) {}
     
     return true;
    }
      
       public Alumno buscar(String matricula) throws ClassNotFoundException
    {
       
       String sql="SELECT * FROM alumnos WHERE Matricula = '"+matricula+"'";
       try
       {
           con=ConexionMYSQL.getConnection();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next())
           {
               alumno=new Alumno();
               alumno.setMatricula(rs.getString("Matricula"));
               alumno.setNombre(rs.getString("Nombre"));
               alumno.setApellidoP(rs.getString("ApellidoPaterno"));
               alumno.setApellidoM(rs.getString("ApellidoMaterno"));
               alumno.setDdi(rs.getInt("Ddi"));
               alumno.setDwi(rs.getInt("Dwi"));
               alumno.setEcbd(rs.getInt("Ecbd"));
           }
           rs.close();
           ps.close();
           con.close();
           
       } catch(SQLException e){}
        return alumno;
       
    }
    
    
    
}
