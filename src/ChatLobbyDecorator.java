// Concrete Decorator: ChatLobbyDecorator
class ChatLobbyDecorator implements LobbyDecorator {
    private GameLobby decoratedLobby;

    public ChatLobbyDecorator(GameLobby decoratedLobby) {
        this.decoratedLobby = decoratedLobby;
    }

    @Override
    public void startGame() {
        decoratedLobby.startGame();
    }

    @Override
    public void managePlayer(String playerName, boolean join) {
        decoratedLobby.managePlayer(playerName, join);
    }

    @Override
    public void chat(String message) {
        System.out.println("Chat message: " + message);
    }
}
