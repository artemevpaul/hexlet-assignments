@import gg.jte.Content

@param Content content

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Users</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<header class="bg-dark text-white p-3">
    <nav>
        <ul class="nav">
            <li class="nav-item"><a class="nav-link text-white" href="/">Home</a></li>
            <li class="nav-item"><a class="nav-link text-white" href="/users">All Users</a></li>
        </ul>
    </nav>
</header>

<main class="container mt-4">
    ${content}
</main>

<footer class="bg-dark text-white text-center py-3 mt-4">
    <p>© 2024 | <a class="text-white" href="https://gitlab.com/your-profile" target="_blank">My GitLab Profile</a></p>
</footer>
</body>
</html>
