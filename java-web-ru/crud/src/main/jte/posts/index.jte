@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
content = @`
    <div class="mx-auto p-4 py-md-5">
        <main>
            <h1>Все статьи</h1>

            @if(page.getPosts().isEmpty())
                <p>Нет доступных статей.</p>
            @else
                <table class="table table-striped">
                    @for(var post : page.getPosts())
                        <tr>
                            <td>
                                <a href="/posts/${post.getId()}">${post.getName()}</a>
                            </td>
                        </tr>
                    @endfor
                </table>
            @endif

            <div class="pagination">
                <nav>
                    @if(page.getPageId() > 1)
                        <a href="?page=${page.getPageId() - 1}" class="btn btn-primary">Назад</a>
                    @endif
                    <a href="?page=${page.getPageId() + 1}" class="btn btn-primary">Вперед</a>
                </nav>
            </div>
        </main>
    </div>
`
)

