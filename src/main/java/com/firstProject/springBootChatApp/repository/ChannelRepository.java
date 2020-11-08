package com.firstProject.springBootChatApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.firstProject.springBootChatApp.formbeans.Channel;

@Repository
public interface ChannelRepository extends MongoRepository<Channel, Integer> {

}
