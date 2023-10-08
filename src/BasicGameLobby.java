// Concrete Component: BasicGameLobby
class BasicGameLobby implements GameLobby {
    @Override
    public void startGame() {
        System.out.println("Game started!");
    }

    @Override
    public void managePlayer(String playerName, boolean join) {
        if (join) {
            System.out.println(playerName + " joined the lobby.");
        } else {
            System.out.println(playerName + " left the lobby.");
        }
    }
}