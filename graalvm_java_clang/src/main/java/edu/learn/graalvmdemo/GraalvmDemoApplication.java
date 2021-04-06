package edu.learn.graalvmdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GraalvmDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello World - Graal VM");

		try (Stream<Path> list = Files.list(Paths.get("/"))) {
			list.forEach(System.err::println);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
