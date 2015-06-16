<%@page language="java" %>
<html>
<head>
</head>
<body>
<% 
	if (System.getProperty("ccapi.password") == null) {
%>
<h1>MISSING PROPERTIES</h1>
<p>
Please remember to set the server's JVM property <b>ccapi.password</b> following the deployment document instructions.
</p>
<% } else	if (System.getProperty("ccapi.targetHost") == null) { %>
<h1>MISSING PROPERTIES</h1>
<p>
Please remember to set the server's JVM property <b>ccapi.targetHost</b> following the deployment document instructions.
</p>
<% } else	if (System.getProperty("ccapi.adminConsole") == null) { %>
<h1>MISSING PROPERTIES</h1>
<p>
Please remember to set the server's JVM property <b>ccapi.adminConsole</b> following the deployment document instructions.
</p>
<% } else { %>
<h1>CC-API-Proxy is OK</h1>
<ol>
<li>Targeting host is <%=System.getProperty("ccapi.targetHost").split("\\.")[0]%>
<li>Admin console is <%=System.getProperty("ccapi.adminConsole").toLowerCase().contains("admin")?"ENABLED":"DISABLED"%>
</ol>
<% } %>
</body>
</html>
