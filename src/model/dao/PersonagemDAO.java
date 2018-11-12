/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Personagem;

/**
 *
 * @author Samuelson
 */
public class PersonagemDAO {

    public void create(Personagem p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO `projeto`.`personagem` (`nome`, `classe`, `lvl`, `sexo`, `hp`, `mana`, `gold`) VALUES (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getClasse());
            stmt.setInt(3, p.getLevel());
            stmt.setString(4, p.getSexo());
            stmt.setInt(5, p.getVida());
            stmt.setInt(6,p.getMana());
            stmt.setInt(7, p.getGold());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Personagem> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Personagem> persoLista = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM personagem");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Personagem p = new Personagem();

                
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setClasse(rs.getString("classe"));
                p.setLevel(rs.getInt("lvl"));
                p.setSexo(rs.getString("sexo"));
                p.setVida(rs.getInt("hp"));
                p.setMana(rs.getInt("mana"));
                p.setGold(rs.getInt("gold"));
                persoLista.add(p);
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return persoLista;

    }

    public void update(Personagem p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE `projeto`.`personagem` SET `nome` = ?, `classe` = ?, `sexo` = ? WHERE (`id` = ?);");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getClasse());
            stmt.setString(3, p.getSexo());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Personagem p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM personagem WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
