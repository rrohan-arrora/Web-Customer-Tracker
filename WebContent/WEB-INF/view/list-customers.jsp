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
			
			<!-- put new button: Add customer -->
			
			<input type="button" value="Add Customer"
				   onClick="window.location.href='showFormForAdd'; return false;"
				   class="add-button" />
			
			<!-- add out html table here -->
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Actions</th>
				</tr>
				
				<c:forEach var="c" items="${customers}">
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${c.id }" />
					</c:url>
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
						<td> 
							<a href="${updateLink}"> Update </a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</div>
		
	</div>
</body>
</html>