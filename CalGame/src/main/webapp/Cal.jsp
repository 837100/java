<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cal Game!</title>
<%
int firstNm = (int) request.getAttribute("firstNm");
int secondNm = (int) request.getAttribute("secondNm");
String result = (String) request.getAttribute("result");
result = result == null ? "" : result;
int rightCount = (int)request.getAttribute("rightCount");
int wrongCount = (int)request.getAttribute("wrongCount");
%>
</head>
<body>
	<h1>
	<b>Cal game!Ï</b><br/>
	</h1>
	
	<p>Right Count : <%= rightCount %></p>
	<p>Wrong Count : <%= wrongCount %></p>
	
	<form action = "/Calgame" method = "post">
	<%= firstNm %> * <%= secondNm %> = <input type = "number" name="userInput">
	<input type = "submit" name="btn" value="input">
	<%
		if(result.length() > 0)
	%>
	
	<p>result : <%= result %> <br/>
	answer is <%= (int)request.getAttribute("answer") %>
	</p>
	</form>
</body>
</html>