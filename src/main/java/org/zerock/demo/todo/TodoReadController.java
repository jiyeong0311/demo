package org.zerock.demo.todo;

import org.zerock.demo.todo.dto.TodoDTO;
import org.zerock.demo.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "todoReadController", urlPatterns = "/todo/read")
public class TodoReadController extends HttpServlet {

    protected void  doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("todo/read");

        // todo/read?tno=123
        // getParameter() 는 문자열로 결과가 나오기 때문에 변환이 필요함
        Long tno = Long.parseLong(req.getParameter("tno"));

        TodoDTO dto = TodoService.INSTANCE.get(tno);

        req.setAttribute("dto", dto);
        req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req, resp);
    }
}
