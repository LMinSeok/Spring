<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>일반게시판 글등록</h1>
	<form action="write.do" method="post">
		<div class="form-group">
			<label for="title">제목</label> 
			<input id="title" name="title" required>
		</div>
		<div class="form-group">
			<label for="content">내용</label>
			<textarea rows="5" id="content" name="content" required></textarea>
		</div>
		<div class="form-group">
			<label for="writer">작성자</label> 
			<input id="writer" name="writer" required>
		</div>
		<div class="form-group">
			<label for="pw">비밀번호</label> 
			<input id="pw" name="pw" required type="password">
		</div>
		<div class="form-group">
			<label for="pw2">비밀번호 확인</label> 
			<input id="pw2" required type="password">
		</div>
		<button>등록</button>
	</form>
</body>
</html>