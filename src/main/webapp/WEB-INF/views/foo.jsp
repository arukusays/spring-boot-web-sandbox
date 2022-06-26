<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Model Test</title>
</head>
<body>
    <h1>Model Test!!</h1>
    <div>hoge= ${hoge} </div>
    <div>bizMsg= ${bizMsg}</div>
    <div>bizMsg= ${bizMsg.msg}</div>
</body>
</html>