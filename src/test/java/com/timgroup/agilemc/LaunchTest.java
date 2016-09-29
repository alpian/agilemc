package com.timgroup.agilemc;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class LaunchTest {
    @Test public void
    stuff() {
        MatcherAssert.assertThat("Jeff", CoreMatchers.equalTo("Ian"));
    }
}
