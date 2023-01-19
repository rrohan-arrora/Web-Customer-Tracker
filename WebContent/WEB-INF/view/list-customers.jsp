<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<link type="text/css"
		  	  rel="stylesheet"
		  	  href="${pageContext.request.contextPath}/resources/css/style.css"/>
		<meta charset="UTF-8">
		<title>List Customers</title>
	</head>
	
<body>
	<div id="wrapper">
		<div id="header">
			<h2>
				CRM- Customer Relationship Manager
			</h2>
		</div>
		
		<div id="container">
			<div id="content">
			<!-- add out html table here -->
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<c:forEach var="c" items="${customers}">
					<tr>
						<td>
							${c.firstName}
						</td>
						<td>
							${c.lastName}
						</td>
						<td>
							${c.email}
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</div>
		
	</div>
</body>
</html>