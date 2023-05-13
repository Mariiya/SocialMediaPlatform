package com.platform.reverie;

import com.platform.reverie.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@SpringBootTest
class SocialMediaPlatformApplicationTests {

    @Test
    void checkUser(User user) {
        if (user.getId() == null) {
            throw new IllegalArgumentException("no user is found");
        }
        assert checkBirthDate(user);
    }

    private boolean checkBirthDate(User user){
        return user.getBirthDate() != null;
    }

}
