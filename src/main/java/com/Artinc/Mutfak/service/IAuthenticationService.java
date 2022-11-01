package com.Artinc.Mutfak.service;

import com.Artinc.Mutfak.model.User;

public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
