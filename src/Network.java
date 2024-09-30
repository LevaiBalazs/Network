public  class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connecting to " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Disconnecting from network");
    }
}
