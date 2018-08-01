package com.amanoese.springbasicauthexample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.Charset;
import java.util.Base64;

@Slf4j
@Service
public class MyRememberMeServices implements RememberMeServices {

    @Override
    public Authentication autoLogin(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
    @Override
    public void loginSuccess(HttpServletRequest request, HttpServletResponse response, Authentication successfulAuthentication) {
        log.info("login:{}",successfulAuthentication.getName());
    }

    @Override
    public void loginFail(HttpServletRequest request, HttpServletResponse response) {
        String base64Credentials = request.getHeader("authorization").substring("Basic".length()).trim();
        String credentialSting = new String(Base64.getDecoder().decode(base64Credentials), Charset.forName("UTF-8"));
        String username = credentialSting.split(":")[0];

        log.error("login fail:{}",username);
    }
}
