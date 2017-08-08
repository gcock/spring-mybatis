<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑</title>
</head>
<body>

	<h3><a href="./shouye">首页</a></h3>

<form action="${l.id }" method="post">
<label>序号：</label>	
<input name="id" readonly="readonly" value="${m1.id }"><br>

<label>姓名：</label>
<input name="name" type="text" value="${m1.name }"><br>

<label>联系电话：</label>
<input name="phone" type="text" value="${m1.phone }"><br>

<label>会员级别：</label>
<input name="level" type="text" value="${m1.level }"><br>

<label>会员卡号：</label>
<input name="inTime" type="text" value="${m1.cardNo }"><br>

<label>入会时间：</label>
<input name="cardNo" type="text" value="${m1.inTime }"><br>

<label></label>
<input type="submit" value="保存">
</form>
</body>
</html>