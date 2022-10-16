package bubble.test.ex04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		initListener();
		setVisible(true);
	}

	public void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));

		// backgroundMap.setSize(100,100);
		// backgroundMap.setLocation(300, 300);
		// backgroundMap.setSize(1000,600);
		setContentPane(backgroundMap);
		player = new Player();
		add(player);
		// getContentPane().add(backgroundMap); //JFrame의 JLABEL이 그려진다.

	}

	public void initSetting() {
		setSize(1000, 640);
		setLayout(null); // absolute 레이아웃 (자유롭게 그림을 그릴 수 있다.)

		setLocationRelativeTo(null); // 실행되는 프로그램의 위치를 조정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌때 JVM 같이 종료
	}

	private void initListener() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				//System.out.println(e.getKeyCode());
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if(!player.isLeft()) {
						player.left();
					}
					
					break;
				case KeyEvent.VK_RIGHT:
					if(!player.isRight()) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
			
				}
			};
			//키보드 해제 이벤트 핸들러
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
