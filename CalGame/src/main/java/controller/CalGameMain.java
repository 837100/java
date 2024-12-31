package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.CalLogic;
import logic.RandomNumberLogic;

/**
 * Servlet implementation class CalGameMain
 */
@WebServlet("/Calgame")
public class CalGameMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int firstNm = 0;
    private int secondNm = 0;
    private int rightCount = 0;
    private int wrongCount = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalGameMain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("cal.jsp");
		RandomNumberLogic nl = new RandomNumberLogic();
		firstNm = nl.getFirstNm();
		secondNm = nl.getSecondNm();
		request.setAttribute("firstNm", firstNm);
		request.setAttribute("secondNm", secondNm);
		request.setAttribute("rightCount", rightCount);
		request.setAttribute("wrongCount", wrongCount);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		int userInput = Integer.parseInt(request.getParameter("userInput"));
		CalLogic calLog = new CalLogic();
		String result = calLog.userInputAnswer(firstNm, secondNm, userInput);
		if(result.equals("right")) {
			rightCount++;
		} else {
			wrongCount++;
		}
		request.setAttribute("result", result);
		request.setAttribute("answer", calLog.getAnswer());
		
		doGet(request, response);
	}

}
