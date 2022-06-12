<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Hello JSP</title>
</head>
<body>
    <h1>Hello, Boot</h1>
    <form:form method="post" action="/search" modelAttribute="searchForm">
        <table border="1" cellpadding="5">
           <tr>
              <th>名前</th>
              <td><form:input path="searchName" /></td>
           </tr>
           <tr>
              <th>生年月日</th>
              <td><form:input path="birthday" type="date" oge="foo" /></td>
            </tr>
        </table>
        <form:button name="hoge" type="submit">ボタンです</form:button>
    </form:form>
</body>
</html>