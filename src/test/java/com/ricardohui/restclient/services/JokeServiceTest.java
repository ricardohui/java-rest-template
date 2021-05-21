package com.ricardohui.restclient.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class JokeServiceTest {
    private Logger logger = LoggerFactory.getLogger(JokeService.class);

    @Autowired
    private JokeService jokeService;

    @Test
    void getJoke() {
        final String joke = jokeService.getJoke("Donald", "Trump");
        logger.info(joke);
        assertTrue(joke.contains("Donald") || joke.contains("Trump"));

    }
}