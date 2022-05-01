<html>

<head>
 <%@include file="./WEB-INF/pages/base.jsp"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>
    <div class="container mt-3">
    <h1 class="text-center mb-3">Product Details</h1>
        <div class="row">
            <div class="col-md-12">
                <table class="table">
                  <thead class="thead-dark">
                    <tr>
                      <th scope="col">S.No</th>
                      <th scope="col">Product Name</th>
                      <th scope="col">Description</th>
                      <th scope="col">Price</th>
                      <th scope="col">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${product }" var="p">
                        <tr>
                          <th scope="row">1</th>
                          <td>${p.ProductName }</td>
                          <td>${p.ProductDescription }</td>
                          <td>${p.Price }</td>
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>
                <div class="container text-center">
                    <a href="ProductAdd" class"btn btn-outline-success">Add Product</a>
                </div>
            </div>
        </div>
    </div>

</body>
</head>
</html>
