

### Project Overview:

This project highlights the integration of Spring Boot, MySQL, JPA, and Hibernate to create a streamlined Restful CRUD API. It serves as a testament to effective modern web application development practices.

♣ Java 11 \
♣ MySQL \
♣ JPA \
♣ Spring Boot



### ♦ Add Product
[POST] http://localhost:9191/api/v1/add-product
```
{
    "name" : "mobile",
    "quantity" : 1,
    "price" : 15000
}
```
```
{
    "name" : "ear-phone",
    "quantity" : 8,
    "price" : 5000
}
```
```
{
    "name" : "book",
    "quantity" : 2,
    "price" : 999
}
```
___
### ♦ Add Products
[POST] http://localhost:9191/api/v1/add-products

```
[
    {
    "name" : "x",
    "quantity" : 1,
    "price" : 535
}
,
{
    "name" : "y",
    "quantity" : 1,
    "price" : 353
}
]
```
___
### ♦ Get product by id
[GET] http://localhost:9191/api/v1/product-by-id/1
___
### ♦ Get product by name
[GET] http://localhost:9191/api/v1/product-by-name/mobile
___
### ♦ Delete product by id
[DEL] http://localhost:9191/api/v1/delete/5
___
### ♦ Update product
[PUT] http://localhost:9191/api/v1/update
```
{
    "id": 4,
    "name": "etc",
    "quantity": 5,
    "price": 10000
}
```
___
