package controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/downloadTicket")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		
		//PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");		
		
		File file = (File)session.getAttribute("ticketFile");
		 
        ServletOutputStream stream = null;
        BufferedInputStream buf = null;
        try {
            stream = response.getOutputStream();
            // set response headers
            response.setContentType("application/msword");
            response.setDateHeader("Expires", 0);
            response.addHeader("Content-Disposition",
                "attachment; filename=myTicket.doc");
            response.setContentLength((int) file.length());
            buf = new BufferedInputStream(new FileInputStream(file));
            int readBytes = 0;
            while ((readBytes = buf.read()) != -1)
                stream.write(readBytes);
        } finally {
            if (stream != null){
                stream.flush();
            stream.close();
            }
            if (buf != null)
                buf.close();
        }
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}
