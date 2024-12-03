@import exercise.dto.users.UsersPage
@param UsersPage page

<!DOCTYPE html>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h1>Users</h1>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    @for(var user : page.getUsers()) {
    <tr>
        <td>${user.getId()}</td>
        <td>${user.getFirstName()}</td>
        <td>${user.getLastName()}</td>
        <td>${user.getEmail()}</td>
        <td><a href="/users/${user.getId()}">View</a></td>
    </tr>
    @endfor
    }
</table>
</body>
</html>
