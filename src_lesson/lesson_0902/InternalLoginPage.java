package lesson_0902;

public class InternalLoginPage extends LoginPage {

    @Override
    protected String usernameLocator() {
        return "InternalLoginPage | usernameLocator";
    }

    @Override
    protected String passwordLocator() {
        return "InternalLoginPage | passwordLocator";
    }

    @Override
    protected String loginButtonLocator() {
        return "InternalLoginPage | loginButtonLocator";
    }
}
