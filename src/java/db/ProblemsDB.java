/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import entity.Problems;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryll Joey Delfin
 */
public class ProblemsDB {
    public ArrayList<Problems> getProblemsList() {
        try {
            // put functions here : previous week production, this week production
            DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
            Connection conn = myFactory.getConnection();
            String query = "SELECT p.id, p.name,p.description,p.status,p.type,count(pf.Fields_id) as counter from sra.problems p join sra.`problems-fields` pf on p.id = pf.Problems_id join sra.fields f on pf.Problems_id = f.id where pf.validated = 'Y' ;";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Problems> pT = null;
            Problems p;
            if (rs.next()) {
                
                do {
                    pT = new ArrayList<Problems>();
                    p = new Problems();
                    p.setProb_id(rs.getInt("id"));
                    p.setProb_name(rs.getString("name"));
                    p.setProb_details(rs.getString("description"));
                    p.setStatus(rs.getString("status"));
                    p.setType(rs.getString("type"));
                    p.setTotalFarms(rs.getInt("counter"));
                    pT.add(p);
                } while (rs.next());
            }
            rs.close();
            stmt.close();
            conn.close();
            
            return pT;
        } catch (SQLException ex) {
            Logger.getLogger(ProblemsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Problems getProblemsDetails(int id) {
        try {
            // put functions here : previous week production, this week production
            DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
            Connection conn = myFactory.getConnection();
            String query = "select p.id, p.name, p.description, p.status,p.type, count(pf.Fields_id) as counter from sra.problems p join sra.`problems-fields` pf on p.id = pf.Problems_id where id = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            Problems p = null;
            if (rs.next()) {
                do {
                    p = new Problems();
                    p.setProb_id(rs.getInt("id"));
                    p.setProb_name(rs.getString("name"));
                    p.setProb_details(rs.getString("description"));
                    p.setStatus(rs.getString("status"));
                    p.setType(rs.getString("type"));
                    p.setTotalFarms(rs.getInt("counter"));
                } while (rs.next());
            }
            rs.close();
            pstmt.close();
            conn.close();
            
            return p;
        } catch (SQLException ex) {
            Logger.getLogger(ProblemsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
