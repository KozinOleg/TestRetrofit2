package com.example.ok.rxandroidandretrofit;

/**
 * Created by ok on 5/14/16.
 */
public class Contributor {
    public final String login;
    public final int contributions;

    public Contributor(String login, int contributions) {
        this.login = login;
        this.contributions = contributions;
    }
}
