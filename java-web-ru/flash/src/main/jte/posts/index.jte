@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
content = @`
    <h2>Posts</h2>
    <body>
    <div class="mb-3">
        <ul>
            <li>${page.getFlash()}</li>
        </ul>
    </div>
    <table class="table table-striped">
        @for(var post : page.getPosts())
            <tr>
                <td>
                    ${post.getId()}
                </td>
                <td>
                    ${post.getName()} ${post.getBody()}
                </td>
            </tr>
        @endfor
    </table>
    </body>

`
)