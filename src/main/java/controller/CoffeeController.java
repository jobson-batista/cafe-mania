package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CoffeeDAO;
import enums.RoastBean;
import enums.TypesCoffee;
import model.Coffee;

import org.apache.catalina.connector.OutputBuffer;

/**
 * Servlet implementation class CoffeeController
 */
@WebServlet(urlPatterns = {"/CoffeeController","/register-coffee"})
public class CoffeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CoffeeDAO dao = new CoffeeDAO();
       
    public CoffeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/register-coffee")) {
			registerCoffee(request, response);
		} else if(path.equals("/")) {
			request.getRequestDispatcher("/pages/home.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String path = request.getServletPath();
		
		switch (path) {
		case "/register-coffee":
			try {
				saveCoffee(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		default:
			break;
		}
	}
	
	protected void registerCoffee(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/pages/create.jsp").forward(req, res);
	}
	
	private void saveCoffee(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Coffee newCoffee = new Coffee();
		if(req.getParameter("name") == null 
				|| req.getParameter("description") == null
				|| req.getParameter("weight") == null
				|| req.getParameter("roast") == null
				|| req.getParameter("price") == null) {
			throw new Exception("Some field is empty.\n");
		}
		newCoffee.setName(req.getParameter("name"));
		newCoffee.setDescription(req.getParameter("description"));
		newCoffee.setWeight(Double.parseDouble(req.getParameter("weight")));
		newCoffee.setRoast(RoastBean.valueOf(req.getParameter("roast")));
		newCoffee.setPrice(Double.parseDouble(req.getParameter("price")));
		newCoffee.setType(TypesCoffee.valueOf(req.getParameter("type")));
		System.out.println(newCoffee.toString());
		
		dao.saveCoffee(newCoffee);
		res.sendRedirect("");
	}

}
