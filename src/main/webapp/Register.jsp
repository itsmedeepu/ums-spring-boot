<html>

<head>
<style>
form {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 500px;
}

input {
	display: block;
}
</style>
</head>
<body>
	<form action="saveuser">
		<table>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td><label>Phone</label></td>

				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="text" name="password"></td>

			</tr>

			<tr>
				<td><label>Country</label></td>
				<td><input type="text" name="country"></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"></td>
			</tr>


		</table>



	</form>

</body>
</html>