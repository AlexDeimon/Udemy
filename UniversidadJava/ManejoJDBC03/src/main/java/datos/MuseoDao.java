/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Entidades.MuseoDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DIEGO
 */
public interface MuseoDao {
    public List<MuseoDTO> select() throws SQLException;
    public int insert(MuseoDTO museo) throws SQLException;
    public int update(MuseoDTO museo) throws SQLException;
    public int delete(MuseoDTO museo) throws SQLException;
}
