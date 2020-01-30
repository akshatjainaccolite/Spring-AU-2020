package com.spring.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.spring.accolite.*;    
    
public class EmpDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Emp p){    
    String sql="INSERT INTO Empl(id,name) values("+p.getId()+",'"+p.getName()+"')";    
    return template.update(sql);    
}    
public int update(Emp p){    
    String sql="UPDATE Empl SET name='"+p.getName()+"' where id="+p.getId()+"";    
    return template.update(sql);    
}    
public int delete(int id){    
    String sql="DELETE FROM Empl where id="+id+"";    
    return template.update(sql);    
}    
public Emp getEmpById(int id){    
    String sql="SELECT * FROM Empl where id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
}    
public List<Emp> getEmployees(){    
/*    return template.query("SELECT * FROM Empl",new RowMapper<Emp>(){    
        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
            Emp e=new Emp();    
            e.setId(rs.getInt("id"));    
            e.setName(rs.getString("name"));    
            e.setSalary(rs.getFloat("salary"));    
            e.setDesignation(rs.getString("designation"));    
            return e;    
        }    
    });*/
    
    String sql = "SELECT * FROM Empl";
    List<Emp> listContact = template.query(sql, new RowMapper<Emp>() {
 
        public Emp mapRow(ResultSet rs, int row) throws SQLException {
            Emp aContact = new Emp();
 
            aContact.setId(rs.getInt("id"));
            aContact.setName(rs.getString("name"));
            return aContact;
        }
 
    });
 
    return listContact;
}    
}   