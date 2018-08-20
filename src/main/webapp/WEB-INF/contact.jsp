<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">
    <meta charset="UTF-8">
    <title>Контакты</title>
</head>
<body>
<div class="header">
    <a href="main">
        <img src="resource/logo.jpg"
             alt="GaMMaG"
             title="GaMMaG"
             width="491" height="102"
        />
    </a>
    <div class="main_top">
    <div class="title">
        <h2>Контакты</h2>
    </div>
        <jsp:include page="/WEB-INF/template/menu.jsp"/>
    </div>
</div>
<hr>
<p><input placeholder="Ваше имя"></p>
<p><input type="email" class="email" placeholder="example@mail.com"></p>
<p><input placeholder="Тема обращения"></p>
<p>Комментарий<Br>
    <textarea name="comment" cols="40" rows="3"></textarea>
</p>
<button type="button" value="submit"> Оправить </button>
<button type="button" value="reset"> Отчистить </button>
<h3>ул. Титова 1 </h3>
<p><a href="tel:+89232323233">+8 923 232 3233</a></p>
<p><a href="mailto:example@example.ru">example@example.ru</a></p>
<script type="text/javascript" charset="utf-8" async src="https://api-maps.yandex.ru/services/constructor/1.0/js/?um=constructor%3Abcd26c2fd5193dee0563c83989f34bc29da14948ee8df1064005eb4de7fdf2d5&amp;width=500&amp;height=400&amp;lang=ru_RU&amp;scroll=true"></script>
<hr>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>