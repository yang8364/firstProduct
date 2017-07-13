<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>文件上传</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>单个上传</h1>
	<form method="post" action="FileUpload.do"
		enctype="multipart/form-data">
		<input type="file" name="file" />
		<button type="submit">提交</button>
	</form>
	<br>
	<br>
	===================================================
	<br>
	<div>
		<h1>批量上传</h1>
		<form method="post" action="uploadMoreFile.do"
			enctype="multipart/form-data">
			<input type="file" name="file1" /> <br /> <input type="file"
				name="file2" />
			<button type="submit">提交</button>
		</form>
	</div>
</body>
</html>