@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page


@template.layout.page(
content = @`
@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li class="alert alert-danger" role="alert"> ${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif

<form action="/articles" method="post">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Title</label>
        <input type="text" name="title" content="${page.getTitle()}" class="form-control" id="exampleFormControlInput1">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">Content</label>
        <textarea name="content" content="${page.getContent()}" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
    </div>
    <div class="col-12">
        <button class="btn btn-primary" type="submit">Add Article</button>
    </div>
    </form>
`
)