package edu.mum.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/play")
public class QuizServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out1 = resp.getWriter();
        resp.setContentType("text/html");

        if(req.getSession(false)==null) {
            HttpSession session = req.getSession();
            session.setAttribute("quiz", new QuizLogic());
        }
        HttpSession currentSession = req.getSession();
        QuizLogic logic =  (QuizLogic)currentSession.getAttribute("quiz");

        out1.println("" +
                "<form method=\"post\" action=\"play\">\n" +
                "    <h3>The Number Quiz</h3>\n" +
                "\n" +
                "    <p> Your current Score is: </p>\n" +
                "\n" +
                "    <p>Guess the next number in the sequence</p>\n" +
                "\n" +
                "    <label>Your Answer is: <input type=\"number\"></label>\n" +
                "\n" +
                "<br>\n"+
                "\n" +
                "    <input type=\"submit\" value=\"Submit\">\n" +
                "\n" +
                "</form>");

    }
}
