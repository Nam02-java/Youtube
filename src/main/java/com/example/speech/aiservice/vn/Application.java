//package com.example.speech.aiservice.vn;


import com.example.speech.aiservice.vn.model.entity.chapter.Chapter;
import com.example.speech.aiservice.vn.model.entity.novel.Novel;
import com.example.speech.aiservice.vn.model.repository.chapter.ChapterRepository;
import com.example.speech.aiservice.vn.model.repository.novel.NovelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Optional;

//@SpringBootApplication
//public class Application {
//
//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(Application.class, args);
//
//        ShutdownHandler shutdownHandler = context.getBean(ShutdownHandler.class);
//        Runtime.getRuntime().addShutdownHook(shutdownHandler);
//    }
//
//    @Bean
//    public CommandLineRunner addChapters(ChapterRepository chapterRepo, NovelRepository novelRepo) {
//        return args -> {
//            Optional<Novel> novelOpt = novelRepo.findById(389L);
//            if (novelOpt.isEmpty()) {
//                System.out.println("Novel with ID 391 not found.");
//                return;
//            }
//            Novel novel = novelOpt.get();
//
//            for (int i = 1; i <= 102; i++) {
//                Chapter chapter = new Chapter(novel, i, String.valueOf(i), String.valueOf(i));
//                chapter.setScanned(true);
//                chapterRepo.save(chapter);
//
//                if (i % 100 == 0) {
//                    System.out.println("Inserted chapter: " + i);
//                }
//            }
//
//            System.out.println("✅ Finished inserting 2057 chapters for novel ID 391.");
//        };
//    }
//}
