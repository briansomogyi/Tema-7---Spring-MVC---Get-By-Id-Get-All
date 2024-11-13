package ro.emanuel.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.emanuel.dao.PhoneDAO;
import ro.emanuel.pojo.Phone;

@Controller
public class PhoneController {

	@GetMapping("/phone")
	public String singlePhone(@RequestParam(name = "id", required = true, defaultValue = "1") int id, Model model)
			throws ClassNotFoundException, SQLException {

		// Iau obiectul din baza de date
		Phone phone = PhoneDAO.getById(id);

		// Adaug obiectul pe pagina jsp
		model.addAttribute("phone", phone);

		return "phone.jsp";
	}

	@GetMapping("/phones")
	public String allPhones(Model model) throws ClassNotFoundException, SQLException {

		// Iau obiectele din baza de date
		List<Phone> phones = PhoneDAO.getAll();

		// Adaug obiectele pe pagina jsp
		model.addAttribute("phones", phones);

		return "phones.jsp";
	}

}
