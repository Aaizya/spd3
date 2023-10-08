public class Main{
    public static void main(String[] args) {
        // Create a basic game lobby
        GameLobby basicLobby = new BasicGameLobby();
        basicLobby.startGame();
        basicLobby.managePlayer("Player 1", true);

        // Create a game lobby with chat
        LobbyDecorator lobbyWithChat = new ChatLobbyDecorator(basicLobby);
        lobbyWithChat.startGame();
        lobbyWithChat.managePlayer("Player 2", true);
        lobbyWithChat.chat("Hello, everyone!");
    }
}
