<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resource/style/style.css">
    <meta charset="utf-8">
    <title>GaMMaG: Главная страница</title>
</head>
<body>
<div class="header">
    <div class="logo">
        <a href="main" >
            <img src="resource/logo.jpg" href="main"
                 alt="GaMMaG"
                 title="GaMMaG"
                 width="491" height="102"
            />
        </a>
    </div>
    <div class="main_top">
    <div class="title">
        <h2>Главная страница</h2>
    </div>
        <jsp:include page="/WEB-INF/template/menu.jsp"/>
    </div>
</div>
<hr>
<h2>GaMMaG: Магазин игр</h2>
<p>Добрро пожаловать в магазин электронных игр</p>
<hr>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
