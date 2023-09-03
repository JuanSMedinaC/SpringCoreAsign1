<%@ page import="java.time.LocalDate" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="com.example.demowebprojectee.HolaMundo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.demowebprojectee.Arte" %>
<%@ page import="com.example.demowebprojectee.Aplicacion" %>
<%@ page import="org.springframework.context.annotation.AnnotationConfigApplicationContext" %>
<%@ page import="com.example.demowebprojectee.MyBlogs" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<%
  LocalDate fecha = LocalDate.now();
  out.println(fecha);
  ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
  HolaMundo hola = (HolaMundo) context.getBean("HolaMundo");
  out.println(hola.getMessage());
  HolaMundo hola2 = (HolaMundo) context.getBean("HolaMundo2");
  out.println(hola2.getMessage());
  HolaMundo hola3 = (HolaMundo) context.getBean("HolaMundo3");
  out.println(hola3.getMessage());

%>
<br/>
<h1> <%= "Obra de arte"%></h1>
<ul>
  <%
    Arte obra = (Arte) context.getBean("Arte");
    Arte obra1 = (Arte) context.getBean("Arte1");
    Arte obra2 = (Arte) context.getBean("Arte2");
  %>
  <li> <%=obra.toString() %></li>
  <li> <%=obra1.toString() %></li>
  <li> <%=obra2.toString() %></li>
</ul>
<h1><%= "Blog"%></h1>
<ul>
<%
  MyBlogs blog = new MyBlogs();
  MyBlogs blog1 = (MyBlogs) context.getBean("Blog");
  MyBlogs blog2 = (MyBlogs) context.getBean("Blog1");
%>
  <li><b> <%=blog.getBlogName()%></b></li>
  <li><b> <%=blog1.getBlogName()%></b></li>
  <li><b> <%=blog2.getBlogName()%></b></li>

</ul>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>