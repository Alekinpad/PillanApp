package cl.pillan.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

import cl.metagen.EntryTime;
import cl.metagen.pilanatsk.PilAnaTskRemote;
import cl.metagen.pilinceve.InsResult;
import cl.metagen.pilinceve.PilIncEveRemote;
import cl.metagen.pilinceve.ResultStatus;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Receptor
 */
public class Receptor extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    private PilIncEveRemote ejbRef; 
    private PilAnaTskRemote ejbRefAna; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Receptor()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.receive(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.receive(request, response);
	}
	
	void receive(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("Llegó");
	     long myCodStt = 0; //[005]
	     String posX = request.getParameter("posx"); //[005]
	     String posY = request.getParameter("posy"); //[005]
	     String posZ = request.getParameter("posz"); //[005]
	     String indP = request.getParameter("p"); //[005]
	     String indI = request.getParameter("i"); //[005]
	     String indA = request.getParameter("a");
	     String userName = null; //[005]
	     String domain = null; //[005]
	     String channel = null; //[005]
	     String gls = null; //[005]
	     String lnk = null; //[005]
	     String transactTime = new EntryTime().toString();
	     String entryTime = new EntryTime().toString();
	     InsResult insResult;
         ResultStatus resultStatus;
	     try
         {
             insResult = getEJB().ins(0, posX, posY, posZ, indP, indI, indA, userName, domain, channel, gls, lnk, transactTime, entryTime);
         }
         catch (Exception ex)
         {
             insResult = new InsResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             insResult.setResultStatus(resultStatus);
         }
	     String url = null;
	     try 
	     {
			url = this.getHTML(posX, posY, posZ);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     try
         {
             Object anaInsResult = getEJBAna().ins(0, posX, posY, posZ, indP, indI, indA, userName, domain, channel, url, lnk, transactTime, entryTime);
         }
         catch (Exception ex)
         {
             insResult = new InsResult();
             resultStatus = new ResultStatus();
             resultStatus.setResultCode(-21999);
             resultStatus.setResultMsg(ex.toString());
             insResult.setResultStatus(resultStatus);
         }
	     
	     StringBuffer sb = new StringBuffer();
	     
	     try {
			response.sendRedirect("Visualizacion");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     //http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1
	     
	     
	}
	
	

	   public static String getHTML(String posx, String posy, String posz) throws Exception 
	   {
		 String urlToRead = "http://api.openweathermap.org/data/2.5/weather?lat="
				      + posx + "&lon=" + posy + "&APPID=cabf916fca5bb4a4ff63af956f49c9b6";

	      StringBuilder result = new StringBuilder();
	      URL url = new URL(urlToRead);
	      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	      conn.setRequestMethod("GET");
	      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
	      return result.toString();
	   }


	 /**
     * Obtiene el Stateless Enterprise Session Bean
     */
    private PilIncEveRemote getEJB() throws java.lang.Exception
    {
        if (ejbRef == null)
        {
             InitialContext context = new InitialContext();
             ejbRef = (PilIncEveRemote)context.lookup("ejb/cl/metagen/pilinceve/PilIncEve");//java:comp/env/ejbRef
        }
        return ejbRef;
    }
    
	 /**
     * Obtiene el Stateless Enterprise Session Bean
     */
    private PilAnaTskRemote getEJBAna() throws java.lang.Exception
    {
        if (ejbRefAna == null)
        {
             InitialContext context = new InitialContext();
             ejbRefAna = (PilAnaTskRemote)context.lookup("ejb/cl/metagen/pilanatsk/PilAnaTsk");//java:comp/env/ejbRef
        }
        return ejbRefAna;
    }

}
