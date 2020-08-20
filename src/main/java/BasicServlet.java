import logic.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();



        // Корзина
        Cart cart = (Cart) session.getAttribute("cart");

        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        if(cart==null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }

        session.setAttribute("cart", cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);


        /*  Счетчик посещений и редиректы
        Integer count = (Integer) session.getAttribute("count");

        if(count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }


        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hi Web form BasicServlet! And for you, " + name + " " + surname + "</h1>");
        pw.println("<h2> Your count is " + count + "</h2>");
        pw.println("Im just simplest servlet and im written on java");
        pw.println("</html>");

        // Redirect to google
        //response.sendRedirect("https://google.com");

        // Redirect to jsp
        //response.sendRedirect("/BaseJsp.jsp");

        //Forward to jsp
        //RequestDispatcher dispatcher = request.getRequestDispatcher("/BaseJsp.jsp");
        //dispatcher.forward(request, response); */


    }
}
