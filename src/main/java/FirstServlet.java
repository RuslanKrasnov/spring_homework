import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet (name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New GET request");
        List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "apple", 10),
                new Product(2, "milk", 15),
                new Product(3, "orange", 12),
                new Product(4, "bread", 11),
                new Product(5, "pear", 21),
                new Product(6, "beer", 30),
                new Product(7, "tea", 5),
                new Product(8, "banana", 12),
                new Product(9, "water", 16),
                new Product(10, "pineapple", 14)));
        resp.getWriter().println(products);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
