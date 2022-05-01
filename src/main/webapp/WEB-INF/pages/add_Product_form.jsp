    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <!doctype html>
    <html lang="en">
      <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <%@include file="./base.jsp"%>
      </head>
      <body>
        <div class="container mt-3">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                <h1 class="text-center mb-3">Fill the product Detail</h1>
                <form action="saveProduct" method="post">
                  <div class="form-group">
                    <label for="ProductName">Product Name</label>
                    <input type="text" class="form-control" id="ProductName" aria-describedby="" name="ProductName" placeholder="Enter Product Name">
                  </div>
                  <div class="form-group">
                     <label for="ProductDescription">Product Description</label>
                     <textarea class="form-control" name="ProductDescription" id="ProductDescription" rows="3"></textarea>
                   </div>
                  <div class="form-group">
                     <label for="Price">Price</label>
                     <input type="text" class="form-control" id="Price" aria-describedby="" name="Price" placeholder="Enter Price">
                  </div>
                  <button type="submit" class="btn btn-primary">Submit</button>
                </form>
                </div>
            </div>
        </div>
      </body>
    </html>