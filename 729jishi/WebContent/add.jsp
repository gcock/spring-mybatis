<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><a href="./shouye">首页</a></h3>

<h1 align="center">会员管理系统</h1>
<h3 align="center">添加会员</h3>
<center>
<form action="./add" method="post">

<label>姓名：</label>
<input name="name" type="text"><br>

<label>联系电话：</label>
<input name="phone" type="text" ><br>

<label>会员级别：</label>
<input name="level" type="text" ><br>

<label>会员卡号：</label>
<input name="cardNo" type="text" ><br>

<label>入会时间：</label>
<input name="inTime" type="text" value=><br>

<label></label>
<input type="submit" value="保存">
</form>
</center>
</body>
</html>