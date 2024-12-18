@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
content = @`
    @if (page.getName() == null)
        <p>
            <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
        </p>
        @else
        <p>Привет, ${page.getName().toString()}!</p>
        <form action="${NamedRoutes.logoutPath()}" method="post">
            <button type="submit">Выйти</button>
        </form>
        @endif
`
)