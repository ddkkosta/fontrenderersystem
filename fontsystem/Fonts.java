//             FontSystem with colorcodes
//     By N3Kostya_
//     Copyright (c) 2021



// Font loader class

package me.n3kostya.unix.ui.fontsystem;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class Fonts {
	
	public static NewFontRenderer getFont(String filename, int size) {
		InputStream is = Fonts.class.getResourceAsStream("font/" + filename);
		
		Font font = null;
		
		try {
			font = Font.createFont(0, is);
		}
		catch(FontFormatException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		NewFontRenderer unicodefont = new NewFontRenderer(font.deriveFont((float) size));
		return unicodefont;
	}
	
	public static enum FontType {
		EMBOSS_BOTTOM, EMBOSS_TOP, NORMAL, OUTLINE_THIN, SHADOW_THICK, SHADOW_THIN; 
	}
	
}
