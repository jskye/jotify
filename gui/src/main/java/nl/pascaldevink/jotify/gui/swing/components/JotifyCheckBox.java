package nl.pascaldevink.jotify.gui.swing.components;

import javax.swing.JCheckBox;

import nl.pascaldevink.jotify.gui.swing.plaf.JotifyCheckboxUI;

@SuppressWarnings("serial")
public class JotifyCheckBox extends JCheckBox {
	public JotifyCheckBox(){
		this(null);
	}

	public JotifyCheckBox(String text){
		super(text);
		
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setOpaque(false);
		this.setUI(new JotifyCheckboxUI());
	}
}
