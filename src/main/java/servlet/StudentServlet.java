package servlet;

import entity.Student;
import model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp);
        //Model model = Model.getInstance();
       // List<String> names = model.list();
       // req.setAttribute("studentName", names);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/list.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doPost(req, resp);
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        Student student = new Student(name,surname);
//        Model model = Model.getInstance();
//        model.add(student);
//        req.setAttribute("studentName", name);
//        doGet(req, resp);
        RequestDispatcher requestDispatcher = req
                .getRequestDispatcher("/add.jsp");
        requestDispatcher.forward(req, resp);
    }
}
