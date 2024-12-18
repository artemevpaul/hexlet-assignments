package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.Security;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

import javax.security.auth.kerberos.EncryptionKey;

public class SessionsController {

    // BEGIN
    public static void build(Context ctx) throws Exception{
        var page = new LoginPage(null, null);
        ctx.render("build.jte", model("page", page));
    }
    public static void main(Context ctx) {
        var page = new MainPage(ctx.sessionAttribute("currentUser"));
        ctx.render("index.jte", model("page", page));
    }

    public static void create(Context ctx) {

        var name = ctx.formParam("name");
        var password = ctx.formParam("password");

        if (UsersRepository.existsByName(name) &&
                (UsersRepository.findByName(name).get()).getPassword().equals(Security.encrypt(password))) {
            ctx.sessionAttribute("currentUser", name);
            ctx.redirect("/");

        } else {
            var page = new LoginPage(name, "Wrong username or password.");
            ctx.render("build.jte", model("page", page));
        }
    }

    public static void delete(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect("/");
    }
    // END
}
