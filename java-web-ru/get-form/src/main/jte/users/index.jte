@import exercise.dto.users.UsersPage
@param UsersPage page


@template.layout.page(
content = @`
    <form action="/users" method="get">
        <input type="search" name="term" value="${page.getTerm()}" />
        <input type="submit" value="Search" />
    </form>
    <ul>
        @if(page.getUsers().isEmpty())
            <p></p>
        @else
        @for(var user : page.getUsers())
        <div>${user.getFirstName()+ " " + user.getLastName()}</div>
        @endfor
        @endif
        <a href="/">Back</a>
    </ul>
`
    )
