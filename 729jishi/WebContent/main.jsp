<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<h3><a href="./shouye">首页</a></h3>
<h1 align="center">会员管理系统</h1>
<center>
<form action="./chaxun" >
<label>姓名：</label>
<input name="name" type="text">
<label>会员卡号：</label>
<input name="cardNo" type="text">
<label></label>
<input type="submit" value="查询">
</form>
</center>

<form action="./create" method="post">
<div align="right">
<input type="submit" value="新增">
</div>
</form>

<table width="500" height="300" border="1px" align="center" bgcolor="#FAEBD7">
<tr align="center">
<td>序号</td>
<td>姓名</td>
<td>联系电话</td>
<td>会员级别</td>
<td>会员卡号</td>
<td>入会时间</td>
<td>操作</td>
</tr>


<c:forEach items="${member }" var="m"> 
<tr align="center">
<td>${m.id }</td>
<td>${m.name }</td>
<td>${m.phone }</td>
<td>${m.level }</td>
<td>${m.cardNo }</td>
<td><fmt:formatDate value="${m.inTime }" pattern="yyyy-MM-dd"/></td>

<td>
<a href="${m.id }">修改</a>
<form action="./${m.id }/delete" method="post">
	<input type="submit" value="删除">
</form>
</td>
</tr>
</c:forEach>


</table>
</body>
</html>