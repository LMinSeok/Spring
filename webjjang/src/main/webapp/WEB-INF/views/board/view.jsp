<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
#deleteDiv {
	display: none;
}
</style>

<script type="text/javascript">
	$(function() {
		$("#deleteBtn, #cancelBtn").click(function() {
			$("#deleteDiv").slideToggle(function() {
				// slide 동작이 끝나면 지우기 처리
				$("#pw").val(""); //비밀번호 데이터 지우기				
			});
			return false;
		});
	});
</script>

</head>
<body>
	<div class="container">
		<h2>일반게시판 글보기</h2>
		<table class="table">
			<tr>
				<th>번호</th>
				<td>${vo.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${vo.title }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${vo.content }</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${vo.writer }</td>
			</tr>
			<tr>
				<th>작성일</th>
				<td><fmt:formatDate value="${vo.writeDate }"
						pattern="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${vo.hit }</td>
			</tr>
		</table>
		<a href="update.do?no=${vo.no }" class="btn btn-default">수정</a> <a
			href="#" class="btn btn-default" id="deleteBtn">삭제</a> <a
			href="list.do" class="btn btn-default">리스트</a>
		<div id="deleteDiv">
			<form action="delete.do" method="post">
				<input name="no" type="hidden" value="${vo.no }">
				<div class="panel panel-default">
					<div class="panel-heading">글삭제는 본인확인을 위해서 비밀번호를 입력하셔야 합니다.</div>
					<div class="panel-body">
						<input name="pw" type="password" class="form-control" required
							id="pw">
					</div>
					<div class="panel-footer">
						<button class="btn btn-default">삭제</button>
						<button id="cancelBtn" class="btn btn-default" type="button">취소</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>