import javax.lang.model.util.SimpleElementVisitor6;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

/**
 * Main class
 * Updates clock face & hours, minutes, seconds hands
 */
public class Main extends JFrame
{
    /**
     * Draws new JFrame window
     * Updates clockface and hour, minute, second hands
     * Hands are updated to computer's local time
     */
    public Main()
    {
        // Initialises window
        setTitle("Analogue Clock");
        setSize(1280, 720);
        setLocation(1366/2-640, 768/2-360);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Gets computer's local time
        Date date = new Date();
        SimpleDateFormat secs = new SimpleDateFormat("s");
        SimpleDateFormat mins = new SimpleDateFormat("m");
        SimpleDateFormat hrs = new SimpleDateFormat("h");
        int seconds = Integer.parseInt(secs.format(date));
        int minutes = Integer.parseInt(mins.format(date));
        int hours = Integer.parseInt(hrs.format(date));
        // New instance of JPanel and calls Draw (for clockface)
        JPanel panel = new Draw(seconds, minutes, hours);
        add(panel);
        // Updates clockface and hands
        while (true)
        {
            // Updates time
            date=new Date();
            seconds = Integer.parseInt(secs.format(date));
            minutes = Integer.parseInt(mins.format(date));
            hours = Integer.parseInt(hrs.format(date));

            JPanel panel1 = new Draw(seconds, minutes, hours);
            add(panel1);
            panel1.validate();
            panel1.repaint();
            // Slight delay in updating to stop clock hands from updating too quickly
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {

            }
        }
    }

    /**
     * Runs main function
     * @param args
     */
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}