package com.wealth.certificate.dumps_1z0_809_ert.question057;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
	
	private static final Path PATH = Paths.get(System.getProperty("user.dir"), "src", "main", "java", "com","wealth","certificate","dumps_1z0_809_ert","question057");

	/*
	/sports/info.txt 
	/sports/cricket/players.txt 
	/sports/cricket/data/ODI.txt 
	*/
	
	public static void main(String[] args) throws IOException {
		int maxDepth = 0;
		Stream<Path> paths = Files
							.find(
									PATH.resolve("sports"),
									maxDepth, 
									(p, a) -> { System.out.println(p.getFileName().toString());
												return p.getFileName().toString().endsWith("txt"); 
									}
									,FileVisitOption.FOLLOW_LINKS
								);
		long fCount = paths.count();
		System.out.println(fCount);
	}

}
