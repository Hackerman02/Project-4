import javax.swing.*;
import java.awt.*;
import java.math.*;

/**
 * Draws clockface, ticks and hands themselves
 */
class Draw extends JPanel {
    int seconds, minutes, hours;

    /**
     * Initialises seconds, minutes and hours, as well as clockface
     * @param seconds
     * @param minutes
     * @param hours
     */
    public Draw(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        setSize(1280, 720);
        setVisible(true);
    }

    /**
     * Draws individual ticks and other components of clockface, as well as clock hands
     * @param g
     */
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        Graphics2D circle = (Graphics2D)g.create();
        Graphics2D hand1 = (Graphics2D)g.create();
        Graphics2D hand2 = (Graphics2D)g.create();
        Graphics2D hand3 = (Graphics2D)g.create();
        Graphics2D hand4 = (Graphics2D)g.create();
        Graphics2D hand5 = (Graphics2D)g.create();
        Graphics2D hand6 = (Graphics2D)g.create();
        Graphics2D hand7 = (Graphics2D)g.create();
        Graphics2D hand8 = (Graphics2D)g.create();
        Graphics2D hand9 = (Graphics2D)g.create();
        Graphics2D hand10 = (Graphics2D)g.create();
        Graphics2D hand11 = (Graphics2D)g.create();
        Graphics2D hand12 = (Graphics2D)g.create();
        Graphics2D secondHand = (Graphics2D)g.create();
        Graphics2D minuteHand = (Graphics2D)g.create();
        Graphics2D hourHand = (Graphics2D)g.create();

        // Draws centre dot and all 'ticks'
        int centreWidth = getWidth()/2;
        int centreHeight = getHeight()/2;
        int mainWidth = centreWidth-3; // To account for half of rectangle width
        int mainHeight = 70; // Centralised height
        // Centre dot
        circle.fillOval(centreWidth-4, centreHeight-4, 8, 8);
        // All ticks
        hand1.fillRect(mainWidth, mainHeight, 6, 50);

        hand2.rotate(Math.toRadians(30), centreWidth, centreHeight);
        hand2.fillRect(mainWidth, mainHeight, 6, 50);

        hand3.rotate(Math.toRadians(60), centreWidth, centreHeight);
        hand3.fillRect(mainWidth, mainHeight, 6, 50);

        hand4.rotate(Math.toRadians(90), centreWidth, centreHeight);
        hand4.fillRect(mainWidth, mainHeight, 6, 50);

        hand5.rotate(Math.toRadians(120), centreWidth, centreHeight);
        hand5.fillRect(mainWidth, mainHeight, 6, 50);

        hand6.rotate(Math.toRadians(150), centreWidth, centreHeight);
        hand6.fillRect(mainWidth, mainHeight, 6, 50);

        hand7.rotate(Math.toRadians(180), centreWidth, centreHeight);
        hand7.fillRect(mainWidth, mainHeight, 6, 50);

        hand8.rotate(Math.toRadians(210), centreWidth, centreHeight);
        hand8.fillRect(mainWidth, mainHeight, 6, 50);

        hand9.rotate(Math.toRadians(240), centreWidth, centreHeight);
        hand9.fillRect(mainWidth, mainHeight, 6, 50);

        hand10.rotate(Math.toRadians(270), centreWidth, centreHeight);
        hand10.fillRect(mainWidth, mainHeight, 6, 50);

        hand11.rotate(Math.toRadians(300), centreWidth, centreHeight);
        hand11.fillRect(mainWidth, mainHeight, 6, 50);

        hand12.rotate(Math.toRadians(330), centreWidth, centreHeight);
        hand12.fillRect(mainWidth, mainHeight, 6, 50);

        // Draws hour, minute and second hands
        secondHand.setColor(Color.red);
        secondHand.rotate(Math.toRadians(seconds*6), centreWidth, centreHeight);
        secondHand.fillRect(centreWidth, centreHeight-240, 2, 240);

        minuteHand.setColor(Color.LIGHT_GRAY);
        minuteHand.rotate(Math.toRadians(minutes*6), centreWidth, centreHeight);
        minuteHand.fillRect(centreWidth, centreHeight-200, 4, 200);

        hourHand.setColor(Color.black);
        hourHand.rotate(Math.toRadians(hours*30), centreWidth, centreHeight);
        hourHand.fillRect(centreWidth, centreHeight-100, 5, 100);
    }
}