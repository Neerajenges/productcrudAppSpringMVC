<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">

			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${Products}" var="p">
						<tr>
							<th scope="row">EN${p.pid}GES</th>
							<td>${p.name}</td>
							<td>${p.description}</td>
							<td class="font-weight-bold"> &#x20B9;${p.price}</td>
							<td><a href="delete/${p.pid}"><i class="fa-solid fa-trash-can text-danger" style="font-size:30px"></i></a>
								<a href="update/${p.pid}"><i class="fas fa-pen-nib text-primary" style="font-size:30px"></i></a>
							</td>
						</tr>
						</c:forEach>
						
					</tbody>
				</table>
				<div class="container text-center">
				<a href="add-product" class="btn btn-outline-success">Add Product</a>
				</div>

			</div>
		</div>

	</div>
</body>
</html>
