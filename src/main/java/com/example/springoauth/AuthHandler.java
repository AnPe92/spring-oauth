package com.example.springoauth;

import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class AuthHandler
        extends SimpleUrlAuthenticationSuccessHandler
        implements AuthenticationSuccessHandler
{
    public AuthHandler() {
        super();

        setUseReferer(false);
    }
}
