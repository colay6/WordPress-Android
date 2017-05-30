package org.wordpress.android.ui.accounts.login;

public interface LoginListener {
    // Login Prologue callbacks
    void showEmailLoginScreen();
    void doStartSignup();

    // Login Email input callbacks
    void showMagicLinkRequestScreen(String email);
    void loginViaUsernamePassword();

    // Login Request Magic Link callbacks
    void showMagicLinkSentScreen(String email);
    void usePasswordInstead(String email);

    // Login Magic Link Sent callbacks
    void openEmailClient();

    // Login Site Address input callbacks
    void gotSiteAddress(String siteAddress);

    // Magic link attempt login callbacks
    void restartLogin();
    void loggedInViaMagicLink();

    // Help callback
    void help();
}
