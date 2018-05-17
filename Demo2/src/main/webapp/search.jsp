<%--
  Created by IntelliJ IDEA.
  User: 96166
  Date: 2018/5/13
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
    <title>Ajax异步搜索</title>
</head>
<body>
<form class="navbar-form navbar-right" role="search">
    <div class="form-group" style="position:relative">
        <input id="search" type="text" class="form-control"
               placeholder="Search" onkeyup="searchWord(this)">
        <div id="showDiv" style="display:none; position:absolute;z-index:1000;background:#fff; width:179px;border:1px solid #ccc;">

        </div>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
</form>

    <script type="text/javascript">
        function clickSearch(obj) {
            $("#search").val($(obj).html());
            $("#showDiv").css("display","none");

        }
        function searchWord(obj) {
            var word = $(obj).val();

            var content = "";
            $.post(
                "/ajaxServlet",
                {"word":word},
                function (data) {
                    if(data.length>0){
                        for (var i = 0; i < data.length; i++) {
                            content += "<div style='padding:5px;cursor:pointer' onclick='clickSearch()'>" + data[i] + "</div>"
                        }
                        $("#showDiv").html(content).css("display", "block");
                    }
                },
                "json"

            );

        }
    </script>

</body>
</html>
