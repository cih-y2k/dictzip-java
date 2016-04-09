package org.dict.zip.cli;

import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.*;

/**
 * Created by Hiroshi Miura on 16/04/09.
 * @author Hiroshi Miura
 */
public class StaticUtilsTest {
    @Test
    public void testIsFileBinaryEquals() throws Exception {
        System.out.println("isFileBinaryEquals");
        File firstFile = new File(this.getClass().getResource("/test_util.txt").getFile());
        File secondFile = new File(this.getClass().getResource("/test_util1.txt").getFile());
        assertTrue(StaticUtils.isFileBinaryEquals(firstFile, secondFile));
    }

    @Test
    public void testIsFileBinaryEquals_false() throws Exception {
        System.out.println("isFileBinaryEquals_false");
        File firstFile = new File(this.getClass().getResource("/test_util.txt").getFile());
        File secondFile = new File(this.getClass().getResource("/test_util2.txt").getFile());
        assertFalse(StaticUtils.isFileBinaryEquals(firstFile, secondFile));
    }

    @Test
    public void testIsFileBinaryEquals_range() throws Exception {
        System.out.println("isFileBinaryEquals_range");
        File firstFile = new File(this.getClass().getResource("/test_util.txt").getFile());
        File secondFile = new File(this.getClass().getResource("/test_util2.txt").getFile());
        assertTrue(StaticUtils.isFileBinaryEquals(firstFile, secondFile, 10, 64));
    }

    @Test
    public void testIsFileBinaryEquals_range_false() throws Exception {
        System.out.println("isFileBinaryEquals_range_false");
        File firstFile = new File(this.getClass().getResource("/test_util.txt").getFile());
        File secondFile = new File(this.getClass().getResource("/test_util2.txt").getFile());
        assertFalse(StaticUtils.isFileBinaryEquals(firstFile, secondFile, 0, 64));
    }
}