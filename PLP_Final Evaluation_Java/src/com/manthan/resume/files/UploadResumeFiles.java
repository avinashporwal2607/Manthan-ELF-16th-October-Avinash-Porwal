package com.manthan.resume.files;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
@WebServlet("/uploadfile")
public class UploadResumeFiles extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(ServletFileUpload.isMultipartContent(request)){
			try {
				List <FileItem> files = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
				for(FileItem item : files){
					if(!item.isFormField()){
						String file_name = new File(item.getName()).getName();
						item.write( new File("C:\\Users\\CBT\\Desktop\\newfile" + File.separator +  file_name));
					}
				}

				request.setAttribute("DescMessage", "User,Your Resume file Upload Successfully");
			} catch (Exception io) {
				request.setAttribute("DescMessage", "Sorry User,Your Resume file is Failed to Upload\n " +io );
			}         		
		}else{

			request.setAttribute("DescMessage","This file is not finding");
		}
		request.getRequestDispatcher("/upload").forward(request, response);

	}

}
