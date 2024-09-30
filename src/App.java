// A program kiírással szimulál egy hálózathoz való csatlakozást, a Connectable interface segítségével. 
//Lévai Balázs István
//2024-09-30
//SZOFT II/1/N

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lévai Balázs István, SZOFT II/1/N");

        Network network = new Network();
        network.connectToNetwork("Facebook");
        network.disconnectFromNetwork();
    }
}
