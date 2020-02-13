package ru.spingcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//в классе тестируем работу spring фреймворка
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
        //внедрение зависимости вручную - в конструктор (жанр музыки)
//        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
