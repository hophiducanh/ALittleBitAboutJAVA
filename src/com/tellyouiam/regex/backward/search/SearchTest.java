package com.tellyouiam.regex.backward.search;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.MatchResult;

//https://stackoverflow.com/questions/2355293/how-to-use-a-regex-to-search-backwards-effectively
public class SearchTest extends JPanel implements ActionListener {
	
	protected JScrollPane scrollPane;
	protected JTextArea textArea;
	protected boolean docChanged = true;
	protected Search searcher;
	
	public SearchTest() {
		super(new BorderLayout());
		
		searcher = new Search("");
		
		JButton backButton = new JButton("Search backward");
		JButton fwdButton  = new JButton("Search forward");
		
		JPanel buttonPanel = new JPanel(new BorderLayout());
		buttonPanel.add(fwdButton, BorderLayout.EAST);
		buttonPanel.add(backButton, BorderLayout.WEST);
		
		textArea = new JTextArea("Big long text here to be searched...", 20, 40);
		textArea.setEditable(true);
		scrollPane = new JScrollPane(textArea);
		
		final JTextField textField = new JTextField(40);
		
		//Add Components to this panel.
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		add(textField, BorderLayout.SOUTH);
		
		//Add actions
		backButton.setActionCommand("back");
		fwdButton.setActionCommand("fwd");
		backButton.addActionListener(this);
		fwdButton.addActionListener(this);
		
		textField.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final String pattern = textField.getText();
				searcher.setPattern(pattern);
			}
		} );
		
		textArea.getDocument().addDocumentListener( new DocumentListener() {
			public void insertUpdate(DocumentEvent e) { docChanged = true; }
			public void removeUpdate(DocumentEvent e) { docChanged = true; }
			public void changedUpdate(DocumentEvent e) { docChanged = true; }
		});
	}
	
	public void actionPerformed(ActionEvent e)  {
		
		if ( docChanged ) {
			final String newDocument = textArea.getText();
			searcher.setText(newDocument);
			docChanged = false;
		}
		
		MatchResult where = null;
		
		if ("back".equals(e.getActionCommand())) {
			where = searcher.searchBackward();
		} else if ("fwd".equals(e.getActionCommand())) {
			where = searcher.searchForward();
		}
		
		textArea.getHighlighter().removeAllHighlights();
		
		if (where != null) {
			final int start = where.start();
			final int end   = where.end();
			// highligh result and scroll
			try {
				textArea.getHighlighter().addHighlight(start, end, new DefaultHighlighter.DefaultHighlightPainter(Color.yellow));
			} catch (BadLocationException excp) {}
			textArea.scrollRectToVisible(new Rectangle(0, 0, scrollPane.getViewport().getWidth(), scrollPane.getViewport().getHeight()));
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() { textArea.setCaretPosition(start); }
			});
		} else if (where == null) {
			// no match, so let's wrap around
			if ("back".equals(e.getActionCommand())) {
				searcher.setSearchOffset( searcher.getText().length() -1 );
			} else if ("fwd".equals(e.getActionCommand())) {
				searcher.setSearchOffset(0);
			}
		}
	}
	
	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("SearchTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add contents to the window.
		frame.add(new SearchTest());
		
		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
		Search s = new Search("Big long text here to be searched");
		//s.setPattern("(\\w)");

		// search backwards or forward as many times as you like,
		// the class keeps track where the last match was
		MatchResult where = s.searchBackward();
		where = s.searchBackward(); // next match
		where = s.searchBackward(); // next match
		
		//or search forward
		where = s.searchForward();
		where = s.searchForward();
	}
}
