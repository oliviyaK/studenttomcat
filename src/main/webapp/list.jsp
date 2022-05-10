<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students List</title>
</head>

<body>
<div>
    <h1>Students List</h1>
    <ul>
        <%
            out.println(request.getAttribute("studentName"));
        %>
    </ul>
</div>
</body>
</html>
