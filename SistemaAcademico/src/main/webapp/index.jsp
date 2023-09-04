<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.example.sistemaacademico.StudentResult" %>
<%@ page import="com.example.sistemaacademico.Libro" %>
<%@ page import="com.example.sistemaacademico.Autor" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>"PUNTOS 7 y 8" </h1>
<ul>
    <li>
    <%
        ApplicationContext conext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentResult estudiante1 = (StudentResult) conext.getBean("estudiante1");
        out.println(estudiante1.toStirng());
    %>
    </li>
    <li>
        <%
        StudentResult estudiante2 = (StudentResult) conext.getBean("estudiante2");
        out.println(estudiante2.toStirng());
        %>
    </li>
</ul>
<h2>Libros</h2>
<ul>
    <li>
        <% Libro libro1 = (Libro)  conext.getBean("libro1");
            out.println(libro1.toString());
        %>
    </li>
    <li>
        <% Libro libro2 = (Libro)  conext.getBean("libro2");
            out.println(libro2.toString());
        %>
    </li>
    <li>
        <% Libro libro3 = (Libro)  conext.getBean("libro3");
            out.println(libro3.toString());
        %>
    </li>
</ul>
<h2>AUTOR</h2>
<ul>
    <li><% Autor autor1 = (Autor) conext.getBean("autor1");
            out.println(autor1.toString());
    %>
    </li>
</ul>
<br/>
<a></a>
</body>
</html>