package ro.emanuel.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.dao.OrderDAO;
import ro.emanuel.pojo.Order;

@Controller
public class OrderController {

	@GetMapping("/order")
	public String singleOrder(@RequestParam(name = "id", required = true, defaultValue = "1") int id, Model model)
			throws ClassNotFoundException, SQLException {

		// Iau obiectul din baza de date
		Order order = OrderDAO.getById(id);

		// Adaug obiectul pe pagina jsp
		model.addAttribute("order", order);

		return "order.jsp";
	}

	@GetMapping("/orders")
	public String allOrders(Model model) throws ClassNotFoundException, SQLException {

		// Iau obiectele din baza de date
		List<Order> orders = OrderDAO.getAll();

		// Adaug obiectele pe pagina jsp
		model.addAttribute("orders", orders);

		return "orders.jsp";
	}

}
