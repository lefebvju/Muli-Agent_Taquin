public class Main {

    final static int NBAGENT = 15;

    public static void main(String[] args) {

        Grille g = new Grille(5,5);
        vueTaquin vue = new vueTaquin(g, NBAGENT);

        g.addObserver(vue);
        vue.setVisible(true);
        //g.init(NBAGENT);
        // Messagerie m = new Messagerie();
        // Agent[] tabAgent = new Agent[NBAGENT];

        // for (int i = 0; i < NBAGENT; i++) {
        //     Position p1;
        //     do {
        //         p1 = Position.random(g.getSizeX(), g.getSizeY());
        //     } while (!g.isFree(p1));
        //     Position p2;
        //     do {
        //         p2 = Position.random(g.getSizeX(), g.getSizeY());
        //     } while (!g.isFreeTarget(p2));
        //     tabAgent[i] = new Agent(p1, p2, g, i, m);

        // }

        // for (int i = 0; i < NBAGENT; i++) {
        //     tabAgent[i].start();
        // }

        System.out.println(g.toString());
        System.out.println("Hello world !");
    }
}
