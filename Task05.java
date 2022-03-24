package GroupProject.PJ02;

public class Task05 {
    public static void main(String[] args) {
        RemoteWedDriver[] browsers={ new ChromeDriver(), new FirefoxDrive(), new SafariDriver()};
        for (RemoteWedDriver b:browsers){
            b.open();
            b.close();
            b.getTitle();
            b.getScreenshot();
            b.navigate();
        }
    }
}

interface WedDriver{
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot{
    void getScreenshot();
}

interface RemoteWedDriver extends WedDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWedDriver{
    @Override
    public void open() {
        System.out.println("Open ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("Close ChromeDriver");
    }

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screenshot of ChromeDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to ChromeDriver");
    }
}

class FirefoxDrive implements RemoteWedDriver{
    @Override
    public void open() {
        System.out.println("Open FirefoxDrive");
    }

    @Override
    public void close() {
        System.out.println("Close FirefoxDrive");
    }

    @Override
    public String getTitle() {
        return "FirefoxDrive";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screenshot of FirefoxDrive");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to FirefoxDrive");
    }
}

class SafariDriver implements RemoteWedDriver{
    @Override
    public void open() {
        System.out.println("Open SafariDriver");
    }

    @Override
    public void close() {
        System.out.println("Close SafariDriver");
    }

    @Override
    public String getTitle() {
        return "SafariDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screenshot of SafariDriver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to SafariDriver");
    }
}