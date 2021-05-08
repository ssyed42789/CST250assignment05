/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250assignment05;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;

/**
 *
 * @author ssyed
 */
public class Countwords {
    
     public void countWords(final Path file) throws IOException {
    Arrays.stream(new String(Files.readAllBytes(file), StandardCharsets.UTF_8).split("\\W+"))
        .collect(Collectors.groupingBy(Function.<String>identity(), TreeMap::new, counting())).entrySet()
        .forEach(System.out::println);
     }
    
}
