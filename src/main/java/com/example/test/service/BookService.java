package com.example.test.service;

import com.example.test.bean.Book;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "test",containerFactory = "rabbitListenerContainerFactory")
    public void receive(Book book){
        System.out.println("监听消息！！" + book.getName());
    }
}
