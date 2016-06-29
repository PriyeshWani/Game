package com.game;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class GameApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		GameController controller = new GameController();
		controller.startGame("localhost");
	}
}
