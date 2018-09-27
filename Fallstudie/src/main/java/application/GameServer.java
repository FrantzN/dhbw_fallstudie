package application;

import java.net.InetSocketAddress;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class GameServer extends WebSocketServer {

	public GameServer(InetSocketAddress address) {
		super(address);
	}
	
	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {

	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		System.out.printf("Message: %s\tfrom: %s", message, conn);
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart() {
		System.out.println("Server started");
	}

}
