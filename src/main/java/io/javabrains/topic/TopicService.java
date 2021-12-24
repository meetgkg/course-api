package io.javabrains.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java 8 Language Framework", "Java 8 Programminga Language Description"),
			new Topic("aws", "Amazon WebServices", "How to use Amazon WebServices")));

	public List<Topic> getAllTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public List<Topic> addTopic(Topic topic) {
		topics.add(topic);
		return topics;
	}

	public List<Topic> updateTopic(Topic topic, String id) {
		for(int i=0; i< topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				break;
			}
		}
		return topics;
	}

	public List<Topic> deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return topics;
	}
	
}
