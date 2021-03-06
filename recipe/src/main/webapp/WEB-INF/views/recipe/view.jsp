<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<a href="/recipe/modify?rno=${view.rno}">게시물 수정</a> <a href="/recipe/delete?rno=${view.rno}">게시물 삭제</a>
	</div>

	<!-- 댓글 시작 -->
	<hr />
	<ul>
		<!-- 
		<li>
			<div>
				<p>첫번째 댓글 작성자</p>
				<p>첫번째 댓글</p>
			</div>
		</li>
		<li>
			<div>
				<p>두번째 댓글 작성자</p>
				<p>두번째 댓글</p>
			</div>
		</li>
		<li>
			<div>
				<p>세번째 댓글 작성자</p>
				<p>세번째 댓글</p>
			</div>
		</li>
		-->


		<!-- <c:forEach items="${reply}" var="reply">
			<li>
				<div>
					<p>${reply.writer}/ ${reply.date}</p>
					<p>${reply.content}</p>
				</div>
			</li>
		</c:forEach> -->

		<c:forEach items="${comment}" var="comment">
			<li>
				<div>
					<p>${comment.writer}
						/
						<fmt:formatDate value="${comment.date}" pattern="yyyy-MM-dd" />
					</p>
					<p>${comment.content}</p>
				</div>
			</li>
		</c:forEach>
	</ul>

	<div>

		<form method="post" action="/comment/write">
			<p>
				<label>댓글 작성자</label>
				<input type="text" name="writer">
			</p>
			<p>
				<textarea rows="5" cols="50" name="content"></textarea>
			</p>
			<p>
				<input type="hidden" name="rno" value="${view.rno}">
				<button type="submit">댓글 작성</button>
			</p>
		</form>
	</div>
	<!-- 댓글 끝 -->
</body>
</html>