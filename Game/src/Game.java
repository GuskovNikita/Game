import javax.swing.JFrame;

public class Game extends JFrame{

    public Game() {
        add(new Structure());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setTitle("Игра");
        game.setSize(380,420);
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }
}