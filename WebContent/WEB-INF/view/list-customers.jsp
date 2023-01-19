<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
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
</body>
</html>