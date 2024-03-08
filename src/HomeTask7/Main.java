package HomeTask7;

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        Logger logger = new Logger();

        try {
            userInterface.run();
        } catch (Exception e) {
            logger.log("Произошла ошибка: " + e.getMessage());
            System.out.println("Произошла ошибка.");
        } finally {
            logger.close();
        }
    }
}