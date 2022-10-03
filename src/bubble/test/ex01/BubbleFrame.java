package bubble.test.ex01;

import javax.swing.JFrame;

// 1. 윈도우 창이 되었음.
// 2. 윈도우 창은 내부에 패널을 하나 가지고 있다.

public class BubbleFrame extends JFrame{
	
	public BubbleFrame() {
		setSize(1000,640);
		setVisible(true); //그림을 그리는 패널! 
		//창을 계속 켜놓고 있으면 함수에서 while문이 계속 돌고 있음.
	}
	
	public static void main(String[] args) {
		new BubbleFrame();
	}

}
