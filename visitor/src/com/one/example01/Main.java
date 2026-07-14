package com.one.example01;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("visitor\\src\\com\\one\\example01");
        Files.walkFileTree(file.toPath(), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("访问的文件名:" + file.getFileName());
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
