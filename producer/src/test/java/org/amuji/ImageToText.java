package org.amuji;

import org.apache.commons.io.IOUtils;
import org.apache.tools.ant.filters.StringInputStream;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 * Xiangrong Yang
 * 16/10/2017
 */
public class ImageToText {
    @Test
    public void name() throws Exception {
        InputStream is = this.getClass().getResourceAsStream("/test.png");

        byte[] bytes = IOUtils.toByteArray(is);
        String s = new String(bytes, "UTF-8");
//        String txt = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining("\n"));
    }
}
