<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Session Attributes Test</title>
</head>
<body>
    <h1>Session Attributes Confirm</h1>
    <div>msg: ${bizMsg.msg}</div>
    <form:form method="post" action="${pageContext.request.contextPath}/sessiontest/" modelAttribute="sessionSearchForm">
        <table border="1" cellpadding="5">
           <tr>
              <th>名前</th>
              <td>${sessionSearchForm.searchName}</td>
           </tr>
           <tr>
              <th>生年月日</th>
              <td>${sessionSearchForm.birthday}</td>
            </tr>
        </table>
        <button type="submit" formaction="register">登録</button>
    </form:form>
</body>
</html>