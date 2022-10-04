import java.awt.*;
import java.awt.Robot.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Toolkit;


public class SPAM
{
    public static void main (String[]args) throws AWTException, InterruptedException {
        int x = 1;

        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String Text = scanner.nextLine();

        StringSelection stringSelection = new StringSelection(Text);
        java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,
                null);

        System.out.println("The spamming will start in 5 seconds");
        Thread.sleep(5000);

        while(x <= 10) {

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

            x++;
        }
    }
}
