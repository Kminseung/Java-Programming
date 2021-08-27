package Abstract;

public class PlayerMain extends Player {

	public static void main(String[] args) {
		
		PlayerMain player = new PlayerMain();
		player.play("Joakim Karud - Might Love");
		player.pause();
		player.stop();
		
	}

	@Override
	void play(String songName) {
		System.out.println(songName + "곡을 재생합니다.");
	}

	@Override
	void pause() {
		System.out.println("곡을 일시정지합니다.");
	}

	@Override
	void stop() {
		System.out.println("곡을 정지합니다.");
	}

}
