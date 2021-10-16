package lockersPvtLtd;

public class ScreenServiceProvider {
	

	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptions FileOptions = new FileOptions();
    
    

    public static View CurrentScreen = WelcomeScreen;

    
    public static View getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(View currentScreen) {
        CurrentScreen = currentScreen;
    }
    

}
