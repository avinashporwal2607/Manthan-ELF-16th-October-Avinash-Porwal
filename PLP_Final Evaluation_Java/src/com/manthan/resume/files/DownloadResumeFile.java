package com.manthan.resume.files;

import java.io.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
@WebServlet("/download")  
public class DownloadResumeFile extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter(); 
String filename=(String)request.getParameter("path");

String fullyfilepath = "C:\\newfile\\";   
response.setContentType("APPLICATION/PDF");   //type of pdf format
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
  
FileInputStream fis = new FileInputStream(fullyfilepath + filename);  
            
int filecontainer;   
while ((filecontainer=fis.read()) != -1) {  
out.write(filecontainer);   
}   
fis.close();   
out.close();   

}  
  
}  