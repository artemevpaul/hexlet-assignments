@import exercise.dto.posts.EditPostPage
@param EditPostPage page

@template.layout.page(
content = @`
    @if(page.getErrors() != null)
        <div class="alert alert-danger">
            <ul>
                @for(var validator : page.getErrors().values())
                    @for(var error : validator)
                        <li>${error.getMessage()}</li>
                    @endfor
                @endfor
            </ul>
        </div>
    @endif

    <form action="/posts/${page.getId()}" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Название</label>
            <input type="text" id="name" name="name" class="form-control" value="${page.getName()}" />
        </div>

        <div class="mb-3">
            <label for="body" class="form-label">Содержание</label>
            <textarea id="body" name="body" class="form-control">${page.getBody()}</textarea>
        </div>

        <button type="submit" class="btn btn-primary">Сохранить</button>
    </form>
`
)
