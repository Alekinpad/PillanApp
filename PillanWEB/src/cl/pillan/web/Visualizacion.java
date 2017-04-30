package cl.pillan.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.metagen.pilanatsk.PilAnaTskRemote;
import cl.metagen.pilanatsk.ResultStatus;
import cl.metagen.pilanatsk.SttRangeOutDetalle1Result;
import cl.metagen.pilanatsk.SttRangeResult;

/**
 * Servlet implementation class Visualizacion
 */
public class Visualizacion extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	   private PilAnaTskRemote ejbRef;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Visualizacion() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.render(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		this.render(request, response);
	}

	void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		SttRangeResult sttRangeResult;
        ResultStatus resultStatus;
        try
        {
            sttRangeResult = getEJB().sttRange(0, 0, 100, 0);
        }
        catch (Exception ex)
        {
            sttRangeResult = new SttRangeResult();
            resultStatus = new ResultStatus();
            resultStatus.setResultCode(-21999);
            resultStatus.setResultMsg(ex.toString());
            sttRangeResult.setResultStatus(resultStatus);
        }
        StringBuffer sb = new StringBuffer();
        /*File file = new File("TestFuego1.part");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        for(String line = br.readLine() ; line != null ; line = br.readLine())
        {
        	sb.append(line + "\n");
        }
        */
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<meta charset=\"ISO-8859-1\">\n");
        sb.append("<title>Insert title here</title>\n");
        sb.append("<style type=\"text/css\">\n");
        sb.append("#map {\n");
        sb.append("  height: 100%;\n");
        sb.append("}\n");
        sb.append("\n");


        sb.append("html,body {\n");
        sb.append("  height: 100%;\n");
        sb.append("  margin: 0;\n");
        sb.append("  padding: 0;");
        sb.append("}\n");

        sb.append("\n");
        sb.append("</style>\n");
        sb.append("<script language=\"JavaScript\">\n");
        sb.append("var map;\n");
        sb.append("var marcador;\n");
        sb.append("var  limits  =  new  google.maps.LatLngBounds();\n");
        sb.append("var labels = 'Prueba de Marcador';\n");
        sb.append("var labelIndex = 0;\n");

        sb.append("function initMap() {\n");
        
        sb.append("   map = new google.maps.Map(document.getElementById('map'), {\n");
        sb.append("    center: {\n");
        sb.append("      lat: -33.4569400,\n");
        sb.append("      lng: -70.6482700\n");
        sb.append("    },\n");
        sb.append("    zoom: 13\n");
        sb.append("  });\n");
        sb.append("\n");
        sb.append("	var image1 = 'http://test.it-developers.cl/Fuegorojo.png'\n");
        sb.append("	var image2 = 'http://test.it-developers.cl/Fuegoazul.png'\n");
        sb.append("	var image3 = 'http://test.it-developers.cl/greenfire.png'\n");
	
        sb.append("\n");
        
        int i = 0;
        if(sttRangeResult != null)
        {
        	if(sttRangeResult.getOutDetalle1List() != null)
        	{
        		for(SttRangeOutDetalle1Result res : sttRangeResult.getOutDetalle1List())
        		{
        			
        			sb.append("var LatLngEvento" + i +" = {\n");
        			sb.append("     lat: " + res.getPosX() + ",\n");
        			sb.append("	    lng:  " + res.getPosY() + "\n");
        			sb.append("};");
        			sb.append("\n");
        			sb.append("var Marcador" + i  + " = new google.maps.Marker({\n");   
        			sb.append("    position: LatLngEvento" + i + ",\n");
        			sb.append("      map: map,\n");
        			sb.append("      icon: image2\n");
        			sb.append("  });\n");
        			i++;
        		}
        	}
        }
        
    	
        sb.append("marker.setMap(map);\n");
        sb.append(")}\n");

        sb.append("</script>\n");

        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<div id=\"map\"></div>\n");
        sb.append("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDlfhV-NrE3e1cYlrthQKgBmPQdlf4na9A&callback=initMap\" async defer>\n");
sb.append("\n");
sb.append("</script>\n");

sb.append("</body>\n");
sb.append("      </html>\n");
response.getOutputStream().print(sb.toString());
	}
	
    /**
     * Obtiene el Stateless Enterprise Session Bean
     */
    private PilAnaTskRemote getEJB() throws java.lang.Exception
    {
        if (ejbRef == null)
        {
             InitialContext context = new InitialContext();
             ejbRef = (PilAnaTskRemote)context.lookup("ejb/cl/metagen/pilanatsk/PilAnaTsk");//java:comp/env/ejbRef
        }
        return ejbRef;
    }

}
