<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 조회</title>
</head>
<body>
	<div id="nav">
		<%@ include file="../include/nav.jsp"%>
	</div>
	
	<label>제목</label> ${view.title}
	<br />

	<label>작성자</label> ${view.writer}
	<br />

	<label>내용</label>
	<br /> ${view.content}
	<br />

	<div>
		<a href="/recipe/modify?rno=${view.rno}">게시물 수정</a>
		<a href="/recipe/delete?rno=${view.rno}">게시물 삭제</a>
	</div>
</body>
</html>