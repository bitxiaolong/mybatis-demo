<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/17
  Time: 1:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>修改学生信息页面</title>
</head>
<body>

<form action="/student/addStudent" method="post">
    用户名称：<input type="text" name="name"><br/>
    <!-- <input type="hidden" name="_method" value="POST"> -->
    用户密码：<input type="text" name="password"><br/>
    用户性别：<input type="text" name="gender"><br/>
    用户年级：<input type="text" name="grate"><br/>
    <input type="submit" value="保存">
</form>

</body>
</html>
