package com.courseApi.data.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRespository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRespository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(String id) {
		return topicRespository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRespository.save(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		topicRespository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRespository.deleteById(id);
	}
}
