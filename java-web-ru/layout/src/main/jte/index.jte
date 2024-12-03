@import exercise.dto.users.UsersPage
@import gg.jte.Content

@param UsersPage page
@param Content content

@template.layout.page(
content = @`
    <h1>Welcome to the Users Platform</h1>
    <body>
    <div class="mx-auto p-4 py-md-5">
        <main>
            <a href="/users">Пользователи</a>
        </main>
    </div>
    </body>
`
)
