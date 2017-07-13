<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="js/qrcode.js"></script>

</head>
<body>
	<div style="text-align:center">
		<div id="qrcode" ></div>
		<!-- <br/> -->
		<button id="send">点击更换验证码</button>
	</div>
	<script type="text/javascript">
		window.onload = function() {
			var qrcode = new QRCode(document.getElementById("qrcode"), {
				width : 150,//设置宽高
				height : 150
			});
			qrcode.makeCode("http://www.baidu.com");
			document.getElementById("send").onclick = function() {
				var str = "http://localhost:8080/etoak/test.do?uid="+guid();
				qrcode.makeCode(str);
			}
		}
		function guid() {
		    function S4() {
		       return (((1+Math.random())*0x10000)|0).toString(16).substring(1);
		    }
		    return (S4()+S4()+"-"+S4()+"-"+S4()+"-"+S4()+"-"+S4()+S4()+S4());
		}
	</script>
</body>
</html>