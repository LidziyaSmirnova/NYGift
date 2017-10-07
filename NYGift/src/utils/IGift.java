package utils;

import sweets.Sweets;

import java.sql.SQLException;
import java.util.List;

public interface IGift {
	
	List<Sweets> getSweets() throws SQLException;
}
