package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ro.emanuel.helper.DataBaseHelper;
import ro.emanuel.pojo.Phone;

public class PhoneDAO {

	public static Phone getById(int id) throws SQLException, ClassNotFoundException {
		Connection connection = DataBaseHelper.getConnection();
		String query = "select * from phones where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();
		Phone phone = null;
		if (resultSet.next())
			phone = new Phone(resultSet.getInt("id"), resultSet.getString("brand"));
		DataBaseHelper.closeConnection();
		return phone;

	}

	public static List<Phone> getAll() throws SQLException, ClassNotFoundException {
		Connection connection = DataBaseHelper.getConnection();
		String query = "select * from phones";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(query);
		List<Phone> phones = new ArrayList<Phone>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String brand = resultSet.getString("brand");
			phones.add(new Phone(id, brand));
		}
		DataBaseHelper.closeConnection();
		return phones;

	}

}
