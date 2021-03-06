package nl.pascaldevink.jotify.gui.swing.components;

import javax.swing.JButton;

import nl.pascaldevink.jotify.gui.swing.plaf.JotifyCloseButtonUI;

@SuppressWarnings("serial")
public class JotifyCloseButton extends JButton {
	public JotifyCloseButton(){
		this.setBorderPainted(false);
		this.setContentAreaFilled(false);
		this.setOpaque(false);
		this.setUI(new JotifyCloseButtonUI());
	}
}
