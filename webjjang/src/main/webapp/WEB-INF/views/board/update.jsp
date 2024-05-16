<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
</head>
<body>
	<div class="container">
		<h2>일반게시판 글수정</h2>
		<form action="update.do" method="post">
			<div class="form-group">
				<label for="no">번호</label> <input id="no" name="no" required
					class="form-control" value="${vo.no }" readonly>
			</div>
			<div class="form-group">
				<label for="title">제목</label> <input id="title" name="title"
					required class="form-control" value="${vo.title }">
			</div>
			<div class="form-group">
				<label for="content">내용</label>
				<textarea rows="5" id="content" name="content" required
					class="form-control">${vo.content }</textarea>
			</div>
			<div class="form-group">
				<label for="writer">작성자</label> <input id="writer" name="writer"
					required class="form-control" value="${vo.writer }">
			</div>
			<div class="form-group">
				<label for="pw">비밀번호(본인확인용)</label> <input id="pw" name="pw"
					required type="password" class="form-control">
			</div>
			<button class="btn btn-default">수정</button>
		</form>
	</div>
</body>
</html>