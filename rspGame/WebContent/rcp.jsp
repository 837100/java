<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>RCP</title>
<%
String user = (String) request.getAttribute("user");
user = user == null ? "" : user;
String com = (String) request.getAttribute("com");
com = com == null ? "" : com;
String result = (String) request.getAttribute("result");
result = result == null ? "" : result;
%>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Main" method="post">
		<input type="radio" name="rcp" value="rock">rock <input
			type="radio" name="rcp" value="scissors">scissors <input
			type="radio" name="rcp" value="paper">paper <input
			type="submit" name="btn" value="enter">
	</form>
	<%
	if (result.length() > 0) {
	%>
	<p>
		user select :
		<%=user%>
	</p>
	<p>
		computer select :
		<%=com%>
	</p>
	<p>
		result :
		<%=result%></p>
	<%
	}
	%>
</body>
</html>