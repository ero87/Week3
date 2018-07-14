package com.example.ero.week3homework1;

import java.util.ArrayList;
import java.util.List;

public class MyProvider {

    public static List<ChatModel> getChatList() {

        List<ChatModel> listChat = new ArrayList<>();

        ChatModel chatModel1 = new ChatModel("ELIZABETH", "L O V E", "http://shymagazine.com/shy/wp-content/uploads/2011/09/elizabeth-olsen-gq.jpg");
        ChatModel chatModel2 = new ChatModel("ZETA-JONES", "L O V E", "http://www.bestfunnypic.com/data/girl/2018-03-16_catherine-zeta-jones.jpg");
        ChatModel chatModel3 = new ChatModel("JOHANSSON", "L O V E", "https://sfvmedia.com/wp-content/uploads/2018/01/bigstock-BERLIN-FEBRUARY-Scarlett-105282479.jpg");
        ChatModel chatModel4 = new ChatModel("CHARLIZE", "L O V E", "http://app.hamariweb.com/iphoneimg/large.php?s=http://nation.com.pk/print_images/large/2016-04-05/it-s-hard-being-gorgeous-actress-theron-1459878433-4952.jpg");
        ChatModel chatModel5 = new ChatModel("MEGAN FOX", "L O V E", "https://m.media-amazon.com/images/M/MV5BMTc5MjgyMzk4NF5BMl5BanBnXkFtZTcwODk2OTM4Mg@@._V1_UY317_CR4,0,214,317_AL_.jpg");
        ChatModel chatModel6 = new ChatModel("SALMA HAYEK", "L O V E", "https://media1.popsugar-assets.com/files/thumbor/q5ekovuYSxwPAvAhb9MaTrWFkyI/fit-in/2048xorig/filters:format_auto-!!-:strip_icc-!!-/upl2/0/88/09_2009/56860411/i/Photos-Salma-Hayek-Hosting-Book-Launch-Beso-LA.jpg");
        ChatModel chatModel7 = new ChatModel("ALYSSA MILANO", "L O V E", "https://dvdbash.files.wordpress.com/2012/03/alyssa-milano-look-dvdbash10.jpg");

        listChat.add(chatModel1);
        listChat.add(chatModel2);
        listChat.add(chatModel3);
        listChat.add(chatModel4);
        listChat.add(chatModel5);
        listChat.add(chatModel6);
        listChat.add(chatModel7);

        return listChat;
    }
}
