<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">
    <meta charset="utf-8">
    <title>Ошибка</title>
</head>
<body class="magazine">
<div class="header">
    <div class="logo">
        <a href="main.jsp" >
            <img src="resource/logo.jpg" href="main"
                 alt="GaMMaG"
                 title="GaMMaG"
                 width="491" height="102"
            />
        </a>
    </div>
    <div class="main_top">
        <div class="title">
            <h2>Ошибка</h2>
        </div>
        <jsp:include page="/WEB-INF/template/menu.jsp"/>
    </div>
</div>
<hr>
<div class="cart">
    <p>Страница не найдена</p>

</div>
<hr>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
