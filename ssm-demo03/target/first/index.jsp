<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<body>
<title>这是主页</title>
<h2>非常牛逼的整合</h2>
<>
    <form action="/student/allStudent" method="get">
<%--        <input type="hidden" name="_method" value="GET">--%>
<%--        姓名：<input type="text" name="name"><br/>--%>
        <input type="submit" value="查询所有">
    </form><br/><br/><br/><br/>

<form action="/student/addStudent" method="post">
    用户名称：<input type="text" name="name"><br/>
    <!-- <input type="hidden" name="_method" value="POST"> -->
    用户密码：<input type="text" name="password"><br/>
    用户性别：<input type="text" name="gender"><br/>
    用户年级：<input type="text" name="grate"><br/>
    <input type="submit" value="保存">
</form><br/><br/><br/><br/>


</h3>
</body>
</html>
