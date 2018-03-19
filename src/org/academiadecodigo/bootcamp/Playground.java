package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Playground implements KeyboardHandler{

    public final int WIDTH = 500;


    public void play() throws InterruptedException{
        Rectangle rectangle = new Rectangle(10,10, WIDTH,400);
        rectangle.draw();

    Rectangle miniRect = new Rectangle(80, 200, 20, 20);
    miniRect.draw();
    miniRect.setColor(Color.DARK_GRAY);

    miniRect.fill();
    Rectangle bigRect = new Rectangle(90, 90, 50,50);
    bigRect.draw();



    //Picture picture = new Picture(0,0,"pexels-photo-129441.jpeg");
    //picture.draw();

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_LEFT);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent event1 = new KeyboardEvent();
        event1.setKey(KeyboardEvent.KEY_RIGHT);
        event1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(event);
        keyboard.addEventListener(event1);

        System.out.println(miniRect.getX() + " the X | " + miniRect.getY() + " the Y| ");
        Thread.sleep(5);
        miniRect.translate(10, 10);
        System.out.println(miniRect.getX() + " the X | " + miniRect.getY() + " the Y| ");

        bigRect.translate(50,50);

        Thread.sleep(5);
        miniRect.grow(20, 20);
        Thread.sleep(2);
        miniRect.grow(-30, -30);
        Thread.sleep(5);
        miniRect.grow(-10, -10);
        miniRect.grow(50, 50);



    }


    }




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                System.out.println("zzz zzz");
                break;
            case KeyboardEvent.KEY_LEFT:
                System.out.println("dorme dorme");
                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
