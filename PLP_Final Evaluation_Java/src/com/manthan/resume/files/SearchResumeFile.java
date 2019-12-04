package com.manthan.resume.files;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import com.manthan.bean.files.ResumeInfoBean;
@WebServlet("/searchServlet")
public class SearchResumeFile extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ResumeInfoBean rb=new ResumeInfoBean();//creating object type of resumeInfoBean
		String data=req.getParameter("search");
		System.out.println(data);
		String directory="C:\\newfile";//path of directory
		File maindirectory= new File( directory);
		if(maindirectory.exists()&& maindirectory.isDirectory()) {
			File array[]=maindirectory.listFiles();
			for(File file: array) {
				if(file.isFile()&&file.getName().substring(file.getName().lastIndexOf(".")).equals(".pdf")) {


					try {
						PDDocument pdoc = PDDocument.load(file);


						PDFTextStripper ps = new PDFTextStripper();


						String values = ps.getText(pdoc);


						String[] valuesArr=values.split("\\r?\\n");

						for(String stripper:valuesArr)
						{


							if(stripper.contains(data)) {
								String text2=ps.getText(pdoc);
								System.out.println("User,Your File content got Found");
								String filename=file.getName();
								rb.setFile_name(filename);
								req.setAttribute("DescMessage",rb);

								req.getRequestDispatcher("/search").forward(req, resp);//getting return on same page
								break;
							}

						}
						pdoc.close();	
					}

					catch(Exception e) {

						System.out.println("exception caught");
					}


				}
			}

		}


	}
}