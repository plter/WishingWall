<%@ page import="com.jikexueyuan.wishingwall.front.Point" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.jikexueyuan.wishingwall.db.WishEntity" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>许愿墙</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    <script src="static/js/jquery-2.1.1.min.js"></script>
    <script src="static/js/modal.js"></script>
</head>
<body>
<div class="my_con">
    <div class="my_header">
        <div class="my_c_left">
            <img src="static/images/c_left.png">
        </div>
        <div class="my_c_right">
            <img src="static/images/c_right.png">
        </div>
        <div class="my_add">
            <img src="static/images/add.png" class="my_btn" data-toggle="modal" data-target=".bs-example-modal-sm">
            <p class="addtxt">Make a wish</p>
        </div>
    </div>

    <%--<div class="my_content">--%>
        <%--<p>其实我只是有一个愿望</p>--%>
    <%--</div>--%>

    <%

        List<Point> points  = new ArrayList<Point>();
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                points.add(new Point(i,j));
            }
        }
        for(int a = 0;a<64;a++){
            points.add(points.remove((int)(Math.random()*points.size())));
        }

        List<WishEntity> list =(List<WishEntity>) request.getAttribute("wishList");
        for(int i = 0;points.size()>0&&i<list.size();i++){
            WishEntity entity = list.get(i);
            Point p = points.remove(0);
            request.setAttribute("margetTop",p.getX()*250);
            request.setAttribute("margetLeft",p.getY()*120);
            request.setAttribute("name",entity.getName());
            request.setAttribute("content",entity.getContent());
    %>
    <div class="my_content" style="margin-top: ${margetTop}px;margin-left: ${margetLeft}px;">
        <p>${content}<br><br>${name}</p>
    </div>
        <%}%>

    <div class="my_footer">
        <div class="my_b_bg">
            <img src="static/images/b_bg.png">
        </div>
        <div class="my_b_left">
            <img src="static/images/b_left.png">
        </div>
        <div class="my_b_right">
            <img src="static/images/b_right.png">
        </div>
    </div>

</div>
<div class="modal fade bs-example-modal-sm" id="myModal" role="dialog" aria-label="myModalLabel" aira-hidden="true">
    <div class="modal-dialog modal-sm">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title">添加我的愿望</h4>
            </div>
            <div class="modal-body">
                <form action="<%out.print(request.getContextPath());%>/addwish" method="post">
                    <div class="form-group">
                        <input type="text" name="name" class="form-control text" placeholder="键入愿望内容(可以输入50个字)">
                    </div>
                    <div class="form-group username">
                        <input type="text" name="content" class="form-control username" placeholder="键入署名">
                        <input type="checkbox">匿名
                    </div>
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-primary" value="确定">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

</body>
</html>