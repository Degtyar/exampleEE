<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
 <head>
     <link rel="stylesheet" type="text/css" href="resource/style/style.css">
     <meta charset="utf-8">
     <title>Каталог</title>
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
            <h2>Каталог</h2>
        </div>
            <jsp:include page="/WEB-INF/template/menu.jsp"/>
    </div>
</div>
<hr>
    <div class="catalog">
        <div class="catalog_item">
            <div class="img">
                <a href="resedent2.jsp">
                <img src="resource/resedent2.jpg"
                     alt="resedent2"
                     title="resedent2"
                     width="299" height="168"
                />
                </a>
            </div>
            <div class="catalog_item">
                <p>RESIDENT EVIL 2</p>
            </div>
        </div>
        <div class="catalog_item">
            <div class="img">
                <a href="fifa.jsp">
                    <img src="resource/fifa_l.jpg"
                         alt="fifa"
                         title="fifa"
                         width="299" height="168"
                    />
                </a>
            </div>
            <div class="catalog_item">
                <p>Стандартное издание FIFA 19</p>
            </div>
        </div>
    </div>
<hr>
<jsp:include page="/WEB-INF/template/footer.jsp"/>
</body>
</html>
