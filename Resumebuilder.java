package com.gaurav.onlineresumebuilder;

import java.io.*;
import com.itextpdf.text.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
// Import itextpdf Writer to convert into pdf
import com.itextpdf.text.pdf.PdfWriter;


@WebServlet(name = "ResumeServlet", value = "/resume.do")
public class Resumebuilder extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/pdf");

        // Retrieve form data
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipcode");
        String skills = request.getParameter("skills");
        String experience = request.getParameter("experience");
        String education = request.getParameter("education");
        String references = request.getParameter("references");

        // Generate the resume in PDF format
        Document document = new Document();
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PdfWriter writer = PdfWriter.getInstance(document, baos);

            // Resume header
            document.open();
            Paragraph header = new Paragraph();
            header.setAlignment(Element.ALIGN_CENTER);
            header.add(new Phrase(firstName + " " + lastName));
            header.add(Chunk.NEWLINE);
            header.add(new Phrase(email));
            header.add(Chunk.NEWLINE);
            header.add(new Phrase(phone));
            header.add(Chunk.NEWLINE);
            header.add(Chunk.NEWLINE);
            document.add(header);

            // Resume body
            Paragraph body = new Paragraph();
            body.add(new Phrase("Address: " + address + ", " + city + ", " + state + " - " + zipcode));
            body.add(Chunk.NEWLINE);
            body.add(new Phrase("Skills: " + skills));
            body.add(Chunk.NEWLINE);
            body.add(new Phrase("Experience: " + experience));
            body.add(Chunk.NEWLINE);
            body.add(new Phrase("Education: " + education));
            body.add(Chunk.NEWLINE);
            body.add(new Phrase("References: " + references));
            body.add(Chunk.NEWLINE);
            document.add(body);

            document.close();

            // Send the generated PDF as response
            baos.writeTo(response.getOutputStream());
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
