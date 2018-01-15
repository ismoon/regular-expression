package com.ismoon.regular_expression.checker;

/**
 * @author ismoon on 2018. 1. 14.
 */
public abstract class AbstractRegexpChecker {

    protected String regexp = null;

    public void setRegexp(String regexp) {
        this.regexp = regexp;
    }

    public abstract void checkRegexp(String input);
}
