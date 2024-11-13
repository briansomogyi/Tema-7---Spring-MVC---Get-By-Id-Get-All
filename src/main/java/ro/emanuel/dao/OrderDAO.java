package ro.emanuel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ro.emanuel.helper.DataBaseHelper;
import ro.emanuel.pojo.Order;

public class OrderDAO {

	public static Order getById(int id) throws SQLException, ClassNotFoundException {
		Connection connection = DataBaseHelper.getConnection();
		String query = "select * from orders where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);

		ResultSet resultSet = preparedStatement.executeQuery();
		Order order = null;
		if (resultSet.next())
			order = new Order(resultSet.getInt("id"), resultSet.getString("description"),
					resultSet.getString("status"));
		DataBaseHelper.closeConnection();
		return order;

	}

	public static List<Order> getAll() throws SQLException, ClassNotFoundException {
		Connection connection = DataBaseHelper.getConnection();
		String query = "select * from orders";
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(query);
		List<Order> orders = new ArrayList<Order>();
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String description = resultSet.getString("description");
			String status = resultSet.getString("status");
			orders.add(new Order(id, description, status));
		}
		DataBaseHelper.closeConnection();
		return orders;

	}

}
