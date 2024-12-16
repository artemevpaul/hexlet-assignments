@import exercise.dto.posts.PostPage
@import exercise.util.NamedRoutes
@param PostPage page

@template.layout.page(
    content = @`
        <main>
            <div class="mx-auto p-4 py-md-5">
                <h1>${page.getPost().getName()}</h1>
            </div>

            <div class="mx-auto p-4 py-md-5">
                ${page.getPost().getBody()}
            </div>
            <!-- BEGIN -->
            <nav>
                <a href="/posts/${page.getPost().getId()}/edit" class="btn btn-primary">Edit post</a>
            </nav>
            <!-- END -->
        </main>
    `
)
