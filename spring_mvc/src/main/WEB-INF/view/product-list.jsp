<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All products</title>
</head>
<body>
    <c:foreach var="product" items=${products}>
    <span>${product.id} ${product.title} ${product.cost}</span>
    </c:foreach>
</body>