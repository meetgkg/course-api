package io.javabrains.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopiController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Java 8 Language Framework", "Java 8 Programminga Language Description"),
				new Topic("aws", "Amazon WebServices", "How to use Amazon WebServices"));
	}

}
