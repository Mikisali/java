package Rysowanko;

import java.awt.Color;

public class Projekt1 {
	private static double _radius = 0.02f;
	private static boolean _p = false;
	private static double _xForText = 0.02f;
	public static void main(String[] args) {
		StdDraw.show();
		while(true)
		{
			if (StdDraw.hasNextKeyTyped()){
				char ch = StdDraw.nextKeyTyped();
				if (ch == '=') {
					_radius += 0.01f;
				}
				if (ch == 'p') {
					_p = true;
				}
				if (ch == '-') {
					if (_radius >= 0.02f)
					_radius -= 0.01f;
				}
				if (ch == 'c') {
					Color col = StdDraw.getPenColor();
					StdDraw.setPenColor(StdDraw.WHITE);
					StdDraw.filledCircle(0,0, 1);
					StdDraw.setPenColor(col);
				}
				if (ch == 's') {
					StdDraw.filledSquare(StdDraw.mouseX(), StdDraw.mouseY(), _radius);
				}
				if (ch == 'l') {
					StdDraw.line(StdDraw.mouseX() - 0.05, StdDraw.mouseY(), StdDraw.mouseX() + 0.05, StdDraw.mouseY());
				}
				if (ch == 't') {
					boolean warunek = false;
					while (!warunek) {
						warunek = TextWriting();
					}
				}
			}
			if (_p) {
				PenDrawing();
			}
		}
	}

	private static void PenDrawing() {
		if (StdDraw.isMousePressed()) {
			StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), _radius);
		}
	}
	private static boolean TextWriting() {
		if (StdDraw.hasNextKeyTyped()){
			char ch = StdDraw.nextKeyTyped();
			if (ch == '`') {
				return true;
			}else {
				StdDraw.text(_xForText, 0.5, Character.toString(ch));
				_xForText += 0.015f;
			}
			
		}
		return false;
			
	}

	
}
