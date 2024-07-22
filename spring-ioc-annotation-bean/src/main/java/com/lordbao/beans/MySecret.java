package com.lordbao.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author Lord_Bao
 * @Date 2024/7/22 17:14
 * @Version 1.0
 */
@Component
public class MySecret {
    @Value("${favorite.star}")
    private String favoriteStar;
    @Value("${favorite.book}")
    private String favoriteBook;
    @Value("${favorite.movie}")
    private String favoriteMovie;

    @Override
    public String toString() {
        return "MySecret{" +
                "favoriteBook='" + favoriteBook + '\'' +
                ", favoriteStar='" + favoriteStar + '\'' +
                ", favoriteMovie='" + favoriteMovie + '\'' +
                '}';
    }
}
