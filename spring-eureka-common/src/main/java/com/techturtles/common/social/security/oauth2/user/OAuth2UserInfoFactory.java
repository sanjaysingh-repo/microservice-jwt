package com.techturtles.common.social.security.oauth2.user;


import java.util.Map;

import com.techturtles.common.config.exceptions.OAuth2AuthenticationProcessingException;
import com.techturtles.common.enums.AuthProvider;

public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.google.toString())) {
            return new GoogleOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(AuthProvider.facebook.toString())) {
            return new FacebookOAuth2UserInfo(attributes);
        } else if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        }else if (registrationId.equalsIgnoreCase(AuthProvider.twitter.toString())) {
            return new TwitterOAuth2UserInfo(attributes);
        }else if (registrationId.equalsIgnoreCase(AuthProvider.linkedIn.toString())) {
            return new LinkedInOAuth2UserInfo(attributes);
        }else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
