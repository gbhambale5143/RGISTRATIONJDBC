<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
	<div class="conatainer-fluid">

		<div class="row">

			<div
				class="col-12  bg-dark text-light d-flex justify-content-center align-items-center "
				style="height: 100vh">

				<form action="register-servlet" method="post">
					<div class="form-group">
						<label>USERNAME</label> <input type="username"
							class="form-control" name="username"
							" aria-describedby="emailHelp">

					</div>

					<div class="form-group">
						<label">Email address</label> <input type="email" name="email"
							class="form-control" " aria-describedby="emailHelp">

					</div>
					<div class="form-group">
						<label">mobile</label> <input type="username"
							class="form-control" name="mobile" " aria-describedby="emailHelp">

					</div>

					<div class="form-group">
						<label">Password</label> <input type="password" name="password"
							class="form-control">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>





</body>
</html>