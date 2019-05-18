<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/6
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>Student列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    最牛逼的操作
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学生编号</th>
                    <th>学生姓名</th>
                    <th>学生密码</th>
                    <th>学生性别</th>
                    <th>学生年级</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${list}" varStatus="status">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.password}</td>
                        <td>${student.gender}</td>
                        <td>${student.grate}</td>
                        <td>
                            <form action="/student/deleStudent/${student.id}" method="post">
                                <input type="hidden" name="_method" value="DELETE"/>
<%--                                编号：<input type="text" name="id"><br/>--%>
                                <input type="submit" value="删除"><br/>
                            </form>
                        </td>
                        <td>
                            <form action="/student/updateStudent" method="post">
                                <input type="hidden" name="_method" value="PUT"/>
                                    <%--                                编号：<input type="text" name="id"><br/>--%>
                                <input type="submit" value="更新"><br/>
                            </form>
                        </td>
<%--                        <td>--%>
<%--                            <a href="${path}/paper/toUpdatePaper?id=${student.id}">更改</a> |--%>
<%--                            <a href="<%=appPath%>/paper/del/${student.id}">删除</a>--%>
<%--                        </td>--%>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
<%--            <p>每页${page.pageSize}条 当前页${page.pageSize}条 ${page.pageNum}/${page.pages}页--%>

<%--                记录数${page.total}--%>
<%--            </p>--%>
<%--            <c:if test="${page.isFirstPage==true}"><a>首页</a></c:if>--%>
<%--            <c:if test="${page.isFirstPage==false}">--%>
<%--                <a href="/student/allStudent?page=${page.firstPage}">首页</a>--%>
<%--            </c:if>--%>
<%--            <c:if test="${page.hasPreviousPage==true}">--%>
<%--                <a href="/student/allStudent?page=${page.prePage}">上一页</a>--%>
<%--            </c:if>--%>
<%--            <c:if test="${page.hasPreviousPage==false}"><a>上一页</a></c:if>--%>
<%--            <c:if test="${page.hasNextPage==true}">--%>
<%--                <a href="/student/allStudent?page=${page.nextPage}">下一页</a>--%>
<%--            </c:if>--%>
<%--            <c:if test="${page.hasNextPage==false}"><a>下一页</a></c:if>--%>
<%--            <c:if test="${page.isLastPage==true}"><a>末页</a></c:if>--%>
<%--            <c:if test="${page.isLastPage==false}">--%>
<%--                <a href="/student/allStudent?page=${page.lastPage}">末页</a>--%>
<%--            </c:if>--%>
        </div>
      </div>
  </div>
