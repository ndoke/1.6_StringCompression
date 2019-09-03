package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCompressionTest {
    StringCompression stringCompression = new StringCompression();

    @Test
    public void test() {
        Assert.assertEquals(stringCompression.compressString("abbbbbbbcddde"), "a1b7c1d3e1");
        Assert.assertEquals(stringCompression.compressString("abcde"), "abcde");
        Assert.assertEquals(stringCompression.compressString("aaaaa"), "a5");
        Assert.assertEquals(stringCompression.compressString("aabbccddee"), "aabbccddee");
    }
}
