@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
@for(var user : page.getUsers())
<div>${user.getFirstName() + user.getLastName()}</div>
    <td><a href="/users/${user.getId()}">View</a></td>
@endfor
    <a href="/">Back</a>
`
)